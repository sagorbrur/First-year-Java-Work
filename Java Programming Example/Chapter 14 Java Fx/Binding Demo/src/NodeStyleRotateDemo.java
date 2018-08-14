import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class NodeStyleRotateDemo extends Application {
	@Override
	public void start(Stage primaryStage){
		StackPane pane=new StackPane();
		Button bt=new Button("OK");
		bt.setStyle("-fx-border-color: blue);");
		pane.getChildren().add(bt);
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
		
		Scene scene=new Scene(pane,200,250);
		primaryStage.setTitle("Style");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args){
		Application.launch(args);
	}

}
