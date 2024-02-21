package org.example;

public class Ejercicio1 {
    private static final double EARTH_DAYS_IN_NEW_PLANET_DAY = 1.5;

    public static double convertSeconds(double seconds) {
        return seconds / (EARTH_DAYS_IN_NEW_PLANET_DAY * 24 * 60 * 60);
    }

    public static double convertMinutes(double minutes) {
        return minutes / (EARTH_DAYS_IN_NEW_PLANET_DAY * 24 * 60);
    }

    public static double convertHours(double hours) {
        return hours / (EARTH_DAYS_IN_NEW_PLANET_DAY * 24);
    }

    public static double convertDays(double days) {
        return days / EARTH_DAYS_IN_NEW_PLANET_DAY;
    }

    public static double convertYears(double years) {
        return years / (EARTH_DAYS_IN_NEW_PLANET_DAY * 365);
    }

    public static void printMaxValues() {
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Max double: " + Double.MAX_VALUE);
    }

    public static void main(String[] args) {
        // Aquí puedes llamar a los métodos de conversión y printMaxValues
        // Por ejemplo:
        double earthSeconds = 3600;
        double newPlanetSeconds = convertSeconds(earthSeconds);
        System.out.println(earthSeconds + " seconds on Earth is " + newPlanetSeconds + " seconds on the new planet.");

        printMaxValues();
    }
}
