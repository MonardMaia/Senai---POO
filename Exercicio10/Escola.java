package Exercicio10;

public class Escola {
    private String nome;
    private int idade;
    private double nota;

    public Escola (String nome, int idade, double nota){
      this.nome=nome;
      this.idade=idade;
      this.nota=nota;
    }
    public Escola (){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Escola = " +
                "\nnome:" + " " + nome +
                "\nidade:" + " " + idade +
                "\nnota: " + " " + nota;
    }
}
