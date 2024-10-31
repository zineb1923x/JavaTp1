public class SommeDeuxNombres {
    public static void main(String[] args) {
        double num1 = Float.parseFloat(args[0]);
        double num2 = Float.parseFloat(args[1]);
        double sum = num1 + num2;
        System.out.println("La somme des deux nombres est: " + sum);
    }
}
