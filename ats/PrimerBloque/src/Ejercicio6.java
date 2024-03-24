import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (
                /*
                 * Hacer un programa que calcule el cuadrado de una suma
                 * (a+b)^2 = a^2 + b^2 + 2ab
                 */
                Scanner entrada = new Scanner(System.in);) {
            double a, b, c, resultado;

            System.out.println("Ingrese el primer número: ");
            a = entrada.nextInt();
            System.out.println("Ingrese el segundo número: ");
            b = entrada.nextInt();

            c = 2 * (a * b);
            resultado = Math.pow(a, 2) + Math.pow(b, 2) + c;

            System.out.println("El resultado es: " + resultado);
        }
    }
}
