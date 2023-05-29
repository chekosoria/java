public class WrapperInteger {
    public static void main(String[] args) {

        Integer intObjeto1 = Integer.valueOf(32767);

        System.out.println("Primer objeto = " + intObjeto1);

        Integer intObjeto2 = 32768;

        System.out.println("Segundo objeto = " + intObjeto2);

        int intPrimitivo = 32768;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);

        System.out.println("Tercer objeto = " + intObjeto3);

        Integer intObjeto4 = intPrimitivo;

        System.out.println("Cuarto objeto = " + intObjeto4);

        int num = intObjeto1;
        System.out.println("num = " + num);
        int num2 = intObjeto1.intValue();
        System.out.println("num = " + num2);

        String cadenaTest = "15256";
        Integer valorConvertido = Integer.valueOf(cadenaTest);
        System.out.println("La cadena convertida a entero es: " + valorConvertido);

        //Soporta un máximo de 32767, cualquier valor superior causará perdida 
        
        Short shortObjeto = intObjeto1.shortValue();
        System.out.println("El valor del objeto int convertido a short es: " + shortObjeto);
    }
}
