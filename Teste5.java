import java.util.*;

public class Teste5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o número Par inicial:");
        int inicio = ler.nextInt();

        System.out.println("Informe o número Par final:");
        int fim = ler.nextInt();

        for (int cont = inicio; cont <= fim; cont ++) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            
        }


    }

}