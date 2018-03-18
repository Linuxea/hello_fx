package sample.image;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

public class WritingPixelsExample extends Application {
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws FileNotFoundException {
		//Creating an image
		URL resource = Thread.currentThread().getContextClassLoader().getResource("sample/picture/small.jpg");
		Image image = new Image(new FileInputStream(resource.getPath()));
		int width = (int) image.getWidth();
		int height = (int) image.getHeight();
		
		//Creating a writable image
		WritableImage wImage = new WritableImage(width, height);
		
		//Reading color from the loaded image
		PixelReader pixelReader = image.getPixelReader();
		
		//getting the pixel writer
		PixelWriter writer = wImage.getPixelWriter();
		
		//Reading the color of the image
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				//Retrieving the color of the pixel of the loaded image
				
				System.out.println(String.format("%s, %s 正在描绘", x, y));
				
				Color color = pixelReader.getColor(x, y);
				
				//Setting the color to the writable image
				writer.setColor(x, y, color.brighter());
				
				//Setting the view for the writable image
				ImageView imageView = new ImageView(wImage);
				
				//Creating a Group object
				Group root = new Group(imageView);
				
				//Creating a scene object
				Scene scene = new Scene(root, 600, 500);
				
				//Setting title to the Stage
				stage.setTitle("Writing pixels ");
				
				//Adding scene to the stage
				stage.setScene(scene);
				
				//Displaying the contents of the stage
				stage.show();
			}
		}
	}
}
