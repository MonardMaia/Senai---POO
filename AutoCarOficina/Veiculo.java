package AutoCarOficina;

public class Veiculo {
  private   int quantidadeRodas;
  private   String chassi;
  private   String marca;
  private   String tipo;

    public Veiculo(int quantidadeRodas, String chassi, String marca){
        this.quantidadeRodas = quantidadeRodas;
        this.chassi = chassi;
        this.marca =marca;
        this.tipo = tipo;


    }
    public Veiculo(){

    }

    public int getQuantidadeRodas(){
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas){
        this.quantidadeRodas = quantidadeRodas;
    }

    public String getchassi(){
        return chassi;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public String getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "quantidadeRodas:" + quantidadeRodas +
                ", chassi:'" + chassi + '\'' +
                ", marca:'" + marca + '\'' +
                ", tipo:'" + tipo + '\'' +
                '}';
    }

    public Veiculo(int quantidadeRodas, String chassi, String marca, String tipo) {

    }
}
