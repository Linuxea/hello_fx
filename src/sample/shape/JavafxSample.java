package sample.shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavafxSample extends Application {
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		//creating a Group object
		Group group = new Group();
		
		//Creating a Scene by passing the group object, height and width
		Scene scene = new Scene(group, 600, 300);
		
		//setting color to the scene
		scene.setFill(Color.BROWN);
		
		//Setting the title to Stage.
		primaryStage.setTitle("Sample Application");
		
		//Adding the scene to Stage
		primaryStage.setScene(scene);
		
		//Displaying the contents of the stage
		primaryStage.show();
	}
}
