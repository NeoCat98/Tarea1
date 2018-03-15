/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier 
 */
public class Estudiante {
    String Nombre,TipoS,EstadoF,FechaN,Dui,Carnet;
    int Edad;
    
    Estudiante(String Nombre, String TipoS, String EstadoF, String FechaN, int Edad, String Dui, String Carnet){
        this.Carnet = Carnet;
        this.Dui = Dui;
        this.Edad = Edad;
        this.EstadoF = EstadoF;
        this.FechaN = FechaN;
        this.Nombre = Nombre;
        this.TipoS = TipoS;
    }
    
    public void Datos(){
        System.out.println("Nombre Completo: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Dui: " + Dui);
        System.out.println("Tipo de Sangre: " + TipoS);
        System.out.println("Estado Familiar: " + EstadoF);
        System.out.println("Fecha de Nacimiento: " + FechaN);
        System.out.println("Carnet: " + Carnet);
    }
}