
public class SongEntry {
	
	private String filename;
	private double bpm;
	
	int totalNotes;
	
	String lowestNote;
	String HighestNote;
	
	int totalCNeg1;
	int totalCSharpneg1;
	int totalDNeg1;
	int totalDSharpneg1;
	int totalEneg1;
	int totalFneg1;
	int totalFSharpneg1;
	int totalGneg1;
	int totalGSharpneg1;
	int totalAneg1;
	int totalASharpneg1;
	int totalBneg1;
	
	int totalC0;
	int totalCSharp0;
	int totalD0;
	int totalDSharp0;
	int totalE0;
	int totalF0;
	int totalFSharp0;
	int totalG0;
	int totalGSharp0;
	int totalA0;
	int totalASharp0;
	int totalB0;

	int totalC1;
	int totalCSharp1;
	int totalD1;
	int totalDSharp1;
	int totalE1;
	int totalF1;
	int totalFSharp1;
	int totalG1;
	int totalGSharp1;
	int totalA1;
	int totalASharp1;
	int totalB1;
	
	int totalC2;
	int totalCSharp2;
	int totalD2;
	int totalDSharp2;
	int totalE2;
	int totalF2;
	int totalFSharp2;
	int totalG2;
	int totalGSharp2;
	int totalA2;
	int totalASharp2;
	int totalB2;
	
	int totalC3;
	int totalCSharp3;
	int totalD3;
	int totalDSharp3;
	int totalE3;
	int totalF3;
	int totalFSharp3;
	int totalG3;
	int totalGSharp3;
	int totalA3;
	int totalASharp3;
	int totalB3;
	
	int totalC4;
	int totalCSharp4;
	int totalD4;
	int totalDSharp4;
	int totalE4;
	int totalF4;
	int totalFSharp4;
	int totalG4;
	int totalGSharp4;
	int totalA4;
	int totalASharp4;
	int totalB4;
	
	int totalC5;
	int totalCSharp5;
	int totalD5;
	int totalDSharp5;
	int totalE5;
	int totalF5;
	int totalFSharp5;
	int totalG5;
	int totalGSharp5;
	int totalA5;
	int totalASharp5;
	int totalB5;
	
	int totalC6;
	int totalCSharp6;
	int totalD6;
	int totalDSharp6;
	int totalE6;
	int totalF6;
	int totalFSharp6;
	int totalG6;
	int totalGSharp6;
	int totalA6;
	int totalASharp6;
	int totalB6;
	
	int totalC7;
	int totalCSharp7;
	int totalD7;
	int totalDSharp7;
	int totalE7;
	int totalF7;
	int totalFSharp7;
	int totalG7;
	int totalGSharp7;
	int totalA7;
	int totalASharp7;
	int totalB7;
	
	int totalC8;
	int totalCSharp8;
	int totalD8;
	int totalDSharp8;
	int totalE8;
	int totalF8;
	int totalFSharp8;
	int totalG8;
	int totalGSharp8;
	int totalA8;
	int totalASharp8;
	int totalB8;
	
	int totalC9;
	int totalCSharp9;
	int totalD9;
	int totalDSharp9;
	int totalE9;
	int totalF9;
	int totalFSharp9;
	int totalG9;
	int totalGSharp9;
	int totalA9;
	int totalASharp9;
	int totalB9;
	
