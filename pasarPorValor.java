public class pasarPorValor {
    public static void main(String[] args) {
        
        int i = 10;
        
        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Terminamos el método main con i = " + i);      
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Terminamos el método test con i = " + i);      
    }
}
