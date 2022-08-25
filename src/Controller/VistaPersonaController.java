/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Persona;
import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author sebas
 */
public class VistaPersonaController implements Initializable {
    Hashtable<String, Persona> tablaPersonas = new Hashtable<String, Persona>();
    @FXML
    private TextField TxtNombre;
    @FXML
    private TextField TxtDocumento;
    @FXML
    private TextField TxtEdad;
    @FXML
    private TextField TxtDireccion;
    @FXML
    private Button BtnRegistrar;
    @FXML
    private Button BtnBuscar;
    @FXML
    private Button BtnEliminar;
    @FXML
    private Button BtnConsulta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    

    @FXML
    private void ClickRegistrar(ActionEvent event) {
        Persona Persona = new Persona(TxtNombre.getText(),TxtDocumento.getText(),Integer.parseInt(TxtEdad.getText()),TxtDireccion.getText());
        Metodos.Registrar(tablaPersonas,Persona);
        TxtNombre.clear();
        TxtDocumento.clear();
        TxtEdad.clear();
        TxtDireccion.clear();
    }

    @FXML
    private void ClickBuscar(ActionEvent event) {
        String documento = JOptionPane.showInputDialog("Inserte el numero de documento a buscar");
        Metodos.Buscar(documento, tablaPersonas);
    }

    @FXML
    private void ClickEliminar(ActionEvent event) {
        String documento = JOptionPane.showInputDialog("Inserte el numero de documento a Eliminar");
        Metodos.Eliminar(documento, tablaPersonas);
    }

    @FXML
    private void ClickConsulta(ActionEvent event) throws IOException {
        
        try{
            
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/View/MostrarTabla.fxml"));
           
            Parent root =  loader.load();
            
            MostrarTablaController controlador = loader.getController();
            
            controlador.initAttributtes(tablaPersonas);
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();   
            stage.setScene(scene);
            stage.showAndWait();  
        }catch(IOException e){
            System.out.println(e.getMessage());

        }

    }
    
}
