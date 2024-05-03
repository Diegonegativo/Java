import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Digite quantos numeros deseja adicionar à lista e mostrarei o maior :");
        int tamanho = scan.nextInt();
        int[] a = new int[tamanho];
        int maior = 0;
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor que você deseja adicionar à posição " + (i + 1));
            a[i] = scan.nextInt();
            if (a[i] > maior) {
                maior = a[i];

            }
        }
        System.out.println("o maior numero da lista e " + maior);




    }
}
