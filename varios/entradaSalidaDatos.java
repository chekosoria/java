import javax.swing.JOptionPane;

public class entradaSalidaDatos {
    public static void main(String[] args) throws Exception {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese múmero decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El número es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+ letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+ decimal);
    }
}