	public SongEntry(String filename, double bpm, int totalNotes, int totalCNeg1, int totalCSharpneg1, int totalDNeg1,
			int totalDSharpneg1, int totalEneg1, int totalFneg1, int totalFSharpneg1, int totalGneg1,
			int totalGSharpneg1, int totalAneg1, int totalASherpneg1, int totalBneg1, int totalC0, int totalCSharp0,
			int totalD0, int totalDSharp0, int totalE0, int totalF0, int totalFSharp0, int totalG0, int totalGSharp0,
			int totalA0, int totalASharp0, int totalB0, int totalC1, int totalCSharp1, int totalD1, int totalDSharp1,
			int totalE1, int totalF1, int totalFSharp1, int totalG1, int totalGSharp1, int totalA1, int totalASharp1,
			int totalB1, int totalC2, int totalCSharp2, int totalD2, int totalDSharp2, int totalE2, int totalF2,
			int totalFSharp2, int totalG2, int totalGSharp2, int totalA2, int totalASharp2, int totalB2, int totalC3,
			int totalCSharp3, int totalD3, int totalDSharp3, int totalE3, int totalF3, int totalFSharp3, int totalG3,
			int totalGSharp3, int totalA3, int totalASharp3, int totalB3, int totalC4, int totalCSharp4, int totalD4,
			int totalDSharp4, int totalE4, int totalF4, int totalFSharp4, int totalG4, int totalGSharp4, int totalA4,
			int totalASharp4, int totalB4, int totalC5, int totalCSharp5, int totalD5, int totalDSharp5, int totalE5,
			int totalF5, int totalFSharp5, int totalG5, int totalGSharp5, int totalA5, int totalASharp5, int totalB5,
			int totalC6, int totalCSharp6, int totalD6, int totalDSharp6, int totalE6, int totalF6, int totalFSharp6,
			int totalG6, int totalGSharp6, int totalA6, int totalASharp6, int totalB6, int totalC7, int totalCSharp7,
			int totalD7, int totalDSharp7, int totalE7, int totalF7, int totalFSharp7, int totalG7, int totalGSharp7,
			int totalA7, int totalASharp7, int totalB7, int totalC8, int totalCSharp8, int totalD8, int totalDSharp8,
			int totalE8, int totalF8, int totalFSharp8, int totalG8, int totalGSharp8, int totalA8, int totalASharp8,
			int totalB8, int totalC9, int totalCSharp9, int totalD9, int totalDSharp9, int totalE9, int totalF9,
			int totalFSharp9, int totalG9, int totalGSharp9, int totalA9, int totalASharp9, int totalB9) {
		super();
		this.filename = filename;
		this.bpm = bpm;
		this.totalNotes = totalNotes;
		this.totalCNeg1 = totalCNeg1;
		this.totalCSharpneg1 = totalCSharpneg1;
		this.totalDNeg1 = totalDNeg1;
		this.totalDSharpneg1 = totalDSharpneg1;
		this.totalEneg1 = totalEneg1;
		this.totalFneg1 = totalFneg1;
		this.totalFSharpneg1 = totalFSharpneg1;
		this.totalGneg1 = totalGneg1;
		this.totalGSharpneg1 = totalGSharpneg1;
		this.totalAneg1 = totalAneg1;
		this.totalASharpneg1 = totalASherpneg1;
		this.totalBneg1 = totalBneg1;
		this.totalC0 = totalC0;
		this.totalCSharp0 = totalCSharp0;
		this.totalD0 = totalD0;
		this.totalDSharp0 = totalDSharp0;
		this.totalE0 = totalE0;
		this.totalF0 = totalF0;
		this.totalFSharp0 = totalFSharp0;
		this.totalG0 = totalG0;
		this.totalGSharp0 = totalGSharp0;
		this.totalA0 = totalA0;
		this.totalASharp0 = totalASharp0;
		this.totalB0 = totalB0;
		this.totalC1 = totalC1;
		this.totalCSharp1 = totalCSharp1;
		this.totalD1 = totalD1;
		this.totalDSharp1 = totalDSharp1;
		this.totalE1 = totalE1;
		this.totalF1 = totalF1;
		this.totalFSharp1 = totalFSharp1;
		this.totalG1 = totalG1;
		this.totalGSharp1 = totalGSharp1;
		this.totalA1 = totalA1;
		this.totalASharp1 = totalASharp1;
		this.totalB1 = totalB1;
		this.totalC2 = totalC2;
		this.totalCSharp2 = totalCSharp2;
		this.totalD2 = totalD2;
		this.totalDSharp2 = totalDSharp2;
		this.totalE2 = totalE2;
		this.totalF2 = totalF2;
		this.totalFSharp2 = totalFSharp2;
		this.totalG2 = totalG2;
		this.totalGSharp2 = totalGSharp2;
		this.totalA2 = totalA2;
		this.totalASharp2 = totalASharp2;
		this.totalB2 = totalB2;
		this.totalC3 = totalC3;
		this.totalCSharp3 = totalCSharp3;
		this.totalD3 = totalD3;
		this.totalDSharp3 = totalDSharp3;
		this.totalE3 = totalE3;
		this.totalF3 = totalF3;
		this.totalFSharp3 = totalFSharp3;
		this.totalG3 = totalG3;
		this.totalGSharp3 = totalGSharp3;
		this.totalA3 = totalA3;
		this.totalASharp3 = totalASharp3;
		this.totalB3 = totalB3;
		this.totalC4 = totalC4;
		this.totalCSharp4 = totalCSharp4;
		this.totalD4 = totalD4;
		this.totalDSharp4 = totalDSharp4;
		this.totalE4 = totalE4;
		this.totalF4 = totalF4;
		this.totalFSharp4 = totalFSharp4;
		this.totalG4 = totalG4;
		this.totalGSharp4 = totalGSharp4;
		this.totalA4 = totalA4;
		this.totalASharp4 = totalASharp4;
		this.totalB4 = totalB4;
		this.totalC5 = totalC5;
		this.totalCSharp5 = totalCSharp5;
		this.totalD5 = totalD5;
		this.totalDSharp5 = totalDSharp5;
		this.totalE5 = totalE5;
		this.totalF5 = totalF5;
		this.totalFSharp5 = totalFSharp5;
		this.totalG5 = totalG5;
		this.totalGSharp5 = totalGSharp5;
		this.totalA5 = totalA5;
		this.totalASharp5 = totalASharp5;
		this.totalB5 = totalB5;
		this.totalC6 = totalC6;
		this.totalCSharp6 = totalCSharp6;
		this.totalD6 = totalD6;
		this.totalDSharp6 = totalDSharp6;
		this.totalE6 = totalE6;
		this.totalF6 = totalF6;
		this.totalFSharp6 = totalFSharp6;
		this.totalG6 = totalG6;
		this.totalGSharp6 = totalGSharp6;
		this.totalA6 = totalA6;
		this.totalASharp6 = totalASharp6;
		this.totalB6 = totalB6;
		this.totalC7 = totalC7;
		this.totalCSharp7 = totalCSharp7;
		this.totalD7 = totalD7;
		this.totalDSharp7 = totalDSharp7;
		this.totalE7 = totalE7;
		this.totalF7 = totalF7;
		this.totalFSharp7 = totalFSharp7;
		this.totalG7 = totalG7;
		this.totalGSharp7 = totalGSharp7;
		this.totalA7 = totalA7;
		this.totalASharp7 = totalASharp7;
		this.totalB7 = totalB7;
		this.totalC8 = totalC8;
		this.totalCSharp8 = totalCSharp8;
		this.totalD8 = totalD8;
		this.totalDSharp8 = totalDSharp8;
		this.totalE8 = totalE8;
		this.totalF8 = totalF8;
		this.totalFSharp8 = totalFSharp8;
		this.totalG8 = totalG8;
		this.totalGSharp8 = totalGSharp8;
		this.totalA8 = totalA8;
		this.totalASharp8 = totalASharp8;
		this.totalB8 = totalB8;
		this.totalC9 = totalC9;
		this.totalCSharp9 = totalCSharp9;
		this.totalD9 = totalD9;
		this.totalDSharp9 = totalDSharp9;
		this.totalE9 = totalE9;
		this.totalF9 = totalF9;
		this.totalFSharp9 = totalFSharp9;
		this.totalG9 = totalG9;
		this.totalGSharp9 = totalGSharp9;
		this.totalA9 = totalA9;
		this.totalASharp9 = totalASharp9;
		this.totalB9 = totalB9;
	}

