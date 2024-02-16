/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ut06_poo;

/**
 *
 * @author Victor Fagúndez
 */
public class Perro {
    private int edad;
    private char color;
    
    /**
     * Funcion que establece la edad del objeto perro
     * @param e un entero con la edad
     */
    public void setEdad(int e){
        this.edad = e;
    }
    public void setColor(char c){
        this.color = c;
    }
    public void printColor(){
        switch(color){
            case 'c' : System.out.println("Marron");break;
            case 'g' : System.out.println("Gris");break;
            case 'n' : System.out.println("Negro");break;
            case 'b' : System.out.println("Blanco");break;
            default: System.out.println("No se ha establecido ningún color");
        }
    }
    public void printEdad(){
        System.out.print("la edad es" + edad);
    }
    

}
