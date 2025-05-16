package Exercico07;

import java.util.Scanner;

public class AtributoAnimal {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println("Qual nome do Animal: ");
        animal.setNome(sc.next());

        System.out.println(" Qual a raça do Animal: ");
        animal.setRaca(sc.next());

        System.out.println("Qual o idade do Animal: ");
        animal.setIdade(sc.nextInt());

        System.out.println( animal.toString());
    }
}
