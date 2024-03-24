import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (
                /*
                 * Construir un programa que calucule y muestre por pantalla las raíces
                 * de la ecuación de segundo grado de coeficientes reales (la chicharronera)
                 * ax^2 + bx + c = 0
                 */
                Scanner entrada = new Scanner(System.in);) {
            double a, b, c, x1, x2;

            System.out.println("Programa para resolver una ecuación de segundo grado");
            System.out.println("ax^2 + bx + c = 0\n");

            System.out.println("Ingrese el valor de a: ");
            a = entrada.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            b = entrada.nextDouble();
            System.out.println("Ingrese el valor de c: ");
            c = entrada.nextDouble();

            System.out.println("\n");
            System.out.println("Calculando (" + a + "x^2) + (" + b + "x) + (" + c + ") = 0\n");

            x1 = ((-1 * b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
