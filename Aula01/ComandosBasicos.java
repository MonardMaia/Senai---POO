package Aula01;

import java.util.Scanner;

public class ComandosBasicos {
    static Scanner sc = new Scanner(System.in); //prompt (escreve no terminal) no
    public static void main(String[] args){
        System.out.println("bem vindo ao java!");
        //variaveis de tipos primitivos
        boolean truorfalse = true;
        int numerointeiro = 0;
        double decimal = 0.2;
        char letra = 'A';

        System.out.println("============================================");

        Double decimal2=0.2; //decial do tipo objeto
        String texte = "texto";
        Integer numeroreias2 = 2;// tipo objeto;
        String nome = null; //nulo==""

        System.out.println("============================================");

        System.out.println("Qual seu nome? ");
        nome = sc.nextLine(); // escreve a varialvel

        System.out.println("============================================");

        System.out.println("O seu nome é " + nome);

    }
}