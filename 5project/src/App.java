import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("aula de array");
        System.out.println(
                "exercicio totalPares: a função recebe como parâmetro um array de inteiros e retorna um  número inteiro indicando o total de números pares existentes no array.");
                System.out.println("insira a quantidade de numeros que vai adicionar a o vetor ");

        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        int[] a = new int[tamanho];
        int qtdsPares = 0 ;

        for (int x = 0 ; x < tamanho ; x++){
            System.out.println("Digite o valor da posicao "+(x+1));
            a[x]=scan.nextInt();
            if (a[x]%2 == 0){
                qtdsPares = qtdsPares +1 ;
            }
        }
        System.out.println("A quantidade de numeros pares sao "+qtdsPares);
    }
}
