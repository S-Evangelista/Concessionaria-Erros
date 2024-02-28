

public class Caminhao extends Veiculo{

    private String comprimento;
    private String altura;
    private String pesoSuportado;

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public float getPesoSuportado() {
        return pesoSuportado;
    }

    public void setPesoSuportado(float pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }
}
