import java.lang.reflect.Method;

public class ejemploGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola mundo!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo." + metodo.getName());
        }
    }
}
