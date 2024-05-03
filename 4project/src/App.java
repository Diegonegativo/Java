import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(
                "programa que le 20 numero e fala quantos estao entre 0 e 100 , quantos estao entre 101 a 200");
        Scanner scan = new Scanner(System.in);
        int entre0e100 = 0;
        int entre101e200 = 0;
        int maioresQue200 = 0;
        for (int x = 1; x < 21; x++) {
            System.out.println("Digite o " + x + " numero");
            int i = scan.nextInt();
            
            if (i >= 0 && i <= 100) {
                entre0e100++;
            } else if (i >= 101 && i <= 200) {
                entre101e200++;
            } else {
                maioresQue200++;
            }
        
            }
   
            System.out.println("quantidade de numeros entre 0 e 100 e :" +entre0e100);
            System.out.println("quantidade de numeros entre 1001 e 200 e :" +entre101e200);
            System.out.println("maiores que 200 :" +maioresQue200);
        }

    }

