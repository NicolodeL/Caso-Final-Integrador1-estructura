package org.example.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio1Test {
    @Test
    public void testConvertSeconds() {
        double result = Main.Ejercicio1.convertSeconds(3600);
        assertEquals(1.5, result, 0.001, "3600 seconds should be 1.5 days on the new planet");
    }

    @Test
    public void testPrintMaxValues() {
        // Este método imprime valores a la consola, por lo que puede ser difícil de probar.
        // Podrías considerar cambiar este método para que devuelva los valores en lugar de imprimirlos.
    }
}
