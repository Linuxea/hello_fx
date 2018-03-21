package sample.viewsample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/21
 */
public class ListViewSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		ListView<String> listView = new ListView<>();
		ObservableList<String> strings = FXCollections.observableArrayList("java", "python", "c++", "c", "go");
		listView.setItems(strings);
		listView.setLayoutX(10);
		listView.setLayoutY(30);
		listView.setPrefSize(80, 100);
		
		listView.setOrientation(Orientation.VERTICAL);
		
		Group group = new Group();
		group.getChildren().add(listView);
		
		Scene scene = new Scene(group, 300, 600);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("list view sample");
		primaryStage.show();
	}
}
