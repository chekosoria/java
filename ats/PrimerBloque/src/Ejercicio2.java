import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (/*
              * Hacer un programa que calcule e imrpima el salario semanal
              * se un empleado a partir de sus horas semanales trabajadas
              * y de su salario por hora
              */
                Scanner entrada = new Scanner(System.in)) {
            double horas, salarioHora, salarioSemanal;

            System.out.println("Ingresa el salario por hora del empleado: $");
            salarioHora = entrada.nextDouble();

            System.out.println("Ingresa la cantidad de horas trabajadas: ");
            horas = entrada.nextDouble();

            salarioSemanal = salarioHora * horas;

            System.out.println("El salario semana es de $" + salarioSemanal);
        }
    }
}