	public SongEntry(String filename, double bpm) {
		super();
		this.filename = filename;
		this.bpm = bpm;
		this.totalNotes = 0;
		this.totalCNeg1 = 0;
		this.totalCSharpneg1 = 0;
		this.totalDNeg1 = 0;
		this.totalDSharpneg1 = 0;
		this.totalEneg1 = 0;
		this.totalFneg1 = 0;
		this.totalFSharpneg1 = 0;
		this.totalGneg1 = 0;
		this.totalGSharpneg1 = 0;
		this.totalAneg1 = 0;
		this.totalASharpneg1 = 0;
		this.totalBneg1 = 0;
		this.totalC0 = 0;
		this.totalCSharp0 = 0;
		this.totalD0 = 0;
		this.totalDSharp0 = 0;
		this.totalE0 = 0;
		this.totalF0 = 0;
		this.totalFSharp0 = 0;
		this.totalG0 = 0;
		this.totalGSharp0 = 0;
		this.totalA0 = 0;
		this.totalASharp0 = 0;
		this.totalB0 = 0;
		this.totalC1 = 0;
		this.totalCSharp1 = 0;
		this.totalD1 = 0;
		this.totalDSharp1 = 0;
		this.totalE1 = 0;
		this.totalF1 = 0;
		this.totalFSharp1 = 0;
		this.totalG1 = 0;
		this.totalGSharp1 = 0;
		this.totalA1 = 0;
		this.totalASharp1 = 0;
		this.totalB1 = 0;
		this.totalC2 = 0;
		this.totalCSharp2 = 0;
		this.totalD2 = 0;
		this.totalDSharp2 = 0;
		this.totalE2 = 0;
		this.totalF2 = 0;
		this.totalFSharp2 = 0;
		this.totalG2 = 0;
		this.totalGSharp2 = 0;
		this.totalA2 = 0;
		this.totalASharp2 = 0;
		this.totalB2 = 0;
		this.totalC3 = 0;
		this.totalCSharp3 = 0;
		this.totalD3 = 0;
		this.totalDSharp3 = 0;
		this.totalE3 = 0;
		this.totalF3 = 0;
		this.totalFSharp3 = 0;
		this.totalG3 = 0;
		this.totalGSharp3 = 0;
		this.totalA3 = 0;
		this.totalASharp3 = 0;
		this.totalB3 = 0;
		this.totalC4 = 0;
		this.totalCSharp4 = 0;
		this.totalD4 = 0;
		this.totalDSharp4 = 0;
		this.totalE4 = 0;
		this.totalF4 = 0;
		this.totalFSharp4 = 0;
		this.totalG4 = 0;
		this.totalGSharp4 = 0;
		this.totalA4 = 0;
		this.totalASharp4 = 0;
		this.totalB4 = 0;
		this.totalC5 = 0;
		this.totalCSharp5 = 0;
		this.totalD5 = 0;
		this.totalDSharp5 = 0;
		this.totalE5 = 0;
		this.totalF5 = 0;
		this.totalFSharp5 = 0;
		this.totalG5 = 0;
		this.totalGSharp5 = 0;
		this.totalA5 = 0;
		this.totalASharp5 = 0;
		this.totalB5 = 0;
		this.totalC6 = 0;
		this.totalCSharp6 = 0;
		this.totalD6 = 0;
		this.totalDSharp6 = 0;
		this.totalE6 = 0;
		this.totalF6 = 0;
		this.totalFSharp6 = 0;
		this.totalG6 = 0;
		this.totalGSharp6 = 0;
		this.totalA6 = 0;
		this.totalASharp6 = 0;
		this.totalB6 = 0;
		this.totalC7 = 0;
		this.totalCSharp7 = 0;
		this.totalD7 = 0;
		this.totalDSharp7 = 0;
		this.totalE7 = 0;
		this.totalF7 = 0;
		this.totalFSharp7 = 0;
		this.totalG7 = 0;
		this.totalGSharp7 = 0;
		this.totalA7 = 0;
		this.totalASharp7 = 0;
		this.totalB7 = 0;
		this.totalC8 = 0;
		this.totalCSharp8 = 0;
		this.totalD8 = 0;
		this.totalDSharp8 = 0;
		this.totalE8 = 0;
		this.totalF8 = 0;
		this.totalFSharp8 = 0;
		this.totalG8 = 0;
		this.totalGSharp8 = 0;
		this.totalA8 = 0;
		this.totalASharp8 = 0;
		this.totalB8 = 0;
		this.totalC9 = 0;
		this.totalCSharp9 = 0;
		this.totalD9 = 0;
		this.totalDSharp9 = 0;
		this.totalE9 = 0;
		this.totalF9 = 0;
		this.totalFSharp9 = 0;
		this.totalG9 = 0;
		this.totalGSharp9 = 0;
		this.totalA9 = 0;
		this.totalASharp9 = 0;
		this.totalB9 = 0;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public double getBpm() {
		return bpm;
	}

	public void setBpm(double bpm) {
		this.bpm = bpm;
	}

	public int getTotalNotes() {
		return totalNotes;
	}

	public void setTotalNotes(int totalNotes) {
		this.totalNotes = totalNotes;
	}

	public int getTotalCNeg1() {
		return totalCNeg1;
	}

	public void setTotalCNeg1(int totalCNeg1) {
		this.totalCNeg1 = totalCNeg1;
	}

	public int getTotalCSharpneg1() {
		return totalCSharpneg1;
	}

	public void setTotalCSharpneg1(int totalCSharpneg1) {
		this.totalCSharpneg1 = totalCSharpneg1;
	}

	public int getTotalDNeg1() {
		return totalDNeg1;
	}

	public void setTotalDNeg1(int totalDNeg1) {
		this.totalDNeg1 = totalDNeg1;
	}

	public int getTotalDSharpneg1() {
		return totalDSharpneg1;
	}

	public void setTotalDSharpneg1(int totalDSharpneg1) {
		this.totalDSharpneg1 = totalDSharpneg1;
	}

	public int getTotalEneg1() {
		return totalEneg1;
	}

	public void setTotalEneg1(int totalEneg1) {
		this.totalEneg1 = totalEneg1;
	}

	public int getTotalFneg1() {
		return totalFneg1;
	}

	public void setTotalFneg1(int totalFneg1) {
		this.totalFneg1 = totalFneg1;
	}

	public int getTotalFSharpneg1() {
		return totalFSharpneg1;
	}

	public void setTotalFSharpneg1(int totalFSharpneg1) {
		this.totalFSharpneg1 = totalFSharpneg1;
	}

	public int getTotalGneg1() {
		return totalGneg1;
	}

	public void setTotalGneg1(int totalGneg1) {
		this.totalGneg1 = totalGneg1;
	}

	public int getTotalGSharpneg1() {
		return totalGSharpneg1;
	}

	public void setTotalGSharpneg1(int totalGSharpneg1) {
		this.totalGSharpneg1 = totalGSharpneg1;
	}

	public int getTotalAneg1() {
		return totalAneg1;
	}

	public void setTotalAneg1(int totalAneg1) {
		this.totalAneg1 = totalAneg1;
	}

	public int getTotalASharpneg1() {
		return totalASharpneg1;
	}

	public void setTotalASherpneg1(int totalASherpneg1) {
		this.totalASharpneg1 = totalASherpneg1;
	}

	public int getTotalBneg1() {
		return totalBneg1;
	}

	public void setTotalBneg1(int totalBneg1) {
		this.totalBneg1 = totalBneg1;
	}

	public int getTotalC0() {
		return totalC0;
	}

	public void setTotalC0(int totalC0) {
		this.totalC0 = totalC0;
	}

	public int getTotalCSharp0() {
		return totalCSharp0;
	}

	public void setTotalCSharp0(int totalCSharp0) {
		this.totalCSharp0 = totalCSharp0;
	}

	public int getTotalD0() {
		return totalD0;
	}

	public void setTotalD0(int totalD0) {
		this.totalD0 = totalD0;
	}

	public int getTotalDSharp0() {
		return totalDSharp0;
	}

	public void setTotalDSharp0(int totalDSharp0) {
		this.totalDSharp0 = totalDSharp0;
	}

	public int getTotalE0() {
		return totalE0;
	}

	public void setTotalE0(int totalE0) {
		this.totalE0 = totalE0;
	}

	public int getTotalF0() {
		return totalF0;
	}

	public void setTotalF0(int totalF0) {
		this.totalF0 = totalF0;
	}

	public int getTotalFSharp0() {
		return totalFSharp0;
	}

	public void setTotalFSharp0(int totalFSharp0) {
		this.totalFSharp0 = totalFSharp0;
	}

	public int getTotalG0() {
		return totalG0;
	}

	public void setTotalG0(int totalG0) {
		this.totalG0 = totalG0;
	}

	public int getTotalGSharp0() {
		return totalGSharp0;
	}

	public void setTotalGSharp0(int totalGSharp0) {
		this.totalGSharp0 = totalGSharp0;
	}

	public int getTotalA0() {
		return totalA0;
	}

	public void setTotalA0(int totalA0) {
		this.totalA0 = totalA0;
	}

	public int getTotalASharp0() {
		return totalASharp0;
	}

	public void setTotalASharp0(int totalASharp0) {
		this.totalASharp0 = totalASharp0;
	}

	public int getTotalB0() {
		return totalB0;
	}

	public void setTotalB0(int totalB0) {
		this.totalB0 = totalB0;
	}

	public int getTotalC1() {
		return totalC1;
	}

	public void setTotalC1(int totalC1) {
		this.totalC1 = totalC1;
	}

	public int getTotalCSharp1() {
		return totalCSharp1;
	}

	public void setTotalCSharp1(int totalCSharp1) {
		this.totalCSharp1 = totalCSharp1;
	}

	public int getTotalD1() {
		return totalD1;
	}

	public void setTotalD1(int totalD1) {
		this.totalD1 = totalD1;
	}

	public int getTotalDSharp1() {
		return totalDSharp1;
	}

	public void setTotalDSharp1(int totalDSharp1) {
		this.totalDSharp1 = totalDSharp1;
	}

	public int getTotalE1() {
		return totalE1;
	}

	public void setTotalE1(int totalE1) {
		this.totalE1 = totalE1;
	}

	public int getTotalF1() {
		return totalF1;
	}

	public void setTotalF1(int totalF1) {
		this.totalF1 = totalF1;
	}

	public int getTotalFSharp1() {
		return totalFSharp1;
	}

	public void setTotalFSharp1(int totalFSharp1) {
		this.totalFSharp1 = totalFSharp1;
	}

	public int getTotalG1() {
		return totalG1;
	}

	public void setTotalG1(int totalG1) {
		this.totalG1 = totalG1;
	}

	public int getTotalGSharp1() {
		return totalGSharp1;
	}

	public void setTotalGSharp1(int totalGSharp1) {
		this.totalGSharp1 = totalGSharp1;
	}

	public int getTotalA1() {
		return totalA1;
	}

	public void setTotalA1(int totalA1) {
		this.totalA1 = totalA1;
	}

	public int getTotalASharp1() {
		return totalASharp1;
	}

	public void setTotalASharp1(int totalASharp1) {
		this.totalASharp1 = totalASharp1;
	}

	public int getTotalB1() {
		return totalB1;
	}

	public void setTotalB1(int totalB1) {
		this.totalB1 = totalB1;
	}

	public int getTotalC2() {
		return totalC2;
	}

	public void setTotalC2(int totalC2) {
		this.totalC2 = totalC2;
	}

	public int getTotalCSharp2() {
		return totalCSharp2;
	}

	public void setTotalCSharp2(int totalCSharp2) {
		this.totalCSharp2 = totalCSharp2;
	}

	public int getTotalD2() {
		return totalD2;
	}

	public void setTotalD2(int totalD2) {
		this.totalD2 = totalD2;
	}

	public int getTotalDSharp2() {
		return totalDSharp2;
	}

	public void setTotalDSharp2(int totalDSharp2) {
		this.totalDSharp2 = totalDSharp2;
	}

	public int getTotalE2() {
		return totalE2;
	}

	public void setTotalE2(int totalE2) {
		this.totalE2 = totalE2;
	}

	public int getTotalF2() {
		return totalF2;
	}

	public void setTotalF2(int totalF2) {
		this.totalF2 = totalF2;
	}

	public int getTotalFSharp2() {
		return totalFSharp2;
	}

	public void setTotalFSharp2(int totalFSharp2) {
		this.totalFSharp2 = totalFSharp2;
	}

	public int getTotalG2() {
		return totalG2;
	}

	public void setTotalG2(int totalG2) {
		this.totalG2 = totalG2;
	}

	public int getTotalGSharp2() {
		return totalGSharp2;
	}

	public void setTotalGSharp2(int totalGSharp2) {
		this.totalGSharp2 = totalGSharp2;
	}

	public int getTotalA2() {
		return totalA2;
	}

	public void setTotalA2(int totalA2) {
		this.totalA2 = totalA2;
	}

	public int getTotalASharp2() {
		return totalASharp2;
	}

	public void setTotalASharp2(int totalASharp2) {
		this.totalASharp2 = totalASharp2;
	}

	public int getTotalB2() {
		return totalB2;
	}

	public void setTotalB2(int totalB2) {
		this.totalB2 = totalB2;
	}

	public int getTotalC3() {
		return totalC3;
	}

	public void setTotalC3(int totalC3) {
		this.totalC3 = totalC3;
	}

	public int getTotalCSharp3() {
		return totalCSharp3;
	}

	public void setTotalCSharp3(int totalCSharp3) {
		this.totalCSharp3 = totalCSharp3;
	}

	public int getTotalD3() {
		return totalD3;
	}

	public void setTotalD3(int totalD3) {
		this.totalD3 = totalD3;
	}

	public int getTotalDSharp3() {
		return totalDSharp3;
	}

	public void setTotalDSharp3(int totalDSharp3) {
		this.totalDSharp3 = totalDSharp3;
	}

	public int getTotalE3() {
		return totalE3;
	}

	public void setTotalE3(int totalE3) {
		this.totalE3 = totalE3;
	}

	public int getTotalF3() {
		return totalF3;
	}

	public void setTotalF3(int totalF3) {
		this.totalF3 = totalF3;
	}

	public int getTotalFSharp3() {
		return totalFSharp3;
	}

	public void setTotalFSharp3(int totalFSharp3) {
		this.totalFSharp3 = totalFSharp3;
	}

	public int getTotalG3() {
		return totalG3;
	}

	public void setTotalG3(int totalG3) {
		this.totalG3 = totalG3;
	}

	public int getTotalGSharp3() {
		return totalGSharp3;
	}

	public void setTotalGSharp3(int totalGSharp3) {
		this.totalGSharp3 = totalGSharp3;
	}

	public int getTotalA3() {
		return totalA3;
	}

	public void setTotalA3(int totalA3) {
		this.totalA3 = totalA3;
	}

	public int getTotalASharp3() {
		return totalASharp3;
	}

	public void setTotalASharp3(int totalASharp3) {
		this.totalASharp3 = totalASharp3;
	}

	public int getTotalB3() {
		return totalB3;
	}

	public void setTotalB3(int totalB3) {
		this.totalB3 = totalB3;
	}

	public int getTotalC4() {
		return totalC4;
	}

	public void setTotalC4(int totalC4) {
		this.totalC4 = totalC4;
	}

	public int getTotalCSharp4() {
		return totalCSharp4;
	}

	public void setTotalCSharp4(int totalCSharp4) {
		this.totalCSharp4 = totalCSharp4;
	}

	public int getTotalD4() {
		return totalD4;
	}

	public void setTotalD4(int totalD4) {
		this.totalD4 = totalD4;
	}

	public int getTotalDSharp4() {
		return totalDSharp4;
	}

	public void setTotalDSharp4(int totalDSharp4) {
		this.totalDSharp4 = totalDSharp4;
	}

	public int getTotalE4() {
		return totalE4;
	}

	public void setTotalE4(int totalE4) {
		this.totalE4 = totalE4;
	}

	public int getTotalF4() {
		return totalF4;
	}

	public void setTotalF4(int totalF4) {
		this.totalF4 = totalF4;
	}

	public int getTotalFSharp4() {
		return totalFSharp4;
	}

	public void setTotalFSharp4(int totalFSharp4) {
		this.totalFSharp4 = totalFSharp4;
	}

	public int getTotalG4() {
		return totalG4;
	}

	public void setTotalG4(int totalG4) {
		this.totalG4 = totalG4;
	}

	public int getTotalGSharp4() {
		return totalGSharp4;
	}

	public void setTotalGSharp4(int totalGSharp4) {
		this.totalGSharp4 = totalGSharp4;
	}

	public int getTotalA4() {
		return totalA4;
	}

	public void setTotalA4(int totalA4) {
		this.totalA4 = totalA4;
	}

	public int getTotalASharp4() {
		return totalASharp4;
	}

	public void setTotalASharp4(int totalASharp4) {
		this.totalASharp4 = totalASharp4;
	}

	public int getTotalB4() {
		return totalB4;
	}

	public void setTotalB4(int totalB4) {
		this.totalB4 = totalB4;
	}

	public int getTotalC5() {
		return totalC5;
	}

	public void setTotalC5(int totalC5) {
		this.totalC5 = totalC5;
	}

	public int getTotalCSharp5() {
		return totalCSharp5;
	}

	public void setTotalCSharp5(int totalCSharp5) {
		this.totalCSharp5 = totalCSharp5;
	}

	public int getTotalD5() {
		return totalD5;
	}

	public void setTotalD5(int totalD5) {
		this.totalD5 = totalD5;
	}

	public int getTotalDSharp5() {
		return totalDSharp5;
	}

	public void setTotalDSharp5(int totalDSharp5) {
		this.totalDSharp5 = totalDSharp5;
	}

	public int getTotalE5() {
		return totalE5;
	}

	public void setTotalE5(int totalE5) {
		this.totalE5 = totalE5;
	}

	public int getTotalF5() {
		return totalF5;
	}

	public void setTotalF5(int totalF5) {
		this.totalF5 = totalF5;
	}

	public int getTotalFSharp5() {
		return totalFSharp5;
	}

	public void setTotalFSharp5(int totalFSharp5) {
		this.totalFSharp5 = totalFSharp5;
	}

	public int getTotalG5() {
		return totalG5;
	}

	public void setTotalG5(int totalG5) {
		this.totalG5 = totalG5;
	}

	public int getTotalGSharp5() {
		return totalGSharp5;
	}

	public void setTotalGSharp5(int totalGSharp5) {
		this.totalGSharp5 = totalGSharp5;
	}

	public int getTotalA5() {
		return totalA5;
	}

	public void setTotalA5(int totalA5) {
		this.totalA5 = totalA5;
	}

	public int getTotalASharp5() {
		return totalASharp5;
	}

	public void setTotalASharp5(int totalASharp5) {
		this.totalASharp5 = totalASharp5;
	}

	public int getTotalB5() {
		return totalB5;
	}

	public void setTotalB5(int totalB5) {
		this.totalB5 = totalB5;
	}

	public int getTotalC6() {
		return totalC6;
	}

	public void setTotalC6(int totalC6) {
		this.totalC6 = totalC6;
	}

	public int getTotalCSharp6() {
		return totalCSharp6;
	}

	public void setTotalCSharp6(int totalCSharp6) {
		this.totalCSharp6 = totalCSharp6;
	}

	public int getTotalD6() {
		return totalD6;
	}

	public void setTotalD6(int totalD6) {
		this.totalD6 = totalD6;
	}

	public int getTotalDSharp6() {
		return totalDSharp6;
	}

	public void setTotalDSharp6(int totalDSharp6) {
		this.totalDSharp6 = totalDSharp6;
	}

	public int getTotalE6() {
		return totalE6;
	}

	public void setTotalE6(int totalE6) {
		this.totalE6 = totalE6;
	}

	public int getTotalF6() {
		return totalF6;
	}

	public void setTotalF6(int totalF6) {
		this.totalF6 = totalF6;
	}

	public int getTotalFSharp6() {
		return totalFSharp6;
	}

	public void setTotalFSharp6(int totalFSharp6) {
		this.totalFSharp6 = totalFSharp6;
	}

	public int getTotalG6() {
		return totalG6;
	}

	public void setTotalG6(int totalG6) {
		this.totalG6 = totalG6;
	}

	public int getTotalGSharp6() {
		return totalGSharp6;
	}

	public void setTotalGSharp6(int totalGSharp6) {
		this.totalGSharp6 = totalGSharp6;
	}

	public int getTotalA6() {
		return totalA6;
	}

	public void setTotalA6(int totalA6) {
		this.totalA6 = totalA6;
	}

	public int getTotalASharp6() {
		return totalASharp6;
	}

	public void setTotalASharp6(int totalASharp6) {
		this.totalASharp6 = totalASharp6;
	}

	public int getTotalB6() {
		return totalB6;
	}

	public void setTotalB6(int totalB6) {
		this.totalB6 = totalB6;
	}

	public int getTotalC7() {
		return totalC7;
	}

	public void setTotalC7(int totalC7) {
		this.totalC7 = totalC7;
	}

	public int getTotalCSharp7() {
		return totalCSharp7;
	}

	public void setTotalCSharp7(int totalCSharp7) {
		this.totalCSharp7 = totalCSharp7;
	}

	public int getTotalD7() {
		return totalD7;
	}

	public void setTotalD7(int totalD7) {
		this.totalD7 = totalD7;
	}

	public int getTotalDSharp7() {
		return totalDSharp7;
	}

	public void setTotalDSharp7(int totalDSharp7) {
		this.totalDSharp7 = totalDSharp7;
	}

	public int getTotalE7() {
		return totalE7;
	}

	public void setTotalE7(int totalE7) {
		this.totalE7 = totalE7;
	}

	public int getTotalF7() {
		return totalF7;
	}

	public void setTotalF7(int totalF7) {
		this.totalF7 = totalF7;
	}

	public int getTotalFSharp7() {
		return totalFSharp7;
	}

	public void setTotalFSharp7(int totalFSharp7) {
		this.totalFSharp7 = totalFSharp7;
	}

	public int getTotalG7() {
		return totalG7;
	}

	public void setTotalG7(int totalG7) {
		this.totalG7 = totalG7;
	}

	public int getTotalGSharp7() {
		return totalGSharp7;
	}

	public void setTotalGSharp7(int totalGSharp7) {
		this.totalGSharp7 = totalGSharp7;
	}

	public int getTotalA7() {
		return totalA7;
	}

	public void setTotalA7(int totalA7) {
		this.totalA7 = totalA7;
	}

	public int getTotalASharp7() {
		return totalASharp7;
	}

	public void setTotalASharp7(int totalASharp7) {
		this.totalASharp7 = totalASharp7;
	}

	public int getTotalB7() {
		return totalB7;
	}

	public void setTotalB7(int totalB7) {
		this.totalB7 = totalB7;
	}

	public int getTotalC8() {
		return totalC8;
	}

	public void setTotalC8(int totalC8) {
		this.totalC8 = totalC8;
	}

	public int getTotalCSharp8() {
		return totalCSharp8;
	}

	public void setTotalCSharp8(int totalCSharp8) {
		this.totalCSharp8 = totalCSharp8;
	}

	public int getTotalD8() {
		return totalD8;
	}

	public void setTotalD8(int totalD8) {
		this.totalD8 = totalD8;
	}

	public int getTotalDSharp8() {
		return totalDSharp8;
	}

	public void setTotalDSharp8(int totalDSharp8) {
		this.totalDSharp8 = totalDSharp8;
	}

	public int getTotalE8() {
		return totalE8;
	}

	public void setTotalE8(int totalE8) {
		this.totalE8 = totalE8;
	}

	public int getTotalF8() {
		return totalF8;
	}

	public void setTotalF8(int totalF8) {
		this.totalF8 = totalF8;
	}

	public int getTotalFSharp8() {
		return totalFSharp8;
	}

	public void setTotalFSharp8(int totalFSharp8) {
		this.totalFSharp8 = totalFSharp8;
	}

	public int getTotalG8() {
		return totalG8;
	}

	public void setTotalG8(int totalG8) {
		this.totalG8 = totalG8;
	}

	public int getTotalGSharp8() {
		return totalGSharp8;
	}

	public void setTotalGSharp8(int totalGSharp8) {
		this.totalGSharp8 = totalGSharp8;
	}

	public int getTotalA8() {
		return totalA8;
	}

	public void setTotalA8(int totalA8) {
		this.totalA8 = totalA8;
	}

	public int getTotalASharp8() {
		return totalASharp8;
	}

	public void setTotalASharp8(int totalASharp8) {
		this.totalASharp8 = totalASharp8;
	}

	public int getTotalB8() {
		return totalB8;
	}

	public void setTotalB8(int totalB8) {
		this.totalB8 = totalB8;
	}

	public int getTotalC9() {
		return totalC9;
	}

	public void setTotalC9(int totalC9) {
		this.totalC9 = totalC9;
	}

	public int getTotalCSharp9() {
		return totalCSharp9;
	}

	public void setTotalCSharp9(int totalCSharp9) {
		this.totalCSharp9 = totalCSharp9;
	}

	public int getTotalD9() {
		return totalD9;
	}

	public void setTotalD9(int totalD9) {
		this.totalD9 = totalD9;
	}

	public int getTotalDSharp9() {
		return totalDSharp9;
	}

	public void setTotalDSharp9(int totalDSharp9) {
		this.totalDSharp9 = totalDSharp9;
	}

	public int getTotalE9() {
		return totalE9;
	}

	public void setTotalE9(int totalE9) {
		this.totalE9 = totalE9;
	}

	public int getTotalF9() {
		return totalF9;
	}

	public void setTotalF9(int totalF9) {
		this.totalF9 = totalF9;
	}

	public int getTotalFSharp9() {
		return totalFSharp9;
	}

	public void setTotalFSharp9(int totalFSharp9) {
		this.totalFSharp9 = totalFSharp9;
	}

	public int getTotalG9() {
		return totalG9;
	}

	public void setTotalG9(int totalG9) {
		this.totalG9 = totalG9;
	}

	public int getTotalGSharp9() {
		return totalGSharp9;
	}

	public void setTotalGSharp9(int totalGSharp9) {
		this.totalGSharp9 = totalGSharp9;
	}

	public int getTotalA9() {
		return totalA9;
	}

	public void setTotalA9(int totalA9) {
		this.totalA9 = totalA9;
	}

	public int getTotalASharp9() {
		return totalASharp9;
	}

	public void setTotalASharp9(int totalASharp9) {
		this.totalASharp9 = totalASharp9;
	}

	public int getTotalB9() {
		return totalB9;
	}

	public void setTotalB9(int totalB9) {
		this.totalB9 = totalB9;
	}
	
	public String getLowestNote() {
		return lowestNote;
	}

	public void setLowestNote(String lowestNote) {
		this.lowestNote = lowestNote;
	}

	public String getHighestNote() {
		return HighestNote;
	}

	public void setHighestNote(String highestNote) {
		HighestNote = highestNote;
	}

	public void setNotes(int[][] arrayNotesByOctave) {
		this.totalCNeg1 = arrayNotesByOctave[0][0];
		this.totalCSharpneg1 = arrayNotesByOctave[1][0];
		this.totalDNeg1 = arrayNotesByOctave[2][0];
		this.totalDSharpneg1 = arrayNotesByOctave[3][0];
		this.totalEneg1 = arrayNotesByOctave[4][0];
		this.totalFneg1 = arrayNotesByOctave[5][0];
		this.totalFSharpneg1 = arrayNotesByOctave[6][0];
		this.totalGneg1 = arrayNotesByOctave[7][0];
		this.totalGSharpneg1 = arrayNotesByOctave[8][0];
		this.totalAneg1 = arrayNotesByOctave[9][0];
		this.totalASharpneg1 = arrayNotesByOctave[10][0];
		this.totalBneg1 = arrayNotesByOctave[11][0];
		
		this.totalC0 = arrayNotesByOctave[0][1];
		this.totalCSharp0 = arrayNotesByOctave[1][1];
		this.totalD0 = arrayNotesByOctave[2][1];
		this.totalDSharp0 = arrayNotesByOctave[3][1];
		this.totalE0 = arrayNotesByOctave[4][1];
		this.totalF0 = arrayNotesByOctave[5][1];
		this.totalFSharp0 = arrayNotesByOctave[6][1];
		this.totalG0 = arrayNotesByOctave[7][1];
		this.totalGSharp0 = arrayNotesByOctave[8][1];
		this.totalA0 = arrayNotesByOctave[9][1];
		this.totalASharp0 = arrayNotesByOctave[10][1];
		this.totalB0 = arrayNotesByOctave[11][1];
		
		this.totalC1 = arrayNotesByOctave[0][2];
		this.totalCSharp1 = arrayNotesByOctave[1][2];
		this.totalD1 = arrayNotesByOctave[2][2];
		this.totalDSharp1 = arrayNotesByOctave[3][2];
		this.totalE1 = arrayNotesByOctave[4][2];
		this.totalF1 = arrayNotesByOctave[5][2];
		this.totalFSharp1 = arrayNotesByOctave[6][2];
		this.totalG1 = arrayNotesByOctave[7][2];
		this.totalGSharp1 = arrayNotesByOctave[8][2];
		this.totalA1 = arrayNotesByOctave[9][2];
		this.totalASharp1 = arrayNotesByOctave[10][2];
		this.totalB1 = arrayNotesByOctave[11][2];
		
		this.totalC2 = arrayNotesByOctave[0][3];
		this.totalCSharp2 = arrayNotesByOctave[1][3];
		this.totalD2 = arrayNotesByOctave[2][3];
		this.totalDSharp2 = arrayNotesByOctave[3][3];
		this.totalE2 = arrayNotesByOctave[4][3];
		this.totalF2 = arrayNotesByOctave[5][3];
		this.totalFSharp2 = arrayNotesByOctave[6][3];
		this.totalG2 = arrayNotesByOctave[7][3];
		this.totalGSharp2 = arrayNotesByOctave[8][3];
		this.totalA2 = arrayNotesByOctave[9][3];
		this.totalASharp2 = arrayNotesByOctave[10][3];
		this.totalB2 = arrayNotesByOctave[11][3];
		
		this.totalC3 = arrayNotesByOctave[0][4];
		this.totalCSharp3 = arrayNotesByOctave[1][4];
		this.totalD3 = arrayNotesByOctave[2][4];
		this.totalDSharp3 = arrayNotesByOctave[3][4];
		this.totalE3 = arrayNotesByOctave[4][4];
		this.totalF3 = arrayNotesByOctave[5][4];
		this.totalFSharp3 = arrayNotesByOctave[6][4];
		this.totalG3 = arrayNotesByOctave[7][4];
		this.totalGSharp3 = arrayNotesByOctave[8][4];
		this.totalA3 = arrayNotesByOctave[9][4];
		this.totalASharp3 = arrayNotesByOctave[10][4];
		this.totalB3 = arrayNotesByOctave[11][4];
		
		this.totalC4 = arrayNotesByOctave[0][5];
		this.totalCSharp4 = arrayNotesByOctave[1][5];
		this.totalD4 = arrayNotesByOctave[2][5];
		this.totalDSharp4 = arrayNotesByOctave[3][5];
		this.totalE4 = arrayNotesByOctave[4][5];
		this.totalF4 = arrayNotesByOctave[5][5];
		this.totalFSharp4 = arrayNotesByOctave[6][5];
		this.totalG4 = arrayNotesByOctave[7][5];
		this.totalGSharp4 = arrayNotesByOctave[8][5];
		this.totalA4 = arrayNotesByOctave[9][5];
		this.totalASharp4 = arrayNotesByOctave[10][5];
		this.totalB4 = arrayNotesByOctave[11][5];
		
		this.totalC5 = arrayNotesByOctave[0][6];
		this.totalCSharp5 = arrayNotesByOctave[1][6];
		this.totalD5 = arrayNotesByOctave[2][6];
		this.totalDSharp5 = arrayNotesByOctave[3][6];
		this.totalE5 = arrayNotesByOctave[4][6];
		this.totalF5 = arrayNotesByOctave[5][6];
		this.totalFSharp5 = arrayNotesByOctave[6][6];
		this.totalG5 = arrayNotesByOctave[7][6];
		this.totalGSharp5 = arrayNotesByOctave[8][6];
		this.totalA5 = arrayNotesByOctave[9][6];
		this.totalASharp5 = arrayNotesByOctave[10][6];
		this.totalB5 = arrayNotesByOctave[11][6];
		
		this.totalC6 = arrayNotesByOctave[0][7];
		this.totalCSharp6 = arrayNotesByOctave[1][7];
		this.totalD6 = arrayNotesByOctave[2][7];
		this.totalDSharp6 = arrayNotesByOctave[3][7];
		this.totalE6 = arrayNotesByOctave[4][7];
		this.totalF6 = arrayNotesByOctave[5][7];
		this.totalFSharp6 = arrayNotesByOctave[6][7];
		this.totalG6 = arrayNotesByOctave[7][7];
		this.totalGSharp6 = arrayNotesByOctave[8][7];
		this.totalA6 = arrayNotesByOctave[9][7];
		this.totalASharp6 = arrayNotesByOctave[10][7];
		this.totalB6 = arrayNotesByOctave[11][7];
		
		this.totalC7 = arrayNotesByOctave[0][8];
		this.totalCSharp7 = arrayNotesByOctave[1][8];
		this.totalD7 = arrayNotesByOctave[2][8];
		this.totalDSharp7 = arrayNotesByOctave[3][8];
		this.totalE7 = arrayNotesByOctave[4][8];
		this.totalF7 = arrayNotesByOctave[5][8];
		this.totalFSharp7 = arrayNotesByOctave[6][8];
		this.totalG7 = arrayNotesByOctave[7][8];
		this.totalGSharp7 = arrayNotesByOctave[8][8];
		this.totalA7 = arrayNotesByOctave[9][8];
		this.totalASharp7 = arrayNotesByOctave[10][8];
		this.totalB7 = arrayNotesByOctave[11][8];
		
		this.totalC8 = arrayNotesByOctave[0][9];
		this.totalCSharp8 = arrayNotesByOctave[1][9];
		this.totalD8 = arrayNotesByOctave[2][9];
		this.totalDSharp8 = arrayNotesByOctave[3][9];
		this.totalE8 = arrayNotesByOctave[4][9];
		this.totalF8 = arrayNotesByOctave[5][9];
		this.totalFSharp8 = arrayNotesByOctave[6][9];
		this.totalG8 = arrayNotesByOctave[7][9];
		this.totalGSharp8 = arrayNotesByOctave[8][9];
		this.totalA8 = arrayNotesByOctave[9][9];
		this.totalASharp8 = arrayNotesByOctave[10][9];
		this.totalB8 = arrayNotesByOctave[11][9];
		
		this.totalC9 = arrayNotesByOctave[0][10];
		this.totalCSharp9 = arrayNotesByOctave[1][10];
		this.totalD9 = arrayNotesByOctave[2][10];
		this.totalDSharp9 = arrayNotesByOctave[3][10];
		this.totalE9 = arrayNotesByOctave[4][10];
		this.totalF9 = arrayNotesByOctave[5][10];
		this.totalFSharp9 = arrayNotesByOctave[6][10];
		this.totalG9 = arrayNotesByOctave[7][10];
		this.totalGSharp9 = arrayNotesByOctave[8][10];
		this.totalA9 = arrayNotesByOctave[9][10];
		this.totalASharp9 = arrayNotesByOctave[10][10];
		this.totalB9 = arrayNotesByOctave[11][10];
	}
	
}
