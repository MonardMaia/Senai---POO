package Exercicio10;

import java.util.Scanner;

public class EscolaAtributo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Escola escola = new Escola();

        System.out.println("Qual seu nome: ");
        escola.setNome(sc.next());

        System.out.println("Qual a sua idade: ");
        escola.setIdade(sc.nextInt());

        System.out.println("Qual o valor da sua nota: ");
        escola.setNota(sc.nextDouble());

        System.out.println(escola.toString());
    }

}
