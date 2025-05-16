package Exercicio04;

import java.util.Scanner;

public class AtributoAluno {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        System.out.println("Qual nome do Aluno: ");
        aluno.setNome(sc.next());

        System.out.println("Qual o numero da matricula: ");
        aluno.setMatricula(sc.nextInt());

        System.out.println("Qual a sua nota final: ");
        aluno.setNota(sc.nextDouble());

        System.out.println( aluno.toString());
    }
}
