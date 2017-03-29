package week8.lesson15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task4 extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Четвертый пример");
		stage.setScene(createScene());
		stage.show();
	}

	Text	text;

	public Scene createScene() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		//
		Button btn = new Button("Button 1");
		text = new Text();
		text.setText("Пустой текст");
		//
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				text.setFill(Color.MAROON);
				text.setText(text.getText()
						+ "\nWai! Wai! Somebody pressed on me");
			}
		});
		//
		grid.add(btn, 0, 0);
		grid.add(text, 1, 0);
		//
		Scene scene = new Scene(grid, 600, 400);
		return scene;
	}
}