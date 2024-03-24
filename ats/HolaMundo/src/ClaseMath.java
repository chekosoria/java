public class ClaseMath {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9);
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        double calificacion = 9.56;
        double calificacionFinal = Math.round(calificacion);
        double aleatorio = Math.random();

        System.out.println(raiz);
        System.out.println(potencia);
        System.out.println(calificacionFinal);
        System.out.println(aleatorio);
    }
}
