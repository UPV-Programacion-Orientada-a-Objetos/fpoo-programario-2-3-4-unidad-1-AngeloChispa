package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * ProblemarioDos
 */
public class ProblemarioDos {

    public ProblemarioDos(){

        boolean bandera = true;
        double respuesta = 0;

        Input entrada = new Input();

        while (bandera) {

            bandera = true;

            System.out.println("\n==================");
            System.out.println("Menu Problemario 2");
            System.out.println("==================\n");
    
            System.out.println("1.- Problemario 2: Estructuras selectivas.");
            System.out.println("2.- Problemario 3: Estructuras repetitivas.");
            System.out.println("3.- Problemario 4: Estructuras arreglos.");
            respuesta = entrada.entradaDouble("Seleccione un programa: ");

            switch ((int)respuesta) {
                case 1:
                    
                    break;
            
            }


            respuesta = entrada.entradaLong("¿Desea ejecutar otro programa?\n1.- Si\n2.-No");

            if (respuesta != 1){
                bandera = false;
            }

        }
    }
}