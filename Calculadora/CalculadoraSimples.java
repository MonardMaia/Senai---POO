package Calculadora;

import java.util.Scanner;

public class CalculadoraSimples {
    private static final boolean T = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º numero: ");
        double n1 = scanner.nextInt();

        System.out.println(" Digite qual Função voce deseja aplicar:" +
                                "\n1-Adição"+
                                "\n2-Subtração"+
                                "\n3-Multiplicação"+
                                "\n4-Divisão");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o 2º numero: ");
        double n2 = scanner.nextInt();

        boolean logica = T ;
        double resultado ;

        switch (operador){
            case '1':
                resultado = n1+n2;
                break;
            case '2':
                resultado = n1-n2;
                break;
            case '3':
                resultado = n1*n2;
                break;
            case '4':
                if (n2!=0){
                    resultado = n1/n2;
                    break;
                }
                else {
                    System.out.println("Valor 2º tem que ser diferente de 'ZERO'!");
                }
                boolean False;

            default:
                System.out.println("Operador inválido.");
                return;

        }
        System.out.println("Resultado: " + resultado);
    }
}
