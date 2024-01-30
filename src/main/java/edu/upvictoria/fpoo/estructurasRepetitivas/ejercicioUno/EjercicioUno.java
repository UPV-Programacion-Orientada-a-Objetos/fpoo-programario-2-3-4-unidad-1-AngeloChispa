package edu.upvictoria.fpoo.estructurasRepetitivas.ejercicioUno;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioUno
 */
public class EjercicioUno {

    public double mayor(double a, double b){

        if (a>b){
            return a;
        }else{
            return b;
        }

    }

    public EjercicioUno(String test){

    }

    public EjercicioUno(){

        System.out.println("\n=========================");
        System.out.println("Ejercicio 1: Número mayor");
        System.out.println("=========================\n");

        double a = 0, b = 0;

        Input entrada = new Input();

        a = entrada.entradaDouble("Ingresa un número: ");
        b = entrada.entradaDouble("Ingresa otro número: ");

        System.out.println("El número mayor es: "+ mayor(a, b));        

    }

    
}