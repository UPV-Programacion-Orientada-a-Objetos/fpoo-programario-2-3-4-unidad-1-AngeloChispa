package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.utilidades.Input;

// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

public class Main {
    public static void main(String[] args) {
        
        boolean bandera = true;
        int respuesta = 0;

        Input entrada = new Input();

        while (bandera) {

            bandera = true;

            System.out.println("\n==============");
            System.out.println("Menu principal");
            System.out.println("==============\n");
    
            System.out.println("Seleccione que problemario desea ver: ");
            System.out.println("1.- Problemario 2: Estructuras selectivas.");
            System.out.println("2.- Problemario 3: Estructuras repetitivas.");
            System.out.println("3.- Problemario 4: Estructuras arreglos.");

            respuesta = (int) entrada.entradaDouble("¿Desea ejecutar otro programa?\n1.- Si\n2.-No");

            switch (respuesta) {
                case 1:
                    new ProblemarioDos();
                    break;
            
                default:
                    break;
            }

            if (respuesta != 1){
                bandera = false;
            }
            
        }

    }
}