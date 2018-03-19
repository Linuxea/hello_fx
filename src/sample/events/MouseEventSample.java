package sample.events;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class MouseEventSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Text text = new Text();
		text.setX(100);
		text.setY(100);
		text.setText("请点击");
		
		Circle circle = new Circle();
		circle.setCenterX(300);
		circle.setCenterY(300);
		circle.setRadius(50);
		circle.setFill(Color.BURLYWOOD);
		
		ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setAutoReverse(true);
		scaleTransition.setNode(circle);
		scaleTransition.setByX(1.3);
		scaleTransition.setByY(1.3);
		scaleTransition.setCycleCount(500);
		scaleTransition.setDuration(Duration.millis(1000));
		
		EventHandler<MouseEvent> mouseEventEventHandler = (event) -> scaleTransition.play();
		text.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEventEventHandler);
		
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.add(text);
		children.add(circle);
		
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("mouse press event");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
