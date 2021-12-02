package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,root.getPrefWidth(),root.getPrefHeight());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Vote Management System");
			primaryStage.getIcons().add(new Image("ecp.png"));
			primaryStage.setHeight(root.getPrefHeight());
			primaryStage.setWidth(root.getPrefWidth());
			primaryStage.setResizable(false);
			primaryStage.show();
			//primaryStage.setMaximized(true);
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		PersistenceHandler handler = new  OracleDBHandler();
		Party part= new Party();
		part.setPersitenceHandler(handler);
		//handler.saveParty(part);
		part.save();
		Candidate ca= new Candidate();
		ca.setPersHandler(handler);
		ca.save();
		launch(args);
	}
}