package entite;

import java.util.ArrayList;
import java.util.List;

public class Humain {

	private String nom;
	private String login;
	private List<ImagesNotes> imagesnotesliste;
	
	public Humain (String nom, String login, ImagesNotes imagenotes) {
		this.nom = nom;
		this.login = login;
		this.imagesnotesliste = new ArrayList<>();
		imagesnotesliste.add(imagenotes);
		
		
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public ImagesNotes getImagesNotes(int placeImagesDansTableau) {
		return this.imagesnotesliste.get(placeImagesDansTableau);
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public List<ImagesNotes> getImagesnotes() {
		return imagesnotesliste;
	}

	public void setImagesnotesliste(ImagesNotes imgn) {
		this.imagesnotesliste.add(imgn);
	}
	
	
	
	
}
