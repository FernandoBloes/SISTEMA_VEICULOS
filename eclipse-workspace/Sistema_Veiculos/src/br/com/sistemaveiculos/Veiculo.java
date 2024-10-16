package br.com.sistemaveiculos;

public class Veiculo {
    private String modelo;
    private int anoFabricacao;

    // Construtor
    public Veiculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método que gera o comando INSERT
    public String gerarComandoInsert() {
        return "INSERT INTO Veiculo (modelo, anoFabricacao) VALUES ('" + modelo + "', " + anoFabricacao + ");";
    }
}
