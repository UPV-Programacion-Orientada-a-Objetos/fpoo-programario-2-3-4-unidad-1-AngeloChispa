package edu.upvictoria.fpoo.utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 */
public class Input {

    public double entradaDouble(String mensaje){

        double a = 0;
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            System.out.print(mensaje);

            try{

                bandera = false;
                a = Double.parseDouble(obj.readLine());
    
            }catch(IOException | NumberFormatException e){
    
                bandera = true;
                System.out.println("\n=======================");
                System.out.println("Solo se aceptan números");
                System.out.println("=======================\n");
            }
            
        }

        return a;

    }


}