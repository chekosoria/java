import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (
                /*
                 * Construir un programa que, dado un número total de horas devuelve el
                 * número de semanas, días, y horas equivalentes. Por ejemplo dado un
                 * total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas
                 */
                Scanner entrada = new Scanner(System.in);) {
            int semanas, dias, horas, dato;

            System.out.println("Ingrese la cantidad de horas: ");
            dato = entrada.nextInt();

            semanas = dato / 168;
            dias = (dato % 168) / 24;
            horas = (dato % 24);

            System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas");

        }
    }
}
