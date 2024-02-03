package edu.upvictoria.fpoo.arreglos.ejercicioVeintidos;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeintiDos
 */
public class EjercicioVeintiDos {

    public double quitarNegativos(double a){

        if(a<0){
            return 0;
        }else{
            return a;
        }

    }


    public EjercicioVeintiDos(boolean test){

    }

    public EjercicioVeintiDos(){

        double[][] matriz = new double[12][19];

        Input entrada = new Input();

        for(int i = 0; i<12; i++){

            for(int j = 0; j<19; j++){

                matriz[i][j] = entrada.entradaDouble("Ingresa un número: ");

                matriz[i][j] = quitarNegativos(matriz[i][j]);

            }

        }

        System.out.println("Matriz final");

        for(int i = 0; i<12; i++){

            for(int j = 0; j<19; j++){

                System.out.print("["+matriz[i][j]+"]");

            }
            System.out.println();
        }

    }


}