package es.cic.curso25;

public class Coche {
    // ATRIBUTOS:
    int velocidad;
    final double CONSUMO_INSTANTANEO = 4.3;

    private Calculadora calculadora;

    // MÉTODOS:

    // Constructor
    public Coche() {
        this.calculadora = new Calculadora();
    }

    public int getVelocidad() {
        // throw new UnsupportedOperationException("No implementado aun");
        // return this.velocidad;
        return (int) calculadora.getTotal();
    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);

        // throw new UnsupportedOperationException("No implementado aun");
        // return this.CONSUMO_INSTANTANEO * this.velocidad / 100;
        double consumoActual = calculadora.getTotal();
        return consumoActual;
    }

    public int acelerar(int velocidadIncremento) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(velocidadIncremento);

        // throw new UnsupportedOperationException("No implementado aun");
        this.velocidad = (int) calculadora.getTotal();
        return this.velocidad;
    }

    public int frenar(int velocidadFrenado) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(velocidadFrenado);

        // throw new UnsupportedOperationException("No implementado aun");
        int velocidadFinal = (int) calculadora.getTotal();

        if (velocidadFinal < 0) {
            throw new ArithmeticException("La velocidad no puede ser menor que 0");
        }

        return velocidadFinal;
    }
}

