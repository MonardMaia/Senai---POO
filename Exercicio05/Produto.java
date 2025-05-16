package Exercicio05;

public class Produto {
    public String nomeProduto;
    public double precoproduto;

    public Produto(String nomeProduto, double precoproduto){
        this.nomeProduto = nomeProduto;
        this.precoproduto = precoproduto;
    }
    public Produto(){
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoproduto() {
        return precoproduto;
    }

    public void setPrecoproduto(double precoproduto) {
        this.precoproduto = precoproduto;
    }

    @Override
    public String toString() {
        return "Produto:" +
                "\nnomeProduto: "+ " " + nomeProduto +
                "\nprecoproduto: " + " " + precoproduto;
    }
}
