package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioDos;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * ejercicioDos
 */
public class EjercicioDos {

    public EjercicioDos (boolean test){

    }

    public boolean mayorMenor(double a){

        if (a>=0){
            return true;
        }else{
            return false;
        }

    }

    public EjercicioDos(){

        System.out.println("\n=======================================");
        System.out.println("Ejercicio 2: Número Positivo o Negativo");
        System.out.println("=======================================\n");

        double a = 0;

        Input entrada = new Input();

        a = entrada.entradaDouble("Ingresa un número");
        
        if (mayorMenor(a)){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }

    }    

}