/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Persona;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Metodos {
    
    
    
    static void Registrar(Hashtable<String, Persona> tablaPersonas, Persona persona){
        
        if(!tablaPersonas.containsKey(persona.getDocumento())){
            tablaPersonas.put(persona.getDocumento(),persona);
            JOptionPane.showMessageDialog(null,"Persona registrada con exito");
        }else{
            JOptionPane.showMessageDialog(null,"Error, el usuario que intenta registrar ya existe");
            
        }
        
        
    }
    
    static void Eliminar(String documento, Hashtable<String, Persona> tablaPersonas){
        
        if(tablaPersonas.containsKey(documento)){
            Persona persona = tablaPersonas.get(documento);
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Deseaa elimiar el siguiente usuario?\n"+persona.toString(),"Escoja una opcion",JOptionPane.YES_NO_OPTION);
            
            if(confirmar == 0){
                tablaPersonas.remove(documento);
                JOptionPane.showMessageDialog(null,"Eliminado con exito");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Error, el usuario que intenta eliminar no existe");
            
        }
    }
    
    static void Buscar(String documento, Hashtable<String, Persona> tablaPersonas){
        
        if(tablaPersonas.containsKey(documento)){
            Persona persona = tablaPersonas.get(documento);
            JOptionPane.showMessageDialog(null,persona.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Error, la persona que quiere buscar no existe");
        }
        
        
    }
    
}

