package sample.charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class LineChartSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		CategoryAxis xAxis = new CategoryAxis();
		
		//setting the list of categories.
		xAxis.setCategories(FXCollections.observableArrayList(Arrays.asList("n ame1", "name2")));
		
		//Setting label to the axis
		xAxis.setLabel("name of the axis ");
		
		//Defining the axis
		NumberAxis yAxis = new NumberAxis();
		
		//Setting labelto the axis
		yAxis.setLabel("name of the axis");

//		ObservableList list = series.getData();
		
		
		LineChart linechart = new LineChart(xAxis, yAxis);
		
		Group group = new Group(linechart);
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("line chart sample");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
