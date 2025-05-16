package Exercicio02;

import java.util.Scanner;

public class Livraria {
   public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Livro livro = new Livro();

        System.out.println("Qual o titulo do livro? ");
        livro.setTitulo(sc.next());
        System.out.println("Qual o nome do autor? ");
        livro.setAutor(sc.next());
        System.out.println("Qual o ano do livro? ");
        livro.setAno(sc.nextInt());

        System.out.println( livro.toString());

    }
}
