package sample.shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class DrawLineSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(100);
		line.setEndX(200);
		line.setEndY(500);
		
		Group group = new Group(line);
		
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setTitle("hello! line");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}
