import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MyJavaFx extends Application {
	@Override
	public void start(Stage primaryStage){
		
		Pane pane=new HBox(10);
		
		
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("image/bd.jpg");
		pane.getChildren().add(new ImageView(image));
		
		ImageView imageview2=new ImageView(image);
		imageview2.setFitHeight(100);
		imageview2.setFitWidth(100);
		pane.getChildren().add(imageview2);
		
		ImageView imageview3=new ImageView(image);
		imageview3.setRotate(90);
		pane.getChildren().add(imageview3);
		
		Scene scene=new Scene(pane);
		//scene.setFill(Color.GREEN);
		primaryStage.setTitle("Show Image");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}

}
