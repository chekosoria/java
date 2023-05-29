public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Si hacemos una comparación de valores nos regresará true debido a que ambos corresponden al valor de la misma instancia
        System.out.println("Son el mismo numero? " + (num1 == num2));

        Integer num3 = Integer.valueOf(2000);
        Integer num4 = 2000;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        // Si hacemos una comparación de valores nos regresará false debido a que ya no corresponden al valor de la misma instancia
        // Si el valor de ambos es menor o igual a 127 regresará true
        System.out.println("Son el mismo numero? " + (num3 == num4));

        Integer num5 = Integer.valueOf(3000);
        Integer num6 = 3000;

        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        // Si reemplazamos == por .equals() regresará true
        System.out.println("Son el mismo numero? " + (num5.equals(num6)));

        Integer num7 = Integer.valueOf(4000);
        Integer num8 = 4000;

        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        // Si usamos el metodo explicito podemos usar == para comparar y obtener true
        System.out.println("Son el mismo numero? " + (num7.intValue() == num8.intValue()));

        // Para comparar si es < o > o hacer operaciones no es necesario convertir

        Integer num9 = Integer.valueOf(5);
        Integer num10 = 2;

        System.out.println("num9 = " + num9);
        System.out.println("num10 = " + num10);

        boolean condicion = num9 > num10;

        System.out.println("Condición: " + condicion);

        int suma = num9 + num10;

        System.out.println("La suma es: " + suma);

        int mult = num9 * num10;

        System.out.println("La multiplicación es: " + mult);

    }
}
