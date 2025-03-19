import java.util.*;

public class Teste2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Até quanto quer contar?");
        int num = ler.nextInt();

        for (int cont = num; cont >= 1; cont--) {
            System.out.println(cont);
        }


    }

}