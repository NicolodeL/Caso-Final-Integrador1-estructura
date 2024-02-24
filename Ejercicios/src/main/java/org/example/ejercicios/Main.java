package org.example.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
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
        System.out.println();
        System.out.println("Planificador de Tareas:");
        Ejercicio4.main(args);
        System.out.println();
        System.out.println("Navegador Estelar:");
        Ejercicio5.main(args);
        System.out.println();
        System.out.println("Comunicador Interplanetario:");
        Ejercicio6.main(args);
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
    public static class Ejercicio4 {
        public class CrewMember {
            private String name;
            private int availability;

            // Constructor, getters and setters
        }

        public class Task {
            private String name;
            private int duration;

            // Constructor, getters and setters
        }
        public static class TaskScheduler {
            private List<CrewMember> crewMembers;
            private List<Task> tasks;

            public TaskScheduler(List<CrewMember> crewMembers, List<Task> tasks) {
                this.crewMembers = crewMembers;
                this.tasks = tasks;
            }

            public Map<CrewMember, List<Task>> distributeTasks() {
                // Implementa la lógica para distribuir las tareas entre los miembros de la tripulación
                return new HashMap<>();
            }

            public void displaySchedule(Map<CrewMember, List<Task>> schedule) {
                // Implementa la lógica para visualizar el horario y la carga de trabajo
            }

            public Map<CrewMember, Integer> calculateWorkload(Map<CrewMember, List<Task>> schedule) {
                // Implementa la lógica para calcular la carga de trabajo óptima para cada miembro de la tripulación
                return new HashMap<>();
            }

            public Map<CrewMember, Integer> optimizeWorkload(Map<CrewMember, Integer> workload) {
                // Implementa la lógica para optimizar la carga de trabajo entre los miembros de la tripulación
                return new HashMap<>();
            }
        }
        public static void main(String[] args) {
            List<CrewMember> crewMembers = new ArrayList<>();
            List<Task> tasks = new ArrayList<>();

            // Añade miembros de la tripulación y tareas a las listas

            TaskScheduler scheduler = new TaskScheduler(crewMembers, tasks);
            Map<CrewMember, List<Task>> schedule = scheduler.distributeTasks();
            scheduler.displaySchedule(schedule);
            Map<CrewMember, Integer> workload = scheduler.calculateWorkload(schedule);
            Map<CrewMember, Integer> optimizedWorkload = scheduler.optimizeWorkload(workload);

            // Muestra el resultado de la carga de trabajo optimizada
        }

    }
    public static class Ejercicio5 {
        private int[][] terrain;

        public Ejercicio5(int size) {
            this.terrain = new int[size][size];
        }

        public void generateTerrain() {
            // Implementa la lógica para generar el terreno
        }

        public void displayTerrain() {
            // Implementa la lógica para visualizar el terreno
        }

        public int[][] planRoute(int[][] planningMatrix) {
            // Implementa la lógica para calcular la ruta de exploración y expansión
            return new int[terrain.length][terrain[0].length];
        }

        public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
            // Implementa la lógica para multiplicar matrices
            return new int[matrixA.length][matrixB[0].length];
        }
        public static void main(String[] args) {
            // Crear una instancia de Ejercicio5
            Ejercicio5 starNavigator = new Ejercicio5(5);

            // Generar el terreno
            starNavigator.generateTerrain();

            // Mostrar el terreno
            starNavigator.displayTerrain();

            // Crear una matriz de planificación
            int[][] planningMatrix = new int[5][5];
            // Aquí puedes llenar la matriz de planificación con los valores que desees

            // Planificar una ruta
            int[][] route = starNavigator.planRoute(planningMatrix);

            // Crear dos matrices para multiplicar
            int[][] matrixA = new int[5][5];
            int[][] matrixB = new int[5][5];
            // Aquí puedes llenar las matrices con los valores que desees

            // Multiplicar las matrices
            int[][] product = Ejercicio5.multiplyMatrices(matrixA, matrixB);

            // Aquí puedes hacer algo con la ruta y el producto de las matrices, como mostrarlos
        }
    }
    public static class Ejercicio6 {
        private List<String> messageStorage;

        public Ejercicio6() {
            this.messageStorage = new ArrayList<>();
        }

        public String translateMessage(String message) {
            // Implementa la lógica para traducir el mensaje
            return "";
        }

        public boolean verifyMessage(String message) {
            // Implementa la lógica para verificar la integridad y relevancia del mensaje
            return false;
        }

        public void sendMessage(String message) {
            // Implementa la lógica para enviar un mensaje
        }

        public String receiveMessage() {
            // Implementa la lógica para recibir un mensaje
            return "";
        }

        public Map<Character, Integer> countCharacters(String message) {
            // Implementa la lógica para contar y analizar caracteres específicos en un mensaje
            return new HashMap<>();
        }

        public boolean isPalindrome(String text) {
            // Implementa la lógica para verificar si un texto es un palíndromo
            return false;
        }

        public String reverseText(String text) {
            // Implementa la lógica para revertir un texto
            return "";
        }
        public static void main(String[] args) {
            // Crear una instancia de Ejercicio6
            Ejercicio6 communicator = new Ejercicio6();

            // Traducir un mensaje
            String translatedMessage = communicator.translateMessage("Hello, world!");
            System.out.println("Translated message: " + translatedMessage);

            // Verificar un mensaje
            boolean isMessageValid = communicator.verifyMessage("Hello, world!");
            System.out.println("Is message valid: " + isMessageValid);

            // Enviar un mensaje
            communicator.sendMessage("Hello, world!");

            // Recibir un mensaje
            String receivedMessage = communicator.receiveMessage();
            System.out.println("Received message: " + receivedMessage);

            // Contar caracteres en un mensaje
            Map<Character, Integer> characterCounts = communicator.countCharacters("Hello, world!");
            System.out.println("Character counts: " + characterCounts);

            // Verificar si un texto es un palíndromo
            boolean isPalindrome = communicator.isPalindrome("racecar");
            System.out.println("Is palindrome: " + isPalindrome);

            // Revertir un texto
            String reversedText = communicator.reverseText("Hello, world!");
            System.out.println("Reversed text: " + reversedText);
        }
    }
}
