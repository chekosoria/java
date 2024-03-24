import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        try (/*
              * Hacer un programa que solicite al usuario 3 números con decimal que serán
              * calificaciones
              * El programa debe sumar e imprimir el resultado
              */
                Scanner entrada = new Scanner(System.in)) {
            double materia1, materia2, materia3;

            System.out.println("Ingrese la primera calificacion: ");
            materia1 = entrada.nextDouble();
            System.out.println("Ingrese la primera calificacion: ");
            materia2 = entrada.nextDouble();
            System.out.println("Ingrese la primera calificacion: ");
            materia3 = entrada.nextDouble();

            double suma = materia1 + materia2 + materia3;
            double promedio = suma / 3;

            System.out.println("La suma de las calificaciones es: " + suma);
            System.out.println("El promedio de las calificaciones es: " + promedio);
        }
    }
}
