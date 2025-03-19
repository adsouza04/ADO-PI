import java.util.*;

public class Teste8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o tamanho da base do retangulo:");
        int base = ler.nextInt();

        System.out.println("Informe o tamanho da altura do retangulo:");
        int altura = ler.nextInt();


    for (int cont2 = 1; cont2 <= altura; cont2 ++) {
        for (int cont = 1; cont <= base; cont ++) {
            System.out.print(" * ");
        }
        System.out.println();

    }
         
    }

}