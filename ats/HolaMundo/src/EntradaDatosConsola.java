import java.util.Scanner;

public class EntradaDatosConsola {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String nombre;
            char apellido;
            int edad;
            float altura;

            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese su apellido: ");
            apellido = entrada.next().charAt(0);

            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();

            System.out.println("Ingrese su altura: ");
            altura = entrada.nextFloat();

            System.out
                    .println("Hola " + nombre + " " + apellido + " tienes " + edad + " años y mides " + altura + "m");
        }
    }
}
