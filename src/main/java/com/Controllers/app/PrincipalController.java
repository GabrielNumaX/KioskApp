package com.Controllers.app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PrincipalController implements Initializable{
	
	@FXML
	private Label label;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		label.setText("Hola anduvo la chota esta");
		
	}

}
