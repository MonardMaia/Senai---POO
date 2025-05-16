package Exercico09;

import java.util.Scanner;

public class BancarioAtributo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BancarioAtributo banco = new BancarioAtributo();

        System.out.println("Qual numero da conta: ");
        banco.setNumeroConta(sc.nextInt());

        System.out.println("Qual seu saldo: ");
        banco.setSaldo(sc.nextDouble());

        System.out.println( banco.toString());
    }

    private void setSaldo(double v) {

    }

    private void setNumeroConta(int i) {
    }
}
