package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class CubinSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		CubicCurve cubicCurve = new CubicCurve();
		cubicCurve.setControlX1(100);
		cubicCurve.setControlX2(200);
		cubicCurve.setControlY1(100);
		cubicCurve.setControlY2(100);
		cubicCurve.setStartX(100);
		cubicCurve.setStartY(100);
		cubicCurve.setEndX(300);
		cubicCurve.setEndY(300);
		cubicCurve.setFill(Color.PINK);
		Group group = new Group();
		ObservableList<Node> children = group.getChildren();
		children.add(cubicCurve);
		
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("cubicCurve sample");
		primaryStage.show();
	}
}
