public class DatosPrimitivos {
    public static void main(String[] args) {
        /*
         * Usar byte ocupa 8 bits de memomoria y se usa para trabajar con numeros en un
         * rango entre -128 a 127
         * Usar short ocupa 16 bits de memomoria y se usa para trabajar con numeros en
         * un rango entre -32768 a 32767
         * Usar int ocupa 32 bits de memomoria y se usa para trabajar con numeros en un
         * rango entre -2147483648 a 2147483647
         * Usar long ocupa 64 bits de memomoria y se usa para trabajar con numeros en un
         * rango entre -9223372036854775808 a 9223372036854775807
         */
        /*
         * Para trabajar con decimales al definir tipo de dato float se debe agregar una
         * f al final del valor de la variable, con el tipo doble no es necesario
         * Usar float ocupa 32 bits de memomoria y se usa para trabajar con numeros en
         * un rango entre 1.4e-045 a 3.4e+038
         * Usar double ocupa 64 bits de memomoria y se usa para trabajar con numeros en
         * un rango entre 4.9e-324 a 1.8e+308
         */
        byte entero;

        entero = 12;

        System.out.println(entero);

    }
}
