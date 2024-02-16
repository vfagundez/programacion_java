/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut06_poo;

/**
 *
 * @author Victor Fagúndez
 */
public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(5, 10);
        System.out.println("El metodo de la clase suma devuelve " + calculadora.sumar(4,6));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.sumar(4.5,6.2));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.restar(4,6));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.sumar(4.2,6.2));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.multiplicar(4,6));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.multiplicar(4.2,6.3));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.dividir(4,6));
        System.out.println("El metodo de la clase suma devuelve " + calculadora.dividir(4.2,6.3));
        System.out.println("El imprimeSuma devuelve...");
        calculadora.imprimeSuma(8, 7);
        calculadora.restar(5, 2);
    }
}
