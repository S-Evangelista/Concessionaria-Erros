import java.util.ArrayList;

public abstract class Veiculo {

    private String fabricante;
    private String modelo;
    private String cor;
    private boolean novo;
    private double preco;
    private double precoTabela;
    private double kmRodado;
    private int ano;

    public static void addVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }


    public String getModelo() {
        return null;
    }

    public static ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(double precoTabela) {
        this.precoTabela = precoTabela;
    }

    public double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
