package sample.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class ButtonSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Button button = new Button();
		button.setText("click me");
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(button);
		Scene scene = new Scene(stackPane, 300, 600);
		primaryStage.setTitle("button layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
