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

        
    }
}
