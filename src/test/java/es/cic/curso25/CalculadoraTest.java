package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(5.6);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);

        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.restar(7);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-7, valorActual, 0.000001);

        cut.restar(2);

        cut.restar(-2);
        valorActual = cut.getTotal();

        assertEquals(-7, valorActual, 0.000001, "ERROR: Fallo al restar");
    }

    

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);
        // Ejecuto
        cut.multiplicar(2);
        cut.multiplicar(-1);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(-8.4, valorActual, 0.000001, "ERROR: Fallo al multiplicar");
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        cut.dividir(2);
        cut.dividir(-3);

        // Verifico
        double valorActual = cut.getTotal();

        assertEquals(-0.7, valorActual, 0.000001, "ERROR: Fallo al dividir");
    }

    // @Disabled
    @Test
    public void testDividirPorCero() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);

        // Ejecuto
        /* Quiero que al ejecutar cut.dividir(0) me lance la excepcion especifica siguiente: ArithmeticException.class*/
        assertThrows(ArithmeticException.class, () -> cut.dividir(0));

        // Verifico
    }


     @Test
    public void testLimpiar() {
        // Preparo
        Calculadora cut = new Calculadora();
        cut.limpiar();

        // Ejecuto
        /* Quiero que al ejecutar cut.dividir(0) me lance la excepcion especifica siguiente: ArithmeticException.class*/
        assertEquals(0, cut.getTotal());

        // Verifico
    }
}
