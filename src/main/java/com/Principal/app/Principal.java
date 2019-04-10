package com.Principal.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Principal extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("principal.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			
			Screen screen = Screen.getPrimary();
			Rectangle2D bounds = screen.getVisualBounds();            

			primaryStage.setX(bounds.getMinX());
			primaryStage.setY(bounds.getMinY());
			primaryStage.setWidth(bounds.getWidth());
			primaryStage.setHeight(bounds.getHeight());
		
			primaryStage.show();
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
