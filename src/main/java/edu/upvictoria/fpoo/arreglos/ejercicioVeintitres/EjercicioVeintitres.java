package edu.upvictoria.fpoo.arreglos.ejercicioVeintitres;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeintitres
 */
public class EjercicioVeintitres {

    public double mayorPromedio(double a, double promedio){

        if (a>promedio){
            return 1;
        }else{
            return 0;
        }

    }
    

    public EjercicioVeintitres(boolean test){

    }

    public EjercicioVeintitres(){

        double[] a = new double[100];

        double promedio = 0;
        int contador = 0;

        Input entrada = new Input();

        for (int i = 0; i<100; i++){
            a[i] = entrada.entradaDouble("Ingrese la calificación: "); 
            promedio += a[i];
            contador += mayorPromedio(a[i], promedio);
        }

        promedio /= promedio;

        System.out.println("Calificación promedio del grupo: " + promedio);

        System.out.println("Cantida de alumnos con calificación mayor al promedio: " + contador);
        

    }

}