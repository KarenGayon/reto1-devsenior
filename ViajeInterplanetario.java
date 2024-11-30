import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ViajeInterplanetario {
    static class Planeta {
        String nombre;
        double distancia; // Distancia desde la Tierra en millones de kilómetros.

        public Planeta(String nombre, double distancia) {
            this.nombre = nombre;
            this.distancia = distancia;
        }
    }

    static class Nave {
        String nombre;
        double velocidad; // En kilómetros por hora.
        double combustible; // En litros.
        double oxigeno; // En horas de soporte de vida.

        public Nave(String nombre, double velocidad, double combustible, double oxigeno) {
            this.nombre = nombre;
            this.velocidad = velocidad;
            this.combustible = combustible;
            this.oxigeno = oxigeno;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lista de planetas del sistema solar
        ArrayList<Planeta> planetas = new ArrayList<>();
        planetas.add(new Planeta("Mercurio", 91.69));
        planetas.add(new Planeta("Venus", 41.40));
        planetas.add(new Planeta("Marte", 78.34));
        planetas.add(new Planeta("Júpiter", 628.73));
        planetas.add(new Planeta("Saturno", 1275.0));
        planetas.add(new Planeta("Urano", 2721.0));
        planetas.add(new Planeta("Neptuno", 4351.0));

        // Creación de naves
        ArrayList<Nave> naves = new ArrayList<>();
        naves.add(new Nave("Nave A", 500000, 100000000, 2000));
        naves.add(new Nave("Nave B", 600000, 150000000, 2500));
        naves.add(new Nave("Nave C", 450000, 900000000, 180030));

        // Selección de nave
        System.out.println("Selecciona tu nave:");
        for (int i = 0; i < naves.size(); i++) {
            System.out.println((i + 1) + ". " + naves.get(i).nombre + " - Velocidad: " + naves.get(i).velocidad + " km/h");
        }
        System.out.print("Opción: ");
        int opcionNave = scanner.nextInt();
        Nave naveSeleccionada = naves.get(opcionNave - 1);

        // Selección de destino
        System.out.println("Destinos disponibles:");
        for (int i = 0; i < planetas.size(); i++) {
            System.out.println((i + 1) + ". " + planetas.get(i).nombre);
        }
        System.out.print("Selecciona tu destino (1-" + planetas.size() + "): ");
        int opcionDestino = scanner.nextInt();
        Planeta destino = planetas.get(opcionDestino - 1);

        double distanciaKm = destino.distancia * 1000000;
        double tiempoHoras = distanciaKm / naveSeleccionada.velocidad;
        double combustibleRequerido = distanciaKm / 10;
        double oxigenoRequerido = tiempoHoras;

        System.out.printf("Distancia: %.2f km%nTiempo estimado: %.2f horas%n", distanciaKm, tiempoHoras);
        System.out.printf("Combustible requerido: %.2f litros%nOxígeno requerido: %.2f horas%n", combustibleRequerido, oxigenoRequerido);

        // Ajuste de recursos
        System.out.println("\n¿Deseas ajustar los recursos antes del viaje? (SI/NO)");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("SI")) {
            System.out.print("Introduce la cantidad de combustible adicional: ");
            double extraCombustible = scanner.nextDouble();
            System.out.print("Introduce la cantidad de oxígeno adicional: ");
            double extraOxigeno = scanner.nextDouble();

            naveSeleccionada.combustible += extraCombustible;
            naveSeleccionada.oxigeno += extraOxigeno;
        }

        // Recalcular y verificar si los recursos son suficientes
        if (naveSeleccionada.combustible < combustibleRequerido) {
            System.out.printf("Combustible insuficiente. Necesitas al menos %.2f litros y tienes %.2f litros.%n",
                    combustibleRequerido, naveSeleccionada.combustible);
            return;
        }
        if (naveSeleccionada.oxigeno < oxigenoRequerido) {
            System.out.printf("Oxígeno insuficiente. Necesitas al menos %.2f horas de oxígeno y tienes %.2f horas.%n",
                    oxigenoRequerido, naveSeleccionada.oxigeno);
            return;
        }

        
}
