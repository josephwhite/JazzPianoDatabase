import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import jm.music.data.Score;
import jm.util.Read;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.xmlbeans.XmlObject;
import org.apache.commons.collections4.*;
import org.apache.commons.compress.*;
import org.openxmlformats.schemas.*;

public class Scrapper {
	
	public static final int NOTE_ON = 0x90;
	public static final int NOTE_OFF = 0x80;
	public static final String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	public int[][] arrayNotesByOctave; //[Notes C - B][(-1) to 9 octaves]
	public SongEntry[] spreadSheet;
	public static void main(String[] args) throws Exception {
		//Creates list of files from desktop folder with MIDI files.
		File dir = new File("INSERT DIRECTORY HERE");
		File[] fileList = dir.listFiles();
		SongEntry[] songEntries = new SongEntry[fileList.length-1];
		//Lists song names.
		for (int i = 0; i < fileList.length-1; i++) {
			songEntries[i] = new SongEntry(fileList[i].getAbsolutePath(), 0);
		}
		int totalNumberofNotes = 0;
		
		for (int start = 0; start < fileList.length-1; start++) {
			//Imports each MIDI track into a Score data structure from JMusic to get the tracks tempo.
			Score score = new Score("haha");
			Read.midi(score, fileList[start].getAbsolutePath());
			double tempo = score.getTempo();
			songEntries[start].setBpm(tempo);
			
			totalNumberofNotes = 0;
			int highestNote = -200;
			int lowestNote = 500;
			System.out.println(fileList[start].getName());
			Sequence sequence = MidiSystem.getSequence(fileList[start]);
			int trackNumber = 0;

			int[][]arrayNotesByOctave = new int[NOTE_NAMES.length][11];
			
			for (Track track : sequence.getTracks()) {
				trackNumber++;
				for (int i=0; i < track.size(); i++) {
					MidiEvent event = track.get(i);
					MidiMessage message = event.getMessage();
					if (message instanceof ShortMessage) {
						ShortMessage sm = (ShortMessage) message;
						if (sm.getCommand() == NOTE_ON) {
							int key = sm.getData1();
							int octave = (key / 12)-1;
							int note = key % 12;
							arrayNotesByOctave[note][octave+1]++;
							totalNumberofNotes++;

							if (key > highestNote) {
								highestNote = key;
								songEntries[start].setHighestNote(""+ NOTE_NAMES[note] + octave);
							}
							if (key < lowestNote) {
								lowestNote = key;
								songEntries[start].setLowestNote(""+ NOTE_NAMES[note] + octave);
							}
						}
						else {
							//System.out.println("Command:" + sm.getCommand());
						}
					} else if (message instanceof MetaMessage) {
						
					}
				}
				System.out.println();
			}
			songEntries[start].setNotes(arrayNotesByOctave);
			songEntries[start].setTotalNotes(totalNumberofNotes);
		}
        String excelFilePath = "JavaPianoDataSheet.xls";
        writeExcel(songEntries, excelFilePath);
	}
	/**
	 * Writes the elements in each song to an Excel file
	 * @param songEntries List of songs
	 * @param excelFilePath Excel file
	 */
	private static void writeExcel(SongEntry[] songEntries, String excelFilePath) {
		Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	    int rowCount = 0;
	 
	    for (SongEntry aBook : songEntries) {
	        Row row = sheet.createRow(++rowCount);
	        writeSong(aBook, row);
	    }
	    
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeSong(SongEntry aBook, Row row) {
		Cell cell = row.createCell(1);
	    cell.setCellValue(aBook.getFilename());
	 
	    cell = row.createCell(2);
	    cell.setCellValue(aBook.getBpm());
	 
	    cell = row.createCell(3);
	    cell.setCellValue(aBook.getTotalNotes());
	    
	    cell = row.createCell(4);
	    cell.setCellValue(aBook.getHighestNote());
	    
	    cell = row.createCell(5);
	    cell.setCellValue(aBook.getLowestNote());
	    
	    cell = row.createCell(6);
	    cell.setCellValue(row.getRowNum());
	    
	    cell = row.createCell(7);
	    cell.setCellValue(aBook.getTotalCNeg1());
	    
	    cell = row.createCell(8);
	    cell.setCellValue(aBook.getTotalCSharpneg1());
	    
	    cell = row.createCell(9);
	    cell.setCellValue(aBook.getTotalDNeg1());
	    
	    cell = row.createCell(10);
	    cell.setCellValue(aBook.getTotalDSharpneg1());
	    
	    cell = row.createCell(11);
	    cell.setCellValue(aBook.getTotalEneg1());
	    
	    cell = row.createCell(12);
	    cell.setCellValue(aBook.getTotalFneg1());
	    
	    cell = row.createCell(13);
	    cell.setCellValue(aBook.getTotalFSharpneg1());
	    
	    cell = row.createCell(14);
	    cell.setCellValue(aBook.getTotalGneg1());
	    
	    cell = row.createCell(15);
	    cell.setCellValue(aBook.getTotalGSharpneg1());
	    
	    cell = row.createCell(16);
	    cell.setCellValue(aBook.getTotalAneg1());
	    
	    cell = row.createCell(17);
	    cell.setCellValue(aBook.getTotalASharpneg1());
	    
	    cell = row.createCell(18);
	    cell.setCellValue(aBook.getTotalBneg1());
	    //
	    cell = row.createCell(19);
	    cell.setCellValue(aBook.getTotalC0());
	    
	    cell = row.createCell(20);
	    cell.setCellValue(aBook.getTotalCSharp0());
	    
	    cell = row.createCell(21);
	    cell.setCellValue(aBook.getTotalD0());
	    
	    cell = row.createCell(22);
	    cell.setCellValue(aBook.getTotalDSharp0());
	    
	    cell = row.createCell(23);
	    cell.setCellValue(aBook.getTotalE0());
	    
	    cell = row.createCell(24);
	    cell.setCellValue(aBook.getTotalF0());
	    
	    cell = row.createCell(25);
	    cell.setCellValue(aBook.getTotalFSharp0());
	    
	    cell = row.createCell(26);
	    cell.setCellValue(aBook.getTotalG0());
	    
	    cell = row.createCell(27);
	    cell.setCellValue(aBook.getTotalGSharp0());
	    
	    cell = row.createCell(28);
	    cell.setCellValue(aBook.getTotalA0());
	    
	    cell = row.createCell(29);
	    cell.setCellValue(aBook.getTotalASharp0());
	    
	    cell = row.createCell(30);
	    cell.setCellValue(aBook.getTotalB0());
	    //
	    cell = row.createCell(31);
	    cell.setCellValue(aBook.getTotalC1());
	    
	    cell = row.createCell(32);
	    cell.setCellValue(aBook.getTotalCSharp1());
	    
	    cell = row.createCell(33);
	    cell.setCellValue(aBook.getTotalD1());
	    
	    cell = row.createCell(34);
	    cell.setCellValue(aBook.getTotalDSharp1());
	    
	    cell = row.createCell(35);
	    cell.setCellValue(aBook.getTotalE1());
	    
	    cell = row.createCell(36);
	    cell.setCellValue(aBook.getTotalF1());
	    
	    cell = row.createCell(37);
	    cell.setCellValue(aBook.getTotalFSharp1());
	    
	    cell = row.createCell(38);
	    cell.setCellValue(aBook.getTotalG1());
	    
	    cell = row.createCell(39);
	    cell.setCellValue(aBook.getTotalGSharp1());
	    
	    cell = row.createCell(40);
	    cell.setCellValue(aBook.getTotalA1());
	    
	    cell = row.createCell(41);
	    cell.setCellValue(aBook.getTotalASharp1());
	    
	    cell = row.createCell(42);
	    cell.setCellValue(aBook.getTotalB1());
	    //
	    cell = row.createCell(43);
	    cell.setCellValue(aBook.getTotalC2());
	    
	    cell = row.createCell(44);
	    cell.setCellValue(aBook.getTotalCSharp2());
	    
	    cell = row.createCell(45);
	    cell.setCellValue(aBook.getTotalD2());
	    
	    cell = row.createCell(46);
	    cell.setCellValue(aBook.getTotalDSharp2());
	    
	    cell = row.createCell(47);
	    cell.setCellValue(aBook.getTotalE2());
	    
	    cell = row.createCell(48);
	    cell.setCellValue(aBook.getTotalF2());
	    
	    cell = row.createCell(49);
	    cell.setCellValue(aBook.getTotalFSharp2());
	    
	    cell = row.createCell(50);
	    cell.setCellValue(aBook.getTotalG2());
	    
	    cell = row.createCell(51);
	    cell.setCellValue(aBook.getTotalGSharp2());
	    
	    cell = row.createCell(52);
	    cell.setCellValue(aBook.getTotalA2());
	    
	    cell = row.createCell(53);
	    cell.setCellValue(aBook.getTotalASharp2());
	    
	    cell = row.createCell(54);
	    cell.setCellValue(aBook.getTotalB2());
	    //
	    cell = row.createCell(55);
	    cell.setCellValue(aBook.getTotalC3());
	    
	    cell = row.createCell(56);
	    cell.setCellValue(aBook.getTotalCSharp3());
	    
	    cell = row.createCell(57);
	    cell.setCellValue(aBook.getTotalD3());
	    
	    cell = row.createCell(58);
	    cell.setCellValue(aBook.getTotalDSharp3());
	    
	    cell = row.createCell(59);
	    cell.setCellValue(aBook.getTotalE3());
	    
	    cell = row.createCell(60);
	    cell.setCellValue(aBook.getTotalF3());
	    
	    cell = row.createCell(61);
	    cell.setCellValue(aBook.getTotalFSharp3());
	    
	    cell = row.createCell(62);
	    cell.setCellValue(aBook.getTotalG3());
	    
	    cell = row.createCell(63);
	    cell.setCellValue(aBook.getTotalGSharp3());
	    
	    cell = row.createCell(64);
	    cell.setCellValue(aBook.getTotalA3());
	    
	    cell = row.createCell(65);
	    cell.setCellValue(aBook.getTotalASharp3());
	    
	    cell = row.createCell(66);
	    cell.setCellValue(aBook.getTotalB3());
	    //
	    cell = row.createCell(67);
	    cell.setCellValue(aBook.getTotalC4());
	    
	    cell = row.createCell(68);
	    cell.setCellValue(aBook.getTotalCSharp4());
	    
	    cell = row.createCell(69);
	    cell.setCellValue(aBook.getTotalD4());
	    
	    cell = row.createCell(70);
	    cell.setCellValue(aBook.getTotalDSharp4());
	    
	    cell = row.createCell(71);
	    cell.setCellValue(aBook.getTotalE4());
	    
	    cell = row.createCell(72);
	    cell.setCellValue(aBook.getTotalF4());
	    
	    cell = row.createCell(73);
	    cell.setCellValue(aBook.getTotalFSharp4());
	    
	    cell = row.createCell(74);
	    cell.setCellValue(aBook.getTotalG4());
	    
	    cell = row.createCell(75);
	    cell.setCellValue(aBook.getTotalGSharp4());
	    
	    cell = row.createCell(76);
	    cell.setCellValue(aBook.getTotalA4());
	    
	    cell = row.createCell(77);
	    cell.setCellValue(aBook.getTotalASharp4());
	    
	    cell = row.createCell(78);
	    cell.setCellValue(aBook.getTotalB4());
	    //
	    cell = row.createCell(79);
	    cell.setCellValue(aBook.getTotalC5());
	    
	    cell = row.createCell(80);
	    cell.setCellValue(aBook.getTotalCSharp5());
	    
	    cell = row.createCell(81);
	    cell.setCellValue(aBook.getTotalD5());
	    
	    cell = row.createCell(82);
	    cell.setCellValue(aBook.getTotalDSharp5());
	    
	    cell = row.createCell(83);
	    cell.setCellValue(aBook.getTotalE5());
	    
	    cell = row.createCell(84);
	    cell.setCellValue(aBook.getTotalF5());
	    
	    cell = row.createCell(85);
	    cell.setCellValue(aBook.getTotalFSharp5());
	    
	    cell = row.createCell(86);
	    cell.setCellValue(aBook.getTotalG5());
	    
	    cell = row.createCell(87);
	    cell.setCellValue(aBook.getTotalGSharp5());
	    
	    cell = row.createCell(88);
	    cell.setCellValue(aBook.getTotalA5());
	    
	    cell = row.createCell(89);
	    cell.setCellValue(aBook.getTotalASharp5());
	    
	    cell = row.createCell(90);
	    cell.setCellValue(aBook.getTotalB5());
	    //
	    cell = row.createCell(91);
	    cell.setCellValue(aBook.getTotalC6());
	    
	    cell = row.createCell(92);
	    cell.setCellValue(aBook.getTotalCSharp6());
	    
	    cell = row.createCell(93);
	    cell.setCellValue(aBook.getTotalD6());
	    
	    cell = row.createCell(94);
	    cell.setCellValue(aBook.getTotalDSharp6());
	    
	    cell = row.createCell(95);
	    cell.setCellValue(aBook.getTotalE6());
	    
	    cell = row.createCell(96);
	    cell.setCellValue(aBook.getTotalF6());
	    
	    cell = row.createCell(97);
	    cell.setCellValue(aBook.getTotalFSharp6());
	    
	    cell = row.createCell(98);
	    cell.setCellValue(aBook.getTotalG6());
	    
	    cell = row.createCell(99);
	    cell.setCellValue(aBook.getTotalGSharp6());
	    
	    cell = row.createCell(100);
	    cell.setCellValue(aBook.getTotalA6());
	    
	    cell = row.createCell(101);
	    cell.setCellValue(aBook.getTotalASharp6());
	    
	    cell = row.createCell(102);
	    cell.setCellValue(aBook.getTotalB6());
	    //
	    cell = row.createCell(103);
	    cell.setCellValue(aBook.getTotalC7());
	    
	    cell = row.createCell(104);
	    cell.setCellValue(aBook.getTotalCSharp7());
	    
	    cell = row.createCell(105);
	    cell.setCellValue(aBook.getTotalD7());
	    
	    cell = row.createCell(106);
	    cell.setCellValue(aBook.getTotalDSharp7());
	    
	    cell = row.createCell(107);
	    cell.setCellValue(aBook.getTotalE7());
	    
	    cell = row.createCell(108);
	    cell.setCellValue(aBook.getTotalF7());
	    
	    cell = row.createCell(109);
	    cell.setCellValue(aBook.getTotalFSharp7());
	    
	    cell = row.createCell(110);
	    cell.setCellValue(aBook.getTotalG7());
	    
	    cell = row.createCell(111);
	    cell.setCellValue(aBook.getTotalGSharp7());
	    
	    cell = row.createCell(112);
	    cell.setCellValue(aBook.getTotalA7());
	    
	    cell = row.createCell(113);
	    cell.setCellValue(aBook.getTotalASharp7());
	    
	    cell = row.createCell(114);
	    cell.setCellValue(aBook.getTotalB7());
	    //
	    cell = row.createCell(115);
	    cell.setCellValue(aBook.getTotalC8());
	    
	    cell = row.createCell(116);
	    cell.setCellValue(aBook.getTotalCSharp8());
	    
	    cell = row.createCell(117);
	    cell.setCellValue(aBook.getTotalD8());
	    
	    cell = row.createCell(118);
	    cell.setCellValue(aBook.getTotalDSharp8());
	    
	    cell = row.createCell(119);
	    cell.setCellValue(aBook.getTotalE8());
	    
	    cell = row.createCell(120);
	    cell.setCellValue(aBook.getTotalF8());
	    
	    cell = row.createCell(121);
	    cell.setCellValue(aBook.getTotalFSharp8());
	    
	    cell = row.createCell(122);
	    cell.setCellValue(aBook.getTotalG8());
	    
	    cell = row.createCell(123);
	    cell.setCellValue(aBook.getTotalGSharp8());
	    
	    cell = row.createCell(124);
	    cell.setCellValue(aBook.getTotalA8());
	    
	    cell = row.createCell(125);
	    cell.setCellValue(aBook.getTotalASharp8());
	    
	    cell = row.createCell(126);
	    cell.setCellValue(aBook.getTotalB8());
	    //
	    cell = row.createCell(127);
	    cell.setCellValue(aBook.getTotalC0());
	    
	    cell = row.createCell(128);
	    cell.setCellValue(aBook.getTotalCSharp0());
	    
	    cell = row.createCell(129);
	    cell.setCellValue(aBook.getTotalD0());
	    
	    cell = row.createCell(130);
	    cell.setCellValue(aBook.getTotalDSharp0());
	    
	    cell = row.createCell(131);
	    cell.setCellValue(aBook.getTotalE0());
	    
	    cell = row.createCell(132);
	    cell.setCellValue(aBook.getTotalF0());
	    
	    cell = row.createCell(133);
	    cell.setCellValue(aBook.getTotalFSharp0());
	    
	    cell = row.createCell(134);
	    cell.setCellValue(aBook.getTotalG0());
	    
	    cell = row.createCell(135);
	    cell.setCellValue(aBook.getTotalGSharp0());
	    
	    cell = row.createCell(136);
	    cell.setCellValue(aBook.getTotalA0());
	    
	    cell = row.createCell(137);
	    cell.setCellValue(aBook.getTotalASharp0());
	    
	    cell = row.createCell(138);
	    cell.setCellValue(aBook.getTotalB0());
	}
}
