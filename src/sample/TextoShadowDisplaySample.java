package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.Shadow;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class TextoShadowDisplaySample extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text();
		text.setFont(new Font(25));
		text.setX(10);
		text.setY(50);
		text.setText("JavaFX is a software platform for creating and delivering desktop applications, as well as rich Internet applications (RIAs) that can run across a wide variety of devices. JavaFX is intended to replace Swing as the standard GUI library for Java SE, but both will be included for the foreseeable future.[3] JavaFX has support for desktop computers and web browsers on Microsoft Windows, Linux, and macOS.\n");
		text.setWrappingWidth(600);
		Shadow shadow = new Shadow();
		shadow.setRadius(10);
		shadow.setHeight(12);
		shadow.setWidth(12);
		text.setEffect(shadow);
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.add(text);
		Scene scene = new Scene(group, 600, 300);
		primaryStage.setTitle("text sample");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
