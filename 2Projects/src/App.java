import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
     //contagem regressiva com for 
     int numero;
     System.out.println("Digite um numero que farei a contagem do numero ate zero");
    numero = scan.nextInt();

        for(int x = numero ; x >= 0 ; x--){
            System.out.println("a contagem é:"+x);
        }

    


    }
}
