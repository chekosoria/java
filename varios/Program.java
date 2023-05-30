public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        double result = 0.00;
        double div = revenue.length;

        for(double x: revenue) {
            result += x;
        }
        System.out.println(result/div); 
    }
}