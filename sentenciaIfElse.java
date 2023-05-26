import javax.swing.JOptionPane;

public class sentenciaIfElse {
    public static void main(String[] args) {
        
        double mat = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificación de Matemáticas: "));
        double esp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificación de Español: "));
        double fis = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificación de Fisica: "));
        double qui = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificación de Quimica: "));
        double art = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su calificación de Arte: "));
        double promedio = (mat+esp+fis+qui+art)/5.0;

        if(promedio >= 9.5){
            System.out.println("Felicitaciones excelente promedio");
        }
        else if(promedio >= 8.0){
            System.out.println("Buen promedio");
        }
        else if(promedio >= 7.0){
            System.out.println("Regular, necesitas esforzarte más");
        }
        else if(promedio >= 6.0){
            System.out.println("Casi repruebas");
        }
        else{
            System.out.println("Reprobado!");
        }

        System.out.println("Tu promedio es: " + promedio);
    }
}
