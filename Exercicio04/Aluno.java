package Exercicio04;

public class Aluno {
    public String nome;
    public int matricula;
    public Double nota;

    public Aluno (String nome, int matricula, Double nota){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=nota;

    }
    public Aluno(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno:" +
                "\nnome: " + " " + nome +
                "\nmatricula: " + " " + matricula +
                "\nnota=" + " " + nota;
    }
}
