package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    public void lanzame() {
        boolean valor = true;
        char letra = 'e';
        char otraLetra = "e".charAt(0);

        Coche miCoche2 = new Coche();
        Object miCoche = miCoche2;

        // El punto se ejecuta antes de los parentesis, o sea el casteo se hace despues
        // del punto y por eso salen metodos de object
        // (Coche)miCoche.

        // De esta manera se fuerza a realizar los parentesis antes que el punto y ahora
        // se mostrarian los metodos de coche
        // ((Coche)miCoche).

        Camion miCamioncito = new Camion();

        miCamioncito.meterCarga();

        GruaDelPuerto teodoro = new GruaDelPuerto();
        teodoro.meterCarga();

        Object referencia = teodoro;

        referencia.toString();
        referencia = miCamioncito;
        referencia.toString();

        //Camion no puede ser casteado a GruaDelPuerto
        ((GruaDelPuerto) referencia).meterCarga();

    }


    
    public void acelerarRemotamente(Vehiculo vehiculo, int incremento) {

        vehiculo.acelerar(incremento);

    }

    
}
