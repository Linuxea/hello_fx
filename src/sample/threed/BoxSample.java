package sample.threed;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class BoxSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Box box = new Box();
		box.setDepth(100);
		box.setHeight(100);
		box.setWidth(100);
		box.setCullFace(CullFace.NONE);
		
		Group group = new Group(box);
		Scene scene = new Scene(group, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("box sample");
		primaryStage.show();
	}
}

