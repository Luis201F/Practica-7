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
public class Main {
    public static void main(String[] args){
        System.out.println("Magnum Opus:");
        MagnumOpus magnumOpus1= new MagnumOpus(CapturaEntrada.capturarEntero("Ingresa el nivel de bateria"), CapturaEntrada.capturarCadena("Ingresa el nombre"), CapturaEntrada.capturarEntero("Ingresa el numero de identificacion"));
        System.out.println("Mini Robot Cuchillos:");
        MiniRobotCuchillos miniC= new MiniRobotCuchillos(CapturaEntrada.capturarEntero("Ingresa el nivel de bateria"), CapturaEntrada.capturarCadena("Ingresa el nombre"), CapturaEntrada.capturarEntero("Ingresa el numero de identificacion"));
        System.out.println("Mini Robot Manos Calientes:");
        MiniRobotManosCalientes miniM=new MiniRobotManosCalientes(CapturaEntrada.capturarEntero("Ingresa el nivel de bateria"), CapturaEntrada.capturarCadena("Ingresa el nombre"), CapturaEntrada.capturarEntero("Ingresa el numero de identificacion"));
       int opcion, act,i=0;
       do{
           opcion=0;
           act=0;
            do{
                System.out.println("Seleccione un robot:");
                System.out.println("1."+magnumOpus1.getNombre());
                System.out.println("2."+miniC.getNombre());
                System.out.println("3."+miniM.getNombre());
                opcion=CapturaEntrada.capturarEntero("Opcion");
                if(opcion==2&& miniC.actividadR||(opcion==3&&miniM.actividadR)){
                    System.out.println("Cuando se selecciona un mini Robot este solo puede ralizar una tarea, ingrese otro.");
                    opcion=CapturaEntrada.capturarEntero("Opcion");
                }
            }while(opcion<=0||opcion>=5);
            do{
                System.out.println("Seleccione una actividad:");
                System.out.println("1.Preparar Ingredientes");
                System.out.println("2.Cocinar");
                System.out.println("3.Servir");
                act=CapturaEntrada.capturarEntero("Opcion");
                if(!(act==(i+1))){
                    System.out.println("La actividad anterior no pudo ser procesada.");
                    act=0;
                }
            }while(act>=4||act<=0);
       if((opcion == 2 && act == 2)||(opcion==2 && act==3)){
            String continuar =CapturaEntrada.capturarCadena("Robot Cuchillos no puede realizar la actividad, desea continuar? [S/N]");
            if(continuar.toLowerCase().equals("n")){
                System.out.println("Regresando...");
                opcion = 0;
                act = 0;
            }
        }
        if((opcion==3 && act==1)||(opcion==3 && act==3)){
            String continuar=CapturaEntrada.capturarCadena("Robot manos calientes no puede realizar la actividad, desea continuar? [S/N]");
            if(!continuar.toLowerCase().equals("s")){
            System.out.println("Regresando...");
            opcion = 0;
            act = 0;
            }
        }
        switch(opcion){
            case 1:{
                switch(act){
                    case 1: {
                        System.out.println(magnumOpus1.preparaIngredientes());
                        magnumOpus1.setUltimaAccion("Preparo los ingredientes");
                        break;
                    }
                    case 2:{
                        System.out.println(magnumOpus1.cocinar());
                        magnumOpus1.setUltimaAccion("Cocino");
                        break;
                    }
                    case 3:{
                        System.out.println(magnumOpus1.servir());
                        magnumOpus1.setUltimaAccion("Sirvio platos");
                        break;
                    }
                }
            }
            break;
            case 2:{
                switch(act){
                    case 1: {
                        System.out.println(miniC.preparaIngredientes());
                        miniC.actividad = true;
                        miniC.setUltimaAccion("Preparo los ingredientes.");
                        miniC.actividadR = true;
                        break;
                    }
                    case 2:{
                        System.out.println(miniC.cocinar());
                        miniC.actividad = false;
                        miniC.setUltimaAccion("Cocino.");
                        miniC.actividadR = true;
                        break;
                    }
                    case 3:{
                        System.out.println(miniC.servir());
                        miniC.actividad =false;
                        miniC.setUltimaAccion("Sirvio un platillo.");
                        miniC.actividadR = true;
                        break;
                    }
                }
            break;
            }
            case 3:{
                switch(act){
                    case 1: {
                        System.out.println(miniM.preparaIngredientes());
                        miniM.actividad = false;
                        miniM.setUltimaAccion("Preparo los ingredientes.");
                        miniM.actividadR = true;
                        break;
                    }
                    case 2:{
                        System.out.println(miniM.cocinar());
                        miniM.actividad = true;
                        miniM.setUltimaAccion("Cocino");
                        miniM.actividadR = true;
                        break;
                    }
                    case 3:{
                        System.out.println(miniM.servir());
                        miniM.actividad = false;
                        miniM.setUltimaAccion("Sirvio un platillo");
                        miniM.actividadR = true;
                        break;
                    }
                }
            break;
            }
        }
    i++;
    }while(act!=3);
    if(miniC.getUltimaAccion()== null && miniM.getUltimaAccion() == null){
            System.out.println("Magnum Opus ha logrado todo!");
    }
    else if(miniC.getUltimaAccion()!= null && miniM.getUltimaAccion()==null){
        if(miniC.actividad == true){
             System.out.println("Buen trabajo con el plato, gusto a los clientes.");
        }
        else{
             System.out.println("Hay que seguir mejorando");
        }
    }
    else if(miniC.getUltimaAccion() == null && miniM.getUltimaAccion()!=null){
        if(miniM.actividad == true){
        System.out.println("Buen trabajo con el plato, gusto a los clientes.");
        }
        else{
        System.out.println("Hay que seguir mejorando");
        }
    }
    else if(miniM.actividad == true && miniM.actividad== true){
        System.out.println("Buen trabajo con el plato, gusto a los clientes.");
    }
    else if((miniC.actividad == false &&miniM.actividad == true)||(miniC.actividad == true && miniM.actividad == false)){
        System.out.println("Hay que seguir mejorando");
    }
    else if(miniC.actividad == false &&miniM.actividad == false){
        System.out.println("El plato no ha quedado muy bueno");
    }           
    }
}

