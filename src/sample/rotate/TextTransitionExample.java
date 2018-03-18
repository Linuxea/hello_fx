package sample.rotate;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class TextTransitionExample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text();
		text.setFont(new Font(25));
		text.setX(300);
		text.setY(50);
		text.setText("看我七十二变");
		text.setWrappingWidth(600);
		
		ScaleTransition scaleTransition = new ScaleTransition();
		scaleTransition.setByX(1.5);
		scaleTransition.setByX(1.5);
		scaleTransition.setDuration(new Duration(1000));
		
		scaleTransition.setNode(text);
		scaleTransition.setCycleCount(100);
		scaleTransition.setAutoReverse(true);
		scaleTransition.play();
		
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.add(text);
		Scene scene = new Scene(group, 600, 300);
		primaryStage.setTitle("text scale sample");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
