package CalculadoraGeometrica;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Bem vindo ao Sistema de Calculadora de Formas Geometricas");
            System.out.println("Qual forma você deseja usar?");
            System.out.println(
                    "Opções: \n" +
                            "0. Sair \n" +
                            "1. Quadrado\n" +
                            "2. Retângulo\n");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0: {
                    System.out.println("Obrigado por usar o Sistema de Calculadora!");
                    break;
                }
                case 1: {
                    System.out.println("Digite a cor do quadrado: ");
                    String cor = sc.next();
                    System.out.println("Digite o valor do lado do quadrado: ");
                    double lado = sc.nextDouble();

                    Quadrado quadrado = new Quadrado(cor, lado);

                    int opcao2;
                    do {
                        opcao2 = menuCalculo();

                        if (opcao2 < 0 || opcao2 > 3) {
                            System.out.println("Opção Invalida!");
                        }

                        switch (opcao2) {
                            case 1: {
                                System.out.println("Perimetro: " + quadrado.calculaPerimetro());
                                break;
                            }
                            case 2: {
                                System.out.println("Area: " + quadrado.calculaArea());
                                break;
                            }
                            case 3: {
                                System.out.println("Volume: " + quadrado.calculaVolume());
                                break;
                            }
                        }
                    } while (opcao2 != 0);

                    break;
                }
                case 2: {
                    System.out.println("Digite a cor do retangulo: ");
                    String cor = sc.next();
                    System.out.println("Digite o largura do retangulo: ");
                    double largura = sc.nextDouble();
                    System.out.println("Digite o altura do retangulo: ");
                    double altura = sc.nextDouble();
                    System.out.println("Digite o comprimento do retangulo: ");
                    double comprimento = sc.nextDouble();

                    Retangulo retangulo = new Retangulo(cor, largura, altura,comprimento);
                    int opcao3;
                    do {
                        opcao3 = menuCalculo();

                        if (opcao3 < 0 || opcao3 > 3) {
                            System.out.println("Opção Invalida!");
                        }

                        switch (opcao3) {
                            case 1: {
                                System.out.println("Perimetro: " + retangulo.calculaPerimetro());
                                break;
                            }
                            case 2: {
                                System.out.println("Area: " + retangulo.calculaArea());
                                break;
                            }
                            case 3: {
                                System.out.println("Volume: " + retangulo.calculaVolume());
                                break;
                            }
                        }
                    } while (opcao3 != 0);

                    break;
                }
            }
        }while (opcao != 0);
    }

    static public int menuCalculo(){
        System.out.println("Qual calculo deseja fazer?");
        System.out.println("Opções: \n"
                + "0. Voltar \n"
                + "1. Perimetro\n"
                + "2. Area\n"
                + "3. Volume\n");
        return sc.nextInt();
    }
}
