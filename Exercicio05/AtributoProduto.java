package Exercicio05;

import java.util.Scanner;

public class AtributoProduto {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Produto produto = new Produto();

        System.out.println("Qual o produto: ");
        produto.setNomeProduto(sc.next());

        System.out.println("Qual o valor do produto");
        produto.setPrecoproduto(sc.nextDouble());

        System.out.println( produto.toString());

    }
}
