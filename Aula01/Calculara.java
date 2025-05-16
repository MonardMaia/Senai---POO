package Aula01;

import java.util.Scanner;

public class Calculara {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2;
        int tipocalculo;
        System.out.println("Olá calculadora!");
        System.out.println("Escreva o primeiro Valor: ");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo valor: ");
        num2 = sc.nextDouble();

        tipocalculo = opcaocalculo();

        if (tipocalculo == 1) {
            System.out.println("O resultado é : " + (num1 + num2));
        }
        else if (tipocalculo == 2) {
            System.out.println("O resultado é : " + (num1 - num2));
        }
        else if (tipocalculo == 3) {
            System.out.println("O resultado é : " + (num1 * num2));
        }
        else if (tipocalculo == 4) {
            System.out.println("O resultado é : " + (num1 / num2));
        } else {
            System.out.println("valor incorreto ");
        }

    }

    public static int opcaocalculo() {
        System.out.println("Escreva o tipo de calculo: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplocação");
        System.out.println("4 - divisão");
        System.out.println("Escolha: ");

        int tipocalculo = sc.nextInt();

        return tipocalculo;
    }
}
