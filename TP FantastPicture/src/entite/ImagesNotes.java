package entite;

public class ImagesNotes {

	private Images images;
	private int note;
	
	public ImagesNotes(Images img, int note) {
		this.images = img;
		this.note = note;	
	}
	
	public Images getImages() {
		return this.images;
	}
	
	public int getNote() {
		return this.note;
	}
	
	public void setNote(int n) {
		this.note = n;
	}
	
	public void setImages(Images img) {
		this.images = img;
	}
	
	
	
}
