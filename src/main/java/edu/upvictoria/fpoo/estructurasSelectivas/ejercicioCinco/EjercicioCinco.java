package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioCinco;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioCinco
 */
public class EjercicioCinco {

    public double mayorTres(double a, double b, double c){

        double mayor = 0;

        if(a>b){
            mayor = a;
        }else{
            mayor = b;
        }

        if (c>mayor){
            mayor =c;
        }

        return mayor;

    }

    public EjercicioCinco(boolean test){

    }

    public EjercicioCinco(){

        System.out.println("\n===========");
        System.out.println("Ejercicio 5");
        System.out.println("===========\n");

        double a,b,c;

        Input entrada = new Input();

        a = entrada.entradaDouble("Ingresa un número: ");
        b = entrada.entradaDouble("Ingresa otro número: ");
        c = entrada.entradaDouble("Ingresa un 3er número: ");

        System.out.println("El número mayor es: " + mayorTres(a, b, c));        

    }

}