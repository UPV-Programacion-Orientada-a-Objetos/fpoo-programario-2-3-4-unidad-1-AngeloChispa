package edu.upvictoria.fpoo.arreglos.ejercicioVeinticinco;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeinticinco
 */
public class EjercicioVeinticinco {

    public EjercicioVeinticinco(boolean test){

    }

    public EjercicioVeinticinco(){

        Input entrada = new Input();

        int n = 0, m = 0;
        long negativos = 0, igual = 0;
        double[][] matriz;

        n = (int) entrada.entradaDouble("Ingresa un valor para las filas: ");
        m = (int) entrada.entradaDouble("Ingresa la cantidad de columnas: ");

        matriz  = new double[n][m];

        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matriz[i][j] = entrada.entradaDouble("Ingresa un numero: ");

                if (matriz[i][j]<0){
                    negativos += 1;
                }

                if (i == j && matriz[i][j] == 0){

                    igual += 1;                    

                }

            }
        }


        System.out.println("La cantidad de negativos son: " + negativos);
        System.out.println("La cantidad de iguales a 0 son: " + igual);


    }


}