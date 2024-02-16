/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut06_poo;

/**
 * Clase con los métodos propios de una calculadora
 * @version 1.0
 * @author Victor Fagúndez
 */
public class Calculadora {
    public void imprimeSuma(int a,int b){
        int total = a+b;
        System.out.print("El valor de la suma es: " + total);
    }
    public int sumar(int a,int b){
        return a+b;
    }
    public double sumar(double a, double b){
        return a+b;
    }
    public int restar(int a, int b){
        return a-b;
    }
    /**
     * Función que resta dos numeros tipo double
     * @param a el primer decimal   
     * @param b el segundo decimal
     * @return la resta
     */
    public double restar(double a, double b){
        return a-b;
    }
    public int multiplicar(int a, int b){
        return a*b;
    }
    public double multiplicar(double a,double b){
        return a*b;
    }
    public int dividir(int a, int b){
        return a/b;
    }
    public double dividir(double a, double b){
        return a/b;
    }
        
}
