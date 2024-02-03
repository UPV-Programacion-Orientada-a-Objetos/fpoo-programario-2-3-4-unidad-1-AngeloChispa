package edu.upvictoria.fpoo.arreglos.ejercicioDiecinueve;

/**
 * EjercicioDiecinueve
 */
public class EjercicioDiecinueve {

    public double[] menorElemento(double[][] matriz){

        double[] propiedades = new double[3];
        propiedades[0] = matriz[0][0];


        for(int i = 0; i<15; i++){
            for(int j = 0; j<12; j++){
                if (matriz[i][j]<propiedades[0]){
                    propiedades[0] = matriz[i][j];
                }

                if (i<5){
                    propiedades[1] += matriz[i][j];
                }

                if (matriz[i][j]<0){
                    propiedades[2]++;
                }
            }

        }

        return propiedades;
    }

    public EjercicioDiecinueve(boolean test){

    }

    public EjercicioDiecinueve(){

        double[][] matriz = new double[15][12];

        double[] propiedades;

        for(int i = 0; i<15; i++){
            for(int j = 0; j<12; j++){

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println();
        }

        propiedades = menorElemento(matriz);

        System.out.println("El menor número en la matriz es: " + propiedades[0]);
        System.out.println("El resultado de la suma de las primeras 5 filas es: " + propiedades[1]);
        System.out.println("La cantidad de números negativos en la matriz es: " + propiedades[2]);


    }    

}