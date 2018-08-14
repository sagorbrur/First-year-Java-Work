import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FlashText extends Application {
	public String text="";
	
	@Override
	public void start(Stage primaryStage){
		StackPane pane=new StackPane();
		final Label lbltext=new Label("Programming is fun");
		pane.getChildren().add(lbltext);
		
		new Thread(new Runnable(){
			@Override
			public void run(){
				try{
					while(true){
						if(lbltext.getText().trim().length()==0)
							text="Welcome";
						else
							text="";
						
						Platform.runLater(new Runnable(){
							@Override
							public void run(){
								lbltext.setText(text);
							}
						});
						Thread.sleep(200);
					}
				}
				catch (InterruptedException ex){
					
				}
			}
		}).start();
		Scene scene=new Scene(pane,200,50);
		primaryStage.setTitle("FlashText");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
