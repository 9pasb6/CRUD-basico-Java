/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Persona;
import java.net.URL;
import java.util.Hashtable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author sebas
 */
public class MostrarTablaController implements Initializable {

    @FXML
    private TableView<Persona> tblPersona;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colDocumeto;
    @FXML
    private TableColumn colEdad;
    @FXML
    private TableColumn colDireccion;
    private Hashtable<String, Persona> tablaPersonas;
    private ObservableList<Persona> personas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        personas = FXCollections.observableArrayList();
        this.tblPersona.setItems(personas);
        
        
        
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colDocumeto.setCellValueFactory(new PropertyValueFactory("documento"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory("direccion"));
    }

    public void initAttributtes(Hashtable<String, Persona> tablaPersonas){
        this.tablaPersonas = tablaPersonas;
        
        for(Persona persona : tablaPersonas.values()){
            personas.add(persona);
        }
        
    }
    
}
