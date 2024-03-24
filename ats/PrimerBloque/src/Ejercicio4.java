import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (
                /*
                 * Una compañia de venta de carros usados paga a su personal de ventas
                 * un salario de $1000 mensuales, más una comisión de $150 por cada carro
                 * vendido, más el 5% del valor de la venta del carro. Cada mes el
                 * capturista de la empresa ingresa en la computadora los datos pertinentes.
                 * Hacer un programa que calcule e imprima el salario mensual de un vendedor
                 * dado
                 */
                Scanner entrada = new Scanner(System.in);) {
            double salario = 1000;
            double comisionFija = 150;
            double porcentajeComision = 5;
            double autosVendidos, montoVenta, totalComisionFija, totalComisionPorcetaje, totalComisiones, salarioTotal;

            System.out.println("Ingrese la cantidad de autos vendidos: ");
            autosVendidos = entrada.nextDouble();
            System.out.println("Ingrese el monto total de las ventas: ");
            montoVenta = entrada.nextDouble();

            totalComisionFija = comisionFija * autosVendidos;
            totalComisionPorcetaje = (montoVenta * porcentajeComision) / 100;
            totalComisiones = totalComisionFija + totalComisionPorcetaje;
            salarioTotal = salario + totalComisiones;

            System.out.println("El salario total del vendedor es de $" + salarioTotal);
        }
    }
}
