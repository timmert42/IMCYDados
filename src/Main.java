import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar un peso");

        double peso= (scanner.nextDouble());

        System.out.println("ingresar estatura");

        double estatura= (scanner.nextDouble());

        double indice = peso/(estatura*estatura);

        if (indice <= 18.49) {
            System.out.println("peso bajo");
        }else if (indice <= 24.99) {
            System.out.println("peso normal");
        } else if (indice <= 29.99) {
            System.out.println("sobrepeso");
        }else if (indice <= 34.99) {
            System.out.println("obesidad leve");
        } else if (indice <= 39.99) {
            System.out.println("obesidad media");
        } else{
            System.out.println("obesidad mórbida");
        }

        scanner.close();
    }
}