package edu.upvictoria.fpoo.arreglos.ejercicioVeintiuno;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeintiuno
 */
public class EjercicioVeintiuno {

    public boolean diagonalIgual(int n, double[][] matriz, double matrizDos[][]){

        boolean bandera = true;
        outerLoop:
        for(int i = 0; i<n; i++){

            if (matriz[i][i] != matrizDos[i][i]){

                bandera = false;

                break outerLoop;

            }

        }

        return true;

    }

    public EjercicioVeintiuno(boolean test){

    }


    public EjercicioVeintiuno(){

        int n = 0;  
        
        double[][] matriz, matrizDos;

        Input entrada = new Input();

        n = (int) entrada.entradaDouble("Ingrese el número de filas y de columnas: ");

        matriz = new double[n][n];
        matrizDos = new double[n][n];


        if(diagonalIgual(n, matriz, matrizDos)){

            System.out.println("La diagonal si es igual");

        }else{

            System.out.println("La diagonal no es igual");
        }

        
    }


}