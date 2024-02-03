package edu.upvictoria.fpoo.arreglos.ejercicioDieciseis;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioDieciseis
 */
public class EjercicioDieciseis {

    public int mayorEdad(int[] edad){

        int posicion = 0, temp = edad[0];

        for(int i = 1; i<10; i++){

            if (temp<edad[i]){
                temp = edad[i];
                posicion = i;
            }

        }

        return posicion;
    }

    public EjercicioDieciseis(boolean test){

    }

    public EjercicioDieciseis(){

        System.out.println("\n============");
        System.out.println("Ejercicio 16");
        System.out.println("============\n");

        Input entrada = new Input();

        
        String[] nombres = new String[10];
        int[] edad = new int[10];
        int posicion = 0;
        
        for(int i = 0; i<10; i++){

            nombres[i] = entrada.entradaString("Ingrese el nombre del alumno " + i + ": ");
            edad[i] =  (int) Math.abs(entrada.entradaDouble("Ingrese la edad del alumno " + i + ": "));

        }

        posicion = mayorEdad(edad);

        System.out.println("El alumno mayor es " + nombres[posicion] + " con " + edad[posicion] + " años");

    }


}