import java.util.logging.Handler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Tut1 extends Application implements EventHandler<ActionEvent> {

	Button b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage pStage) throws Exception {
		// TODO Auto-generated method stub
		pStage.setTitle("Hello Javafx");
		
		b=new Button();
		b.setText("Hello");
		b.setOnAction(this);
		
		StackPane layout=new StackPane();
		layout.getChildren().add(b);
		
		Scene scene=new Scene(layout,300,250);
		pStage.setScene(scene);
		pStage.show();
		
	}
	
	@Override
	public void handle(ActionEvent event){
		if(event.getSource()==b){
			//System.out.println("Hello!! You just Click me!");
			
		}
	}

}
