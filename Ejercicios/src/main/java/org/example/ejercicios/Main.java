package org.example.ejercicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("Cronometro Cosmico:");
        Ejercicio1.main(args);
        System.out.println();
        System.out.println("Recursos y Suministros:");
        Ejercicio2.main(args);
        System.out.println();
        System.out.println("Sistema de Alerta y Monitoreo:");
        Ejercicio3.main(args);
    }

    public static class Ejercicio1 {
        private static final double EARTH_DAYS_IN_NEW_PLANET_DAY = 1.5;

        public static double convertSeconds(long seconds) {
            double newPlanetDays = seconds / 3600.0;
            return newPlanetDays * 1.5;
        }

        public static void printMaxValues() {
            System.out.println("Max int: " + Integer.MAX_VALUE);
            System.out.println("Max long: " + Long.MAX_VALUE);
            System.out.println("Max float: " + Float.MAX_VALUE);
            System.out.println("Max double: " + Double.MAX_VALUE);
        }

        public static void main(String[] args) {
            long earthSeconds = 3600;
            double newPlanetDays = convertSeconds(earthSeconds);
            System.out.println(earthSeconds + " seconds on Earth is " + newPlanetDays + " days on the new planet.");

            printMaxValues();
        }
    }
        public static class Ejercicio2 {
            private String name;
            private double dailyConsumptionRate;
            private double weeklyConsumptionRate;
            private double monthlyConsumptionRate;

            public Ejercicio2(String name, double dailyConsumptionRate, double weeklyConsumptionRate, double monthlyConsumptionRate) {
                this.name = name;
                this.dailyConsumptionRate = dailyConsumptionRate;
                this.weeklyConsumptionRate = weeklyConsumptionRate;
                this.monthlyConsumptionRate = monthlyConsumptionRate;
            }

            public double calculateTotalConsumptionForDays(int days) {
                return dailyConsumptionRate * days;
            }

            public double calculateTotalConsumptionForWeeks(int weeks) {
                return weeklyConsumptionRate * weeks;
            }

            public double calculateTotalConsumptionForMonths(int months) {
                return monthlyConsumptionRate * months;
            }

            public double calculateAverageConsumption(int days, int weeks, int months) {
                double totalConsumption = calculateTotalConsumptionForDays(days) + calculateTotalConsumptionForWeeks(weeks) + calculateTotalConsumptionForMonths(months);
                double totalPeriods = days + (weeks * 7) + (months * 30); // Assuming 30 days in a month
                return totalConsumption / totalPeriods;
            }

            public double calculateMinimumConsumption() {
                return Math.min(dailyConsumptionRate, Math.min(weeklyConsumptionRate, monthlyConsumptionRate));
            }

            public double calculateMaximumConsumption() {
                return Math.max(dailyConsumptionRate, Math.max(weeklyConsumptionRate, monthlyConsumptionRate));
            }
            public static void main(String[] args) {
                Ejercicio2 water = new Ejercicio2("Water", 2.5, 17.5, 75);
                System.out.println("Total consumption for 10 days: " + water.calculateTotalConsumptionForDays(10));
                System.out.println("Total consumption for 2 weeks: " + water.calculateTotalConsumptionForWeeks(2));
                System.out.println("Total consumption for 3 months: " + water.calculateTotalConsumptionForMonths(3));
                System.out.println("Average consumption for 10 days, 2 weeks, and 3 months: " + water.calculateAverageConsumption(10, 2, 3));
                System.out.println("Minimum consumption: " + water.calculateMinimumConsumption());
                System.out.println("Maximum consumption: " + water.calculateMaximumConsumption());
            }
        }
    public static class Ejercicio3 {
        private double radiationLevel;
        private double temperature;
        private double pressure;

        public Ejercicio3(double radiationLevel, double temperature, double pressure) {
            this.radiationLevel = radiationLevel;
            this.temperature = temperature;
            this.pressure = pressure;
        }

        public void monitorLevels() {
            if (radiationLevel > 100) {
                System.out.println("Alert: High radiation level!");
            }
            if (temperature > 100) {
                System.out.println("Alert: High temperature!");
            }
            if (pressure > 100) {
                System.out.println("Alert: High pressure!");
            }
        }

        public void Ejercicio3() {
            if (radiationLevel > 100) {
                System.out.println("Suggestion: Decrease radiation level.");
            }
            if (temperature > 100) {
                System.out.println("Suggestion: Decrease temperature.");
            }
            if (pressure > 100) {
                System.out.println("Suggestion: Decrease pressure.");
            }
        }

        public List<Integer> identifyCriticalEvents(int n) {
            List<Integer> criticalEvents = new ArrayList<>();
            for (int i = 2; n > 0; i++) {
                if (isPrime(i)) {
                    criticalEvents.add(i);
                    n--;
                }
            }
            return criticalEvents;
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public List<Integer> decomposeIntoPrimeFactors(int num) {
            List<Integer> primeFactors = new ArrayList<>();
            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    primeFactors.add(i);
                    num /= i;
                }
            }
            return primeFactors;
        }
        public static void main(String[] args) {
            Ejercicio3 ejercicio3 = new Ejercicio3(150, 110, 90);
            ejercicio3.monitorLevels();
            ejercicio3.Ejercicio3();
            System.out.println("Critical events: " + ejercicio3.identifyCriticalEvents(5));
            System.out.println("Prime factors: " + ejercicio3.decomposeIntoPrimeFactors(60));
    }
    }
}
