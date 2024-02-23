import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ejercicio1.main(args);
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
}