/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class resultado {
    public static void main(String [] args){
        String respuesta2="";
        int respuestas1=0;
       
        automovil automovil=new automovil();
            boolean argumento=true;
        while(argumento=true){
        respuesta2=JOptionPane.showInputDialog(null,"selecciones una opcion a funcionar \n1-asignar elemento cosas\n2-filtrar por ruedas equipadas\n3salir");
       
        
        
        
        
        
        switch(respuesta2){
                case "1":
                      respuesta2=JOptionPane.showInputDialog(null,"selecciones una opcion\n1-carros\n2-motocicletas\n3bicicletas\n4camionetas");
                      switch(respuesta2){
                          case"1":
                                 respuesta2=(JOptionPane.showInputDialog(null,"digite el cilindrage"));
                                 automovil.setcilindrado(respuesta2);
                                  respuestas1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas que cuenta el vehiculo"));
                                  automovil.setruedas(respuestas1);
                                   respuestas1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el kilometrage del vehiculo ingresado"));
                                  automovil.setvelocidad(respuestas1);
                                  respuesta2=(JOptionPane.showInputDialog(null,"digite el color del vehiculo"));
                                 automovil.setcolor(respuesta2);
                                  
                              break;
                                case"2":
                                        respuesta2=(JOptionPane.showInputDialog(null,"digite el cilindrage *1,2,3,4,5,6 o mas* "));
                                 automovil.setcilindrado(respuesta2);
                                  respuestas1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas"));
                                  automovil.setruedas(respuestas1);
                                   respuestas1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el kilometrage"));
                                  automovil.setvelocidad(respuestas1);
                                  respuesta2=(JOptionPane.showInputDialog(null,"digite el color del vehiculo"));
                                        automovil.setcolor(respuesta2);
                                         break;
                                case"3":
                                    
                                 break;
                                
                              
                                case"4":
                                    
                              break;
                      }
                    break;
                    case "2":
                        respuestas1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas las cuales cuenta el vehiculo"));
                        automovil.setruedas(respuestas1);
                        if(automovil.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\nkawasaki\npeugeot\nBMW\ntrumen");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\nde carreras\ncarbono\nmountainbike\nshimano");
                        }
                        if(automovil.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\nmitsubishi\n mclaren\n porshe\n ford");
                             JOptionPane.showMessageDialog(null,"Camionetas:\ntoyota hilux\n CAT\njeep"); 
                        }
                        if(automovil.ruedas==1){
                              JOptionPane.showMessageDialog(null,"No existe un vehiculo con 1 rueda, o talvez si?");
                           
                        }
                      
                    break;
                    case "3":
                          JOptionPane.showMessageDialog(null,"gracias por usar nuestro programa");
                        System.exit(0);
                         
                    break;
        }
        }

    }   
}
