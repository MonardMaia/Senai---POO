package Exercico08;

import java.util.Scanner;

public class EnderecoAtributo {
    public static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        System.out.println("Qual o nome da rua:  ");
        endereco.setRua(sc.next());

        System.out.println("Qual o seu endereço: ");
        endereco.setCidade(sc.next());

        System.out.println("Qual o numero ");
        endereco.setNumero(sc.nextInt());

        System.out.println(endereco.toString());
    }
}
