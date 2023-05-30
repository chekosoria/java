public class WapperBoolean {
    public static void main(String[] args) {
        
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetBoolean2 = Boolean.valueOf("false");
        Boolean objetBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetBoolean2);

        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean == objetBoolean2));
        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean.equals(objetBoolean2)));
        System.out.println("Comparando dos objetos Boolean: " + (objetBoolean2 == objetBoolean3));
        System.out.println("Comparando dos objetos Boolean: " + (objetoBoolean == objetBoolean3));

        boolean primBoolean2 = objetBoolean2.booleanValue();
        boolean primBoolean3 = objetBoolean2;

        System.out.println("primBoolean2 = " + primBoolean2);
        System.out.println("primBoolean3 = " + primBoolean3);
    }
}
