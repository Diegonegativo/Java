import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        int totalMaiorIdade = 0;
        int quantidadePessoas = 20;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                totalMaiorIdade++;
            }
        }

        System.out.println("Total de pessoas maiores de idade: " + totalMaiorIdade);
        scanner.close();
    }
}
