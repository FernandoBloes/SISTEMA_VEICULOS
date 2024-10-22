public abstract class Veiculo {

    // Atributos da classe Veiculo
    public String modelo;
    public int anoFabricacao;
    public String montadora;
    public String cor;

    // Construtor do objeto
    public Veiculo() {

    }

    // Construtor do objeto com os valores gerados
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor) {
        if (modelo == null || modelo.isEmpty() || anoFabricacao <= 0) {
            throw new IllegalArgumentException("O modelo e o ano de fabricação são obrigatórios.");
        }

        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
    }

    // Retorno do modelo do veículo
    public String getModelo() {
        return modelo;
    }

    // Setando o modelo do veículo
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    // Pegando o ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Colocando o ano de Fabricação
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("Ano de fabricação deve ser maior que zero.");
        }
        this.anoFabricacao = anoFabricacao;
    }

    // Pegando a montadora
    public String getMontadora() {
        return montadora;
    }

    // Colocando a montadora
    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    // Pegando a cor no veículo
    public String getCor() {
        return cor;
    }

    // Colocando a cor no veículo
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato para gerar o comando insert
    public abstract String insert();
}