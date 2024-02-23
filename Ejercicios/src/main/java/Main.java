import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cronometro Cosmico:");
        Ejercicio1.main(args);
        System.out.println();
        System.out.println("Recursos y Suministros:");
        Ejercicio2.main(args);
    }

    public static class Ejercicio1 {
        private static final double EARTH_DAYS_IN_NEW_PLANET_DAY = 1.5;

        public static double convertSeconds(long seconds) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(seconds * 1000)); // Convertir segundos a milisegundos
            double days = calendar.get(Calendar.DAY_OF_YEAR) + calendar.get(Calendar.HOUR_OF_DAY) / 24.0 + calendar.get(Calendar.MINUTE) / (24.0 * 60) + calendar.get(Calendar.SECOND) / (24.0 * 60 * 60);
            return days / EARTH_DAYS_IN_NEW_PLANET_DAY;
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

    }
