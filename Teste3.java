import java.util.*;

// contando do inicio do número desejado pelo usuário até o final do número desejado pelo usuário //

public class Teste3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o número inicial: ");
        int inicio = ler.nextInt();

        System.out.println("Informe o número final:");
        int fim = ler.nextInt();

        for (int cont = inicio; cont <= fim; cont++) {
            System.out.println(cont);
        }


    }

}