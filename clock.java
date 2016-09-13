/* Clock Programe */

import java.util.*
import javafx.beans.*
import javafx.collections.*
import javafx.geometry.*
import javafx.scene.*
import javafx.stage.*

public class clock extends Application {
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Clock Programe");
		Button btn = new Button();
		btn.setText("Enter");
		btn.setOnAction(new EventHandler<ButtonClick>() {

			@Override
			public void handle (ButtonClick event) {
				if(btn == 'Enter'){
					btn.setText("Baka");
				}
				else{
					btn.setText("Enter");
				}
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
		}
	}
}