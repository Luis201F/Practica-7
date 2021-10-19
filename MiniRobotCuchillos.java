/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7;

/**
 *
 * @author Luis
 */
public class MiniRobotCuchillos extends Robot implements Actividades {
public boolean actividadR= false;
    public boolean actividad;
    public MiniRobotCuchillos(int nivelBateria, String nombre,int identificacion){
        super(nivelBateria, nombre, identificacion);
        System.out.println("Terminando de configurar Mini Robot");
    }
   @Override
    public String preparaIngredientes(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Cuchillos"+nombre+" estoy cortando la carne y picando la verdura.");
    }
    @Override
    public String cocinar(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Cuchillos"+nombre+"no soy bueno cocinando los ingrediente.");
    }
    @Override
    public String servir(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Cuchillos"+nombre+"no soy bueno sirviendo la comida.");
    }
}    
