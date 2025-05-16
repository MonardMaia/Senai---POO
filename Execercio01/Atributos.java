package Execercio01;

import java.util.Scanner;

public class Atributos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println("Qual seu nome: ");
        pessoa.setNome(sc.next());
        System.out.println("Qual seu idade: ");
        pessoa.setIdade(sc.nextInt());

        System.out.println( pessoa.toString());
    }
}
