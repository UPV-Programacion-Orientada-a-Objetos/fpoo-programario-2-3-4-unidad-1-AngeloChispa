package edu.upvictoria.fpoo.utilidades;

public class RangoNumeros {
    
    public boolean limitar(long a, long min, long max){

        boolean bandera = false;

        if (a>max || a<min){

            bandera = true;

        }

        return bandera;

    }

}
