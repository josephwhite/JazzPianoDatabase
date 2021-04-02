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
	public static final String[] NOTE_NAMES = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
	public int[][] arrayNotesByOctave; // [Notes C - B][(-1) to 9 octaves]
	public SongEntry[] spreadSheet;

	public static void main(String[] args) throws Exception {
		// Creates list of files from desktop folder with MIDI files.
		File dir = new File("INSERT DIRECTORY HERE");
		File[] fileList = dir.listFiles();
		SongEntry[] songEntries = new SongEntry[fileList.length - 1];
		// Lists song names.
		for (int i = 0; i < fileList.length - 1; i++) {
			songEntries[i] = new SongEntry(fileList[i].getAbsolutePath(), 0);
		}
		int totalNumberofNotes = 0;

		for (int start = 0; start < fileList.length - 1; start++) {
			// Imports each MIDI track into a Score data structure from JMusic to get the tracks tempo.
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

			int[][] arrayNotesByOctave = new int[NOTE_NAMES.length][11];

			for (Track track : sequence.getTracks()) {
				trackNumber++;
				for (int i = 0; i < track.size(); i++) {
					MidiEvent event = track.get(i);
					MidiMessage message = event.getMessage();
					if (message instanceof ShortMessage) {
						ShortMessage sm = (ShortMessage) message;
						if (sm.getCommand() == NOTE_ON) {
							int key = sm.getData1();
							int octave = (key / 12) - 1;
							int note = key % 12;
							arrayNotesByOctave[note][octave + 1]++;
							totalNumberofNotes++;

							if (key > highestNote) {
								highestNote = key;
								songEntries[start].setHighestNote("" + NOTE_NAMES[note] + octave);
							}
							if (key < lowestNote) {
								lowestNote = key;
								songEntries[start].setLowestNote("" + NOTE_NAMES[note] + octave);
							}
						} else {
							// System.out.println("Command:" + sm.getCommand());
						}
					} else if (message instanceof MetaMessage) {
						//do nothing
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
	 * 
	 * @param songEntries   List of songs
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

		int iteration = 7;
		for (int i = 0; i < 11; i++) { // octave
			for (int j = 0; j < 12; j++) { // notes
				cell = row.createCell(iteration);
				cell.setCellValue(aBook.notes[j][i]);
				iteration++;
			}
		}
	}
}
