package es.cic.curso25;

public class Coche {
    public static final double CONSUMO_INSTANTANEO = 4.3;
    private int velocidad = 0;

    public int getVelocidad() {
        // TODO: Pendiente de completar
        // Usado para avisar que esta funcion NO ESTA IMPLEMENTADA
        // throw new UnsupportedOperationException("No implementado aun");

        return this.velocidad;
    }

    public double getConsumo() {
        //CONSUMO = Velocidad / 100 km X CONSUMO_INSTANTANEO
        return (double) velocidad / 100 * CONSUMO_INSTANTANEO; // Opera de izquierda a derecha
        // return velocidad / 100.0 * CONSUMO_INSTANTANEO;
    }

    public int acelerar(int incrementoDeVelocidad) {

        this.velocidad += incrementoDeVelocidad;
        return this.velocidad;
    }

    public int frenar(int decrementoDeVelocidad) {

        this.velocidad -= decrementoDeVelocidad;
        return this.velocidad;
    }

}
