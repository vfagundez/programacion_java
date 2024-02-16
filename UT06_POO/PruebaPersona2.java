/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut06_poo;

/**
 *
 * @author Victor Fagúndez
 */
public class PruebaPersona2 {
    public static void main(String[] args){
        Persona2 Paco = new Persona2();
        Persona2 Maria = new Persona2();
        
        Paco.setNombre("Paco");
        Maria.setNombre("Maria");
        Paco.setApellido("Perez");
        Maria.setApellido("García");
        Paco.setTelefono(123456789);
        Maria.setTelefono(987654321);
        try{
            Maria.setNIF("12345678Z");
        }catch(Exception e){
            System.err.println(e.toString());
        }
            
        
        Paco.saludo();
        Maria.saludo();
        System.out.println(Maria);
        System.out.println("El numero de Personas es: "+ Persona2.cuentaPersonas());
        

    }
}
