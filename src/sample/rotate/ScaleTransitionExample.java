package sample.rotate;

/**
 * @author
 * @date 2018/3/19
 */

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleTransitionExample extends Application {
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		//Drawing a Circle
		Circle circle = new Circle();
		
		//Setting the position of the circle
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		
		//Setting the radius of the circle
		circle.setRadius(50.0f);
		
		//Setting the color of the circle
		circle.setFill(Color.BURLYWOOD);
		
		//Setting the stroke width of the circle
		circle.setStrokeWidth(10);
		
		//Creating scale Transition
		ScaleTransition scaleTransition = new ScaleTransition();
		
		//Setting the duration for the transition
		scaleTransition.setDuration(Duration.millis(1000));
		
		//Setting the node for the transition
		scaleTransition.setNode(circle);
		
		//Setting the dimensions for scaling
		scaleTransition.setByY(1.5);
		scaleTransition.setByX(1.5);
		
		//Setting the cycle count for the translation
		scaleTransition.setCycleCount(50);
		
		//Setting auto reverse value to true
		scaleTransition.setAutoReverse(true);
		
		//Playing the animation
		scaleTransition.play();
		
		//Creating a Group object
		Group root = new Group(circle);
		
		//Creating a scene object
		Scene scene = new Scene(root, 600, 300);
		
		//Setting title to the Stage
		stage.setTitle("Scale transition example");
		
		//Adding scene to the stage
		stage.setScene(scene);
		
		//Displaying the contents of the stage
		stage.show();
	}
}

