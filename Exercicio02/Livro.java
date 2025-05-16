package Exercicio02;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public Livro (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public Livro (){

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\ntitulo:" + " " + titulo +
                "\nautor:" + " " + autor +
                "\nano:" + " " + ano + " " + "anos";
    }
}
