package service;

import java.util.List;

import entite.Humain;
import entite.Images;
import entite.ImagesNotes;

public class Modele {
	
	Images img1 = new Images("Albi", "efwdgngefe");
	Images img2 = new Images("Paris", "efefe");
	Images img3 = new Images("Castres", "efefe");
	Images img4 = new Images("Toulouse", "efefe");
	
	ImagesNotes imgn1 = new ImagesNotes(img1, 15);
	ImagesNotes imgn2 = new ImagesNotes(img1, 15);
	ImagesNotes imgn3 = new ImagesNotes(img1, 15);
	ImagesNotes imgn4 = new ImagesNotes(img1, 15);
	

	private Humain h1;
	private Humain h2;
	public ImagesNotes imagesNotes1;
	public ImagesNotes imagesNotes2;
	public ImagesNotes imagesNotes3;
	public ImagesNotes imagesNotes4;
	private List<ImagesNotes> imageNotesListe;
	
	
	public Modele () {
		
		/*
		this.tabImageNote = new ImagesNotes[4];
		
		this.tabImageNote[0] = new ImagesNotes(img1, 15);
		this.tabImageNote[1] = new ImagesNotes(img2, 15);
		this.tabImageNote[2] = new ImagesNotes(img3, 15);
		this.tabImageNote[3] = new ImagesNotes(img4, 15);
		*/
		
		this.h1 = new Humain ("Robert", "robert", imgn1);
		this.h2 = new Humain ("Toto", "toto", imgn2);
		
		
		this.imagesNotes1 = new ImagesNotes(img1, 15);
		this.imagesNotes2 = new ImagesNotes(img2, 15);
		this.imagesNotes3 = new ImagesNotes(img3, 15);
		this.imagesNotes4 = new ImagesNotes(img4, 15);
		
	}
	
	public Humain getHumain(int h) {

		if(h==1) {
			return this.h1;
		}
		else {
			return h2;
		}
	}
	

	
	
	
	
}
