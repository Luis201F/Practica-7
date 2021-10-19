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
public class MagnumOpus extends Robot implements Actividades{
    public MagnumOpus(int nivelBateria, String nombre,int identificacion){
        super(nivelBateria, nombre, identificacion);
        System.out.println("Terminando de configurar Magnum Opus");
    }
    @Override
    public String preparaIngredientes(){
        return("Hola, me llamo Magnum Opus "+nombre+" estoy cortando la carne y picando la verdura.");
    }
    @Override
    public String cocinar(){
        return("Hola, me llamo Magnum Opus "+nombre+" cocinando los ingredientes, el platillo esta casi listo.");
    }
    @Override
    public String servir(){
        return("Hola, me llamo Magnum Opus "+nombre+" Sirviendo la comida.");
    }
}
