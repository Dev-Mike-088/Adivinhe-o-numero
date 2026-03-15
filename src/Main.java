import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int opcao;
        int entrada;


        opcao = MostrarMenuD(sc);

        int sortido = numberRandom(random, opcao);

        do {
            entrada = number(sc);

            if (opcao == 1) {

                if (entrada > sortido) {
                    System.out.println("O número informado é maior, tente novamente");
                } else if (entrada < sortido) {
                    System.out.println("Seu número é menor que o desejado, tente novamente");
                } else {
                    System.out.println("Voçê acertou o número, Meus parábens !!!");
                }
            } else if (opcao == 2) {

                if (entrada > sortido) {
                    System.out.println("O número informado é maior, tente novamente");
                } else if (entrada < sortido) {
                    System.out.println("Seu número é menor que o desejado, tente novamente");
                } else {
                    System.out.println("Voçê acertou o número, Meus parábens !!!");
                }
            } else if (opcao == 3) {

                if (entrada > sortido) {
                    System.out.println("O número informado é maior, tente novamente");
                } else if (entrada < sortido) {
                    System.out.println("Seu número é menor que o desejado, tente novamente");
                } else {
                    System.out.println("Voçê acertou o número, Meus parábens !!!");
                }
            } else if (opcao == 0) {
                System.out.println("Muito obrigado por usar nosso jogo !!!");
            } else {
                System.out.println("Número inválido ou caractere não identificado!!!!");
            }

        } while (entrada != sortido);

    }

    public static int MostrarMenuD(Scanner sc) {
        System.out.println("Olá Jogador que dificuldade deseja?");
        System.out.println("1 - Fácil - 1 a 20 ");
        System.out.println("2 - Médio - 1 a 50 ");
        System.out.println("3 - Difícil - 1 a 100 ");
        System.out.println("0 - Sair ");
        System.out.print("Qual sua decisão: ");
        int opcao = sc.nextInt();
        return opcao;
    }

    public static int number(Scanner sc) {
        System.out.print("Me informe um número:");
        int numero = sc.nextInt();
        return numero;
    }

    public static int value(int opcao) {
        int limite = 0;

        if (opcao == 1) {
            limite = 20;
        } else if (opcao == 2) {
            limite = 50;
        } else if (opcao == 0) {
            limite = 100;
        }

        return limite;
    }

    public static int numberRandom(Random random, int opcao) {
        int number = 0;
        if(opcao == 1){
            number = random.nextInt(20) + 1;
        }else if(opcao == 2){
            number = random.nextInt(50) + 1;
        }else if(opcao == 3){
            number = random.nextInt(100) + 1;
        }
        return number;
    }
}