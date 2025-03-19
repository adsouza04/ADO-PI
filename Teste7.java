import java.util.*;

public class Teste7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do lado do quadrado:");
        int pontos = ler.nextInt();

    for (int cont2 = 1; cont2 <= pontos; cont2++) {
        for (int cont = 1; cont <= pontos; cont ++) {
            System.out.print(" * ");
        }
        System.out.println();

    }
         
    }

}