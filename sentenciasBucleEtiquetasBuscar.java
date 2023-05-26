import javax.swing.JOptionPane;

public class sentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingrese una frase: ");
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra que quiera buscar: ");
        char letra = JOptionPane.showInputDialog("Ingrese la letra que quiere buscar: ").charAt(0);
       
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidadPalabra = 0;
        int cantidadLetra = 0;
        
        buscar:
        for(int i = 0; i < maxFrase; i++){
            if(frase.charAt(i) != letra){
                continue buscar;
            }
            cantidadLetra++;
        }
        System.out.println("La letra \""+ letra + "\" ha sido encontrada " + cantidadLetra + " veces en la frase " + "\"" + frase + "\"");
        
        buscar2:
        for(int i = 0; i < maxFrase;){
            int k = i;
            for(int j = 0; j < maxPalabra; j++)
            if(frase.charAt(k++) != palabra.charAt(j)){
                i++;
                continue buscar2;
            }
            cantidadPalabra++;
            i = i +  maxPalabra;
        }
        System.out.println("La palabra \""+ palabra + "\" ha sido encontrada " + cantidadPalabra + " veces en la frase " + "\"" + frase + "\"");
    }
}
