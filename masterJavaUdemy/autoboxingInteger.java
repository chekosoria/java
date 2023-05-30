public class autoboxingInteger {
    public static void main(String[] args) {
        
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;

        // Forma explicita
        for(Integer i:enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("La suma total de los pares es: " + suma);

        int suma2 = 0;
        // Forma implicita
        for(Integer i:enteros){
            if(i % 2 != 0){
                suma2 += i;
            }
        }
        System.out.println("La suma total de los nones es: " + suma2);
    }
}
