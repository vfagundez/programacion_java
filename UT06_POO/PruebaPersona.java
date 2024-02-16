/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut06_poo;

/**
 *
 * @author Victor Fagúndez
 */
public class PruebaPersona {
    public static void main(String[] args){
        Persona Paco = new Persona();
        Persona Maria = new Persona();
        
        Paco.setNombre("Paco");
        Maria.setNombre("Maria");
        Paco.setApellido("Perez");
        Maria.setApellido("García");
        Paco.setTelefono(123456789);
        Maria.setTelefono(987654321);
        
        Paco.saludo();
        Maria.saludo();
    }
}
