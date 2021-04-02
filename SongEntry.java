public class SongEntry {

	private String filename;
	private double bpm;

	int totalNotes;

	String lowestNote;
	String HighestNote;
	int[][] notes;

	public SongEntry(String filename, double bpm, int[][] notes) {
		super();
		this.filename = filename;
		this.bpm = bpm;
		this.totalNotes = totalNotes;
		this.notes = notes;
	}

	public SongEntry(String filename, double bpm) {
		super();
		this.filename = filename;
		this.bpm = bpm;
		this.totalNotes = 0;
		this.notes = new int[Scrapper.NOTE_NAMES.length][11];
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
		this.notes = arrayNotesByOctave;
	}

}
