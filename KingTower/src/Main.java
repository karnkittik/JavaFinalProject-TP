
import com.sun.javafx.fxml.builder.JavaFXImageBuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	private static final String bgURL = "file:res/User.jpg";
	
	@Override
	public void start(Stage primaryStage) {
		StackPane root1 = new StackPane();
		StackPane root2 = new StackPane();
		Button b1 = new Button("bbb");
		Button b2 = new Button("ccc");
		Image bg = new Image(bgURL);
		root2.setStyle("-fx-background-image: url(file:res/User2.jpg);" );
		root1.setStyle("-fx-background-image: url(file:res/User.jpg);" );
		//Rectangle s = new Rectangle(60, 768, new ImagePattern(bg, 0, 0, 432, 768, false)); 
		root1.getChildren().addAll(b1);
		Scene scene1 = new Scene(root1, 600, 800);
		Scene scene2 = new Scene(root2, 600, 800);
		b1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				primaryStage.setScene(scene2);
			}
		});
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("KingTower");
		//primaryStage.setResizable(false);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
