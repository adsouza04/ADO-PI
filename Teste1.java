import java.util.*;

public class Teste1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Até qual número?");
        int num = ler.nextInt();

        for (int cont = 1; cont <= num; cont++) {
            System.out.println(cont);
        }


    }

}