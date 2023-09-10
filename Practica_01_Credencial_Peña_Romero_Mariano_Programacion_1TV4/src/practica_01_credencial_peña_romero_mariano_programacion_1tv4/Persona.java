/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_01_credencial_peña_romero_mariano_programacion_1tv4;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author onair
 */
public class Persona {
    
    public String nombre;
    
    public int edad;
    
    public String alergias;
    
    public String sangre;
    
    public String direccion;
    
    public void Ingresar_Datos() {
        
       File archivo; 
       int opcion, opcion2, opcion3; 
       String[] tipo = {"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"};
        
       nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ", "GYM center", 3);
        
       edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad: ", "GYM Center", 3));
       
       opcion = JOptionPane.showConfirmDialog(null, "Presentas alguna alergia?", "GYM Center", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (opcion == 0) 
                alergias = JOptionPane.showInputDialog(null, "Ingrese sus alergias separadas con coma: ", "GYM Center", JOptionPane.CANCEL_OPTION);
         
       opcion2 = JOptionPane.showOptionDialog(null, "Que tipo de sangre eres? ", "GYM Center", 0, JOptionPane.QUESTION_MESSAGE, null, tipo, "O+");
       
       sangre = tipo[opcion2];
       
       opcion3 = JOptionPane.showConfirmDialog(null, "Ingresa tu imagen de perfil: ", "GYM Center", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
                if (opcion3 == 0) {

                      JFileChooser chosser = new JFileChooser("");

                      int response;

                      chosser.setFileSelectionMode(JFileChooser.FILES_ONLY);

                      response = chosser.showOpenDialog(null);

                             if(response == JFileChooser.APPROVE_OPTION) {

                                 archivo = chosser.getSelectedFile();
                                    direccion = archivo.getAbsolutePath();

                              }

                }
        
        
        
    }
    
    public void Mostrar_Credencial() {
        
        ImageIcon icono = new ImageIcon(direccion);
        
        //Esto lo hago para redimensionar la imagen
        
        ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
      
        JOptionPane.showMessageDialog(null, "Nombre: " +nombre+ "\nEdad: " +edad+ "\nAlergico a: " +alergias+ "\nTipo de Sangre: " +sangre, "Datos de Socio - GYM Center", 0, icon);
        
    }
    
}
