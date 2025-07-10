package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    // En cada @Test se creara un nuevo Coche
    @BeforeEach
    public void setUp() {

        cut = new Coche();
    }

    // @Disabled: Este test no se ejecutara.
    @Disabled
    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);

        assertEquals(57, velocidadFinal);

    }

    @Disabled
    @Test
    void testFrenar() {

        cut.acelerar(50);
        int velocidadFinal = cut.frenar(23);

        assertEquals(27, velocidadFinal);
    }

    @Disabled
    @Test
    void testGetConsumo() {
        cut.acelerar(50);
        double consumoActual = cut.getConsumo();

        assertEquals(2.15, consumoActual);
    }

    @Disabled
    @Test
    void testGetVelocidad() {

        cut.acelerar(50);
        int velocidadFinal = cut.getVelocidad();

        assertEquals(50, velocidadFinal);
    }
}
