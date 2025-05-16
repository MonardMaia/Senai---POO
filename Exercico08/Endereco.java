package Exercico08;

public class Endereco {
    public String rua;
    public String cidade;
    public int numero;

    public Endereco (String rua, String cidade, int numero){
        this.rua=rua;
        this.cidade=cidade;
        this.numero=numero;
    }
    public Endereco(){
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco:" +
                "\nrua: " + " " + rua +
                "\ncidade: " + " " + cidade +
                "\nnumero=" + " " + numero;
    }
}
