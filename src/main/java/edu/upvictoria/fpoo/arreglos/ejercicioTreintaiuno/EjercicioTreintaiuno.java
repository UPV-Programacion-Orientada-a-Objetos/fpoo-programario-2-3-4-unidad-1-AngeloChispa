package edu.upvictoria.fpoo.arreglos.ejercicioTreintaiuno;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioTreintaiuno
 */
public class EjercicioTreintaiuno {

    public EjercicioTreintaiuno(boolean test){

    }

    public EjercicioTreintaiuno(){

        Input entrada = new Input();

        int n = 0;

        long par = 0, impar = 0;

        n = (int) Math.abs(entrada.entradaDouble("Ingresa un número: "));

        double[][] matriz = new double[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                if (matriz[i][j]%2 == 0){
                    par +=1;
                }else{
                    impar +=1;
                }

            }
        }

        System.out.println("Numeros pares: " + par + "\n Numeros impares:  " + impar );
        
    }




}