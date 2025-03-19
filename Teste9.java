import java.util.*;

public class Teste9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um número?");
        int numero = ler.nextInt();


        for (int cont = 1 ; cont <= 10 ; cont ++) {
            int tabuada = numero * cont;
            System.out.println(numero + " X " + cont + " = " + tabuada);
        }
     
    }

}