import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner scan = new Scanner(System.in);
        // como calcular media java
        System.out.println("Quantas notas voçê quer calcular ");
        int quantasN = scan.nextInt();
        double notas=0;
        for (int i = 0; i < quantasN; i++) {
            System.out.println("Digite sua " + i + "ª nota");
            double notaAtual = scan.nextInt();
            notas += notaAtual;// acaumula as notas 
            
        }
        double media = notas /quantasN ;
        System.out.println("A media das suas notas é :"+media);
    }
}
