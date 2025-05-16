package Exercico09;

public class ContaBancaria {
    private int numeroconta;
    private double saldo;

    public  ContaBancaria (int numeroconta, double saldo){
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }
    public ContaBancaria(){
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroConta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria:" +
                "\nnumeroConta:" + " " + numeroconta +
                "\nsaldo" + " " + saldo;
    }
}
