package sample.layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class TextLayoutSample extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		//Creating a text field
		TextField textField = new TextField();
		
		//Creating the play button
		Button playButton = new Button("Play");
		//Creating the stop button
		Button stopButton = new Button("stop");
		
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.addAll(textField, playButton, stopButton);
		
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("layout sample");
		primaryStage.show();
	}
}
