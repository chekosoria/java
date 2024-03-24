public class Constantes {
    public static void main(String[] args) {
        /*
         * Las constantes se usan para asignar un valor que no cambiará
         * durante todo el programa
         * Para declararlas se usa la palabra reservada final
         */
        final double pi = 3.1416;
        double radio = 5.55;
        double area = pi * (radio * radio);

        System.out.println(area);
    }
}
