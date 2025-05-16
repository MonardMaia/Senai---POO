package AutoCarOficina;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        System.out.println("Quantidade de rodas: ");
        veiculo.setQuantidadeRodas(sc.nextInt());
        System.out.println("Qual Numero do Chassi: ");
        veiculo.setChassi(sc.next());
        System.out.println("Qual marca: ");
        veiculo.setmarca(sc.next());
        System.out.println("Qual tipo: ");
        veiculo.setTipo(sc.next());

        System.out.println( veiculo.toString());
    }
}
