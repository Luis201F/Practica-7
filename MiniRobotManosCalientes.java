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
public class MiniRobotManosCalientes extends Robot implements Actividades {
public boolean actividadR= false;
    public boolean actividad;
    public MiniRobotManosCalientes(int nivelBateria, String nombre,int identificacion){
        super(nivelBateria, nombre, identificacion);
        System.out.println("Terminando de configurar Mini Robot");
    }
   @Override
    public String preparaIngredientes(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Manos Calientes"+nombre+"no soy bueno cortando la carne y picando la verdura.");
    }
    @Override
    public String cocinar(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Manos Calientes"+nombre+"soy bueno cocinando los ingredientes.");
    }
    @Override
    public String servir(){
        actividadR=true;
        return("Hola, me llamo Mini Robot Manos Calientes"+nombre+"no soy bueno sirviendo la comida.");
    }
}    
