package sample.threed;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class RectanglySample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setHeight(350);
		rectangle.setWidth(350);
		rectangle.setFill(Color.BROWN);
		
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.add(rectangle);
		
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("rectangle sample");
		primaryStage.show();
	}
}
