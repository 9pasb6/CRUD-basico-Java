/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sebas
 */
public class Aplicacion extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("/View/vistaPersona.fxml"));
            Pane ventana = (Pane) loader.load();
            
            Scene scene = new Scene(ventana);
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
