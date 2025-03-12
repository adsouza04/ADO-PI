import java.util.Scanner;

class MeiaOuInterira {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Me informe o tipo do ingresso (meia/inteira):");
        String ingresso = ler.nextLine();

        System.out.println("Me informe a quantidade de ingressos:");
        int quantidade = ler.nextInt();

        if (ingresso.equals("meia")) {
            double total = (quantidade * 28.50) / 2;
            System.out.println("O valor a pagar é R$" + total);

        }
        else if (ingresso.equals("inteira")) {
            double total = quantidade * 28.50;
            System.out.println("O valor a pagar é R$" + total);
        }
        else {
            System.out.println("Inválido.");	
        }

    }

}