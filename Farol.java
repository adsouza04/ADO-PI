import java.util.Scanner;

class Farol {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a cor que esta indicando no semáforo?");
        String cor = ler.next();

        if (cor.equals("vermelho")) {
            System.out.println("Espere");
        }
        else if (cor.equals("verde")) {
            System.out.println("Atravesse");
        }
        else {
            System.out.println("Farol inoperante");
        }
    }

}
