package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioCuatro;

import edu.upvictoria.fpoo.utilidades.Input;
import edu.upvictoria.fpoo.utilidades.Precio;

/**
 * EjercicioCuatro
 */
public class EjercicioCuatro {

    public EjercicioCuatro(){

        System.out.println("\n===========");
        System.out.println("Ejercicio 4");
        System.out.println("===========\n");


        double cantidad = 0;
    
        Input entrada = new Input();
        Precio obj = new Precio();

        cantidad = Math.abs(entrada.entradaDouble("Ingrese el total a pagar: "));

        if (cantidad>2500){
            System.out.println("Descuento: $" + obj.porcentaje(cantidad, 15));
            System.out.println("Precio Final: $"+ (cantidad-obj.porcentaje(cantidad,15)));
        }else{
            System.out.println("Descuento: $" + obj.porcentaje(cantidad, 8));
            System.out.println("Precio Final: $"+ (cantidad-obj.porcentaje(cantidad,8)));
        }


    }

}