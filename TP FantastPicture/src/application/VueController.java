package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import service.Modele;

public class VueController implements Initializable {

	@FXML
	private TextField tfnom;
	
	@FXML
	private TextField tflogin;
	
	@FXML
	private TextField noteDeLimages;
	
	@FXML
	private Button validerNote;

	@FXML
	private Button validerNomLogin;
	
	@FXML
	private Label labelUrlDeLimage;

	@FXML
	private ListView imageListView;
	
	
	Modele modele = new Modele();
	
	public void clickMe(ActionEvent e) {
		
		System.out.println("Cliqué");
		
	}
	
	public void clickMeListView(MouseEvent e) {
		
		System.out.println("Un champs a détecté un clique");
		
		//Faire une liste des imagesNotes dans le Modele
		//labelUrlDeLimage.setText(imageListView.getSelectionModel().getSelectedItem().); 
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //s'éxécute à la première frame 
		// TODO Auto-generated method stub
		imageListView.getItems().add(modele.imagesNotes1.getImages().getNom());
		imageListView.getItems().add(modele.imagesNotes2.getImages().getNom());
		imageListView.getItems().add(modele.imagesNotes3.getImages().getNom());
		imageListView.getItems().add(modele.imagesNotes4.getImages().getNom());
		
	}

}
