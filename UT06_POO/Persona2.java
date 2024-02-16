package com.mycompany.ut06_poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Victor Fagúndez
 */
public class Persona2 {

    //Atributos
    private String nombre;
    private String apellido;
    private int telefono;
    private String nif;
    private static int numeroPersonas;

    //Setters
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape1) {
        this.apellido = ape1;
    }

    public void setTelefono(int tlf) {
        this.telefono = tlf;
    }

    public void setNIF(String nif) {
        try {
            comprobarNIF(nif);
            this.nif = nif;
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getTelefono() {
        return this.telefono;
    }

    //Constructores
    public Persona2() {
        numeroPersonas++;
    }

    public Persona2(String nom) {
        this.nombre = nom;
        numeroPersonas++;
    }

    //Metodos
    public static int cuentaPersonas() {
        return numeroPersonas;
    }

    public void saludo() {
        System.out.println("Hola soy " + this.nombre + " " + this.apellido
                + " mi telefono es " + this.telefono);
    }

    /**
     * Método que comprueba que el NIF sea valido
     *
     * @param nif
     * @return true si es correcto, false si no
     * @throws Exception
     */
    private boolean comprobarNIF(String nif) throws Exception {

        //Comprobamos que tenga 9 caracteres y que el ultimo caracter sea una letra
        if (nif.length() != 9 || Character.isLetter(nif.charAt(8)) == false) {
            throw new Exception("El NIF no es correcto ");
        }
        String letraMayuscula;
        letraMayuscula = (nif.substring(8)).toUpperCase();
        //Si los 8 primeros numeros no son solo numeros
        if (!soloNumeros(nif)) {
            throw new Exception("Los 8 primeros caracteres no son solo numeros");
        }
        //Si la letra que tiene no es la que le corresponde
        if (!letraNIF(nif).equals(letraMayuscula)) {
            throw new Exception("la letra no es correcta");
        }
        return true;
    }

    /**
     * Metodo que valida que los primeros 8 caracteres sean numeros, comprobando
     * caracter a caracter y comparandolo con numeros del 1 al 9.
     *
     * @return
     */
    private boolean soloNumeros(String nif) {
        int i, j = 0;
        String numero = "";
        String miNIF = "";
        String[] unoNueve = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        //recorremos las posiciones del nif
        for (i = 0; i < nif.length() - 1; i++) {
            //sacamos el numero  de esa posición
            numero = nif.substring(i, i + 1);
            //recorremos el array de 
            for (j = 0; j < unoNueve.length; j++) {
                if (numero.equals(unoNueve[j])) {
                    miNIF += unoNueve[j];
                }
            }
        }
        if (miNIF.length() != 8) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * La letra del NIF se calcula dividiendo los 8 digitos entre 23 y el resto
     * nos indica la letra que le corresponde
     *
     * @return la letra que corresponde
     */
    private String letraNIF(String nif) {
        int miDNI = Integer.parseInt(nif.substring(0, 8));
        int resto;
        String miLetra;
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
            "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        resto = miDNI % 23;
        miLetra = asignacionLetra[resto];
        return miLetra;

    }

    @Override
    public String toString() {
        return "Persona:{Nombre=" + this.nombre
                + ", NIF=" + this.nif + "}";
    }

}
