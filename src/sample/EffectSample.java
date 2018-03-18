package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * @author linuxea
 * @date 2018/3/19
 */
public class EffectSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Creating an image
		Image image = new Image("https://tse4.mm.bing.net/th?id=OIP.xVkeT_Eva3EshHhZwYkhFQHaEK&pid=Api");

//Setting the image view
		ImageView imageView = new ImageView(image);

//Setting the position of the image
		imageView.setX(100);
		imageView.setY(70);

//setting the fit height and width of the image view
		imageView.setFitHeight(200);
		imageView.setFitWidth(400);

//Setting the preserve ratio of the image view
		imageView.setPreserveRatio(true);
		Glow glow = new Glow();
		//setting the level property
		glow.setLevel(1);
		imageView.setEffect(glow);
		
		Group group = new Group(imageView);
		Scene scene = new Scene(group, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("image effect");
		primaryStage.show();
		
		
	}
}
