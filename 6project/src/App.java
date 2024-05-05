import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(
                "Digite  a temperatura que vou mostrar quanto é em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F) ");

        Scanner scan = new Scanner(System.in);

        double temperatura = scan.nextInt();
        System.out.println("a temperatura em Keven (K) é :" + temperatura + 273.15);
        System.out.println("a temperatura em Reaumur (Re) é :" + temperatura * 0.8);
        System.out.println("a temperatura em Rankine (Re) é :" + temperatura * 1.8 + 32 + 459.67);
        System.out.println("a temperatura em fahrenheit (F) é :" + temperatura * 1.8 + 32);
    }
}
