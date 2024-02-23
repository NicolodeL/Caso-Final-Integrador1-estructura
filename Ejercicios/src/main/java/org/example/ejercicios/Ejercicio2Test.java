package org.example.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio2Test {

    @Test
    public void testCalculateTotalConsumptionForDays() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateTotalConsumptionForDays(10);
        assertEquals(25.0, result, 0.001, "Total consumption for 10 days should be 25.0");
    }

    @Test
    public void testCalculateTotalConsumptionForWeeks() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateTotalConsumptionForWeeks(2);
        assertEquals(35.0, result, 0.001, "Total consumption for 2 weeks should be 35.0");
    }

    @Test
    public void testCalculateTotalConsumptionForMonths() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateTotalConsumptionForMonths(3);
        assertEquals(225.0, result, 0.001, "Total consumption for 3 months should be 225.0");
    }

    @Test
    public void testCalculateAverageConsumption() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateAverageConsumption(10, 2, 3);
        assertEquals(2.5, result, 0.001, "Average consumption for 10 days, 2 weeks, and 3 months should be 2.5");
    }

    @Test
    public void testCalculateMinimumConsumption() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateMinimumConsumption();
        assertEquals(2.5, result, 0.001, "Minimum consumption should be 2.5");
    }

    @Test
    public void testCalculateMaximumConsumption() {
        Main.Ejercicio2 water = new Main.Ejercicio2("Water", 2.5, 17.5, 75);
        double result = water.calculateMaximumConsumption();
        assertEquals(75.0, result, 0.001, "Maximum consumption should be 75.0");
    }
}