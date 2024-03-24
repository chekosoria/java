import java.util.Scanner;

public class OperadoresArtimeticos {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float numero1, numero2, suma, resta, mult, div, resto;

            System.out.println("Ingrese primer numero: ");
            numero1 = entrada.nextFloat();
            System.out.println("Ingrese segundo numero: ");
            numero2 = entrada.nextFloat();

            suma = numero1 + numero2;
            resta = numero1 - numero2;
            mult = numero1 * numero2;
            div = numero1 / numero2;
            resto = numero1 % numero2;

            System.out.println("El resultado de la suma es: " + suma);
            System.out.println("El resultado de la resta es: " + resta);
            System.out.println("El resultado de la multiplicacion es: " + mult);
            System.out.println("El resultado de la division es: " + div);
            System.out.println("El resultado del resto es: " + resto);
        }
    }
}
