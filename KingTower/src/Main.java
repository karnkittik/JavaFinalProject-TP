
import com.sun.javafx.fxml.builder.JavaFXImageBuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox root = new HBox(10);
		Button b = new Button("bbb");
		//Image image = new Image(ClassLoader.getSystemResource("res/User.png").toString());
		root.getChildren().addAll(b);
		Scene scene = new Scene(root, 432.0, 768.0);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("KingTower");
		primaryStage.setResizable(false);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
