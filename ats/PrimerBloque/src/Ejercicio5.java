import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (
                /*
                 * La calificación final de un estudiante de informática se calcula con base
                 * a las calificaciones de cuatro aspectos de su rendimiento académico:
                 * participación, primer examen parcial, segundo examen parcial y examen final.
                 * Sabiendo que las calificaciones anteriores entran a la calificación final con
                 * ponderaciones del 10%, 25%, 25%, y 40%, hacer un programa que calcule e
                 * imprima la calificación final obtenida por un estudiante
                 */
                Scanner entrada = new Scanner(System.in);) {
            double participacion, primerParcial, segundoParcial, examenFinal, calificaionFinal;

            System.out.println("Ingrese la calificación de la participación: ");
            participacion = entrada.nextDouble();
            System.out.println("Ingrese calificación de primer parcial: ");
            primerParcial = entrada.nextDouble();
            System.out.println("Ingrese calificación del segundo parcial: ");
            segundoParcial = entrada.nextDouble();
            System.out.println("Ingrese calificación del examen final: ");
            examenFinal = entrada.nextDouble();

            participacion *= .10;
            primerParcial *= .25;
            segundoParcial *= .25;
            examenFinal *= .40;
            calificaionFinal = participacion + primerParcial + segundoParcial + examenFinal;

            System.out.println("La calificación final del alumno es: " + calificaionFinal);
        }
    }
}
