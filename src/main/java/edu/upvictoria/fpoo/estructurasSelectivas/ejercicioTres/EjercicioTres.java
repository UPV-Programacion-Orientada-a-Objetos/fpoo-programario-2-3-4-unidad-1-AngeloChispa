package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioTres;

import edu.upvictoria.fpoo.utilidades.Input;
import edu.upvictoria.fpoo.utilidades.Precio;

/**
 * EjercicioTres
 */
public class EjercicioTres {

    public EjercicioTres(){

        System.out.println("\n===========");
        System.out.println("Ejercicio 3");
        System.out.println("===========\n");

        long lapices = 0;

        Input entrada = new Input();
        Precio obj = new Precio();

        lapices = Math.abs((long) entrada.entradaDouble("Ingrese la contidad de lapices: "));

        if (lapices>=1000){
            obj.formato("El total a pagar es: $", obj.total(lapices, 3.65));
        }else{
            obj.formato("El total a pagar es: $", obj.total(lapices, 4.83));  
        }

    }




}