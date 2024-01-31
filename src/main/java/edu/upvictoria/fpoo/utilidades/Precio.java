package edu.upvictoria.fpoo.utilidades;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Precio {
    
    public double total(double cantidad, double precio){

        return cantidad*precio;
    }

    public void formato(String mensaje, double cantidad){

        BigDecimal obj = new BigDecimal(cantidad);
        obj.setScale(2, RoundingMode.DOWN);
        
        System.out.println(mensaje+obj.doubleValue());

    }

    public double porcentaje(double cantidad, double descuento){

        Math.abs(descuento);
        return cantidad*(descuento/100);

    }

}
