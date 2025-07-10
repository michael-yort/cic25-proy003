package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    // En cada @Test se creara un nuevo Coche
    @BeforeEach
    public void setUp() {
        cut = new Coche();
        cut.acelerar(50);
    }

    @Test
    void testAcelerar() {
        int velocidadFinal = cut.acelerar(23);
        assertEquals(73, velocidadFinal, "La velocidad tras la aceleración no es la esperada");
    }

    @Test
    void testFrenar() {
        int velocidadFinal = cut.frenar(23);
        assertEquals(27, velocidadFinal, "La velocidad tras frenar no es la esperada");
    }

    //@Disabled
    @Test
    void testFrenarMenosQueCero() {
        assertThrows(ArithmeticException.class, () -> cut.frenar(73),
                "La velocidad obtenida no puede ser menor que 0");
    }

    @Test
    void testGetConsumo() {
        double consumoActual = cut.getConsumo();
        assertEquals(2.15, consumoActual, "El consumo obtenido no es el esperado");
    }

    @Test
    void testGetVelocidad() {
        int velocidadFinal = cut.getVelocidad();
        assertEquals(50, velocidadFinal, "La velocidad obtenida no es la esperada");
    }
}
