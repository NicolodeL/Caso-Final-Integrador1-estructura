package org.example.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio3Test {

    @Test
    public void testIdentifyCriticalEvents() {
        Main.Ejercicio3 monitor = new Main.Ejercicio3(150, 110, 90);
        assertEquals(monitor.identifyCriticalEvents(5), List.of(2, 3, 5, 7, 11), "The first 5 prime numbers should be 2, 3, 5, 7, 11");
    }

    @Test
    public void testDecomposeIntoPrimeFactors() {
        Main.Ejercicio3 monitor = new Main.Ejercicio3(150, 110, 90);
        assertEquals(monitor.decomposeIntoPrimeFactors(60), List.of(2, 2, 3, 5), "The prime factors of 60 should be 2, 2, 3, 5");
    }
}