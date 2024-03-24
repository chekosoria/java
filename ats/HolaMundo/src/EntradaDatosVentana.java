import javax.swing.JOptionPane;

public class EntradaDatosVentana {
    public static void main(String[] args) {
        String nombre;
        char apellido;
        int edad;
        double altura;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ").charAt(0);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));

        JOptionPane.showMessageDialog(null, "Hola " + nombre + " " + apellido);
        JOptionPane.showMessageDialog(null, "Tienes " + edad + " años");
        JOptionPane.showMessageDialog(null, "Mides " + altura + "cm");
    }
}
