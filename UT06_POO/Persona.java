package com.mycompany.ut06_poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor Fagúndez
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String ape1){
        this.apellido = ape1;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setTelefono(int tlf){
        this.telefono = tlf;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void saludo(){
        System.out.println("Hola soy "+ this.nombre +" " + this.apellido +
                " mi telefono es " +this.telefono);
    }
    public Persona(){
        
    }
    public Persona(String nom){
        this.nombre =nom;
    }
    
    
}
