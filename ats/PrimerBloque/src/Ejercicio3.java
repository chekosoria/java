import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (
                /*
                 * Guillermo tiene N dolares, Luis tiene la mitad de lo que posee Guillermo.
                 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
                 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen
                 * entre los tres.
                 */
                Scanner entrada = new Scanner(System.in);) {
            double guillermo, luis, juan, total;

            System.out.println("Ingresa cuanto dinero tiene Guillermo: ");
            guillermo = entrada.nextDouble();

            luis = guillermo / 2;
            juan = (guillermo + luis) / 2;
            total = guillermo + luis + juan;

            System.out.println("Guillermo tiene $" + guillermo);
            System.out.println("Luis tiene $" + luis);
            System.out.println("Juan tiene $" + juan);
            System.out.println("Entre los tres tienen $" + total);
        }
    }
}
