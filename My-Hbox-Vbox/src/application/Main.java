package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		HBox box = new HBox();
//		VBox box = new VBox();
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);

		Button btn1 = new Button("button-1");
		Button btn2 = new Button("button-2");
		Button btn3 = new Button("button-3");

		btn1.setStyle("-fx-font-size: larger; -fx-background-color: #7f7f7f; -fx-border-radius: 20px;");
		btn2.setStyle("-fx-font-size: larger; -fx-background-color: #7f7f7f; -fx-border-radius: 20px;");
		btn3.setStyle("-fx-font-size: larger; -fx-background-color: #7f7f7f; -fx-border-radius: 20px;");

		Circle circle = new Circle(50,Color.GREEN);

		Rectangle square = new Rectangle(100,100,Color.RED);

		box.getChildren().addAll(btn1,btn2,btn3,circle,square);

		Scene scene = new Scene(box,550,550);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
