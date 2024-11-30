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

    
}
