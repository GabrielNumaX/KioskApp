package kioskapp.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Principal extends Application {

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("kioskapp/view/Cliente.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			
			Screen screen = Screen.getPrimary();
			Rectangle2D bounds = screen.getVisualBounds();            

			stage.setX(bounds.getMinX());
			stage.setY(bounds.getMinY());
			stage.setWidth(bounds.getWidth());
			stage.setHeight(bounds.getHeight());
		
			stage.show();
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
