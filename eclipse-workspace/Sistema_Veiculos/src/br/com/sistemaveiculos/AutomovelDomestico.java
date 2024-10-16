package br.com.sistemaveiculos;

public class AutomovelDomestico extends Veiculo {
    private int maxPassageiros;
    private String tipoFreio;
    private boolean airbag;

    public AutomovelDomestico(String modelo, int anoFabricacao, int maxPassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao);
        this.maxPassageiros = maxPassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO AutomovelDomestico (modelo, anoFabricacao, maxPassageiros, tipoFreio, airbag) VALUES ('" +
                getModelo() + "', " + getAnoFabricacao() + ", " + maxPassageiros + ", '" + tipoFreio + "', " + airbag + ");";
    }
}
