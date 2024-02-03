package edu.upvictoria.fpoo.arreglos.ejercicioVeintiocho;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeintiocho
 */
public class EjercicioVeintiocho {

    public EjercicioVeintiocho(boolean test){

    }

    public EjercicioVeintiocho(){

        int n = 0, m = 0;
        double[][] matriz;

        Input entrada = new Input();

        n = (int) entrada.entradaDouble("Ingrese el tamaño del primer vector: ");
        m = (int) entrada.entradaDouble("Ingrese el tamaño del segundo vector: ");

        matriz = new double[n][m];

        salir:
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                if (matriz[i][j]<0){
                    System.out.println("El número negativo esta en: " + i + "," + j);
                    break salir;
                }

            }
        }

    }


}