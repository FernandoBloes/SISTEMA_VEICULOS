public abstract class Veiculo {

    // Definição das propriedades da classe Veiculo
    public String modelo;
    public int anoFabricacao;
    public String montadora;
    public String cor;

    // Construtor padrão para a classe Veiculo
    public Veiculo() {

    }

    // Construtor que aceita valores específicos para as propriedades
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor) {
        if (modelo == null || modelo.isEmpty() || anoFabricacao <= 0) {
            throw new IllegalArgumentException("Modelo e ano de fabricação são obrigatórios.");
        }

        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
    }

    // Método para obter o modelo do veículo
    public String getModelo() {
        return modelo;
    }

    // Método para definir o modelo do veículo
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    // Método para obter o ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Método para definir o ano de fabricação
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao <= 0) {
            throw new IllegalArgumentException("Ano de fabricação deve ser maior que zero.");
        }
        this.anoFabricacao = anoFabricacao;
    }

    // Método para obter a montadora
    public String getMontadora() {
        return montadora;
    }

    // Método para definir a montadora
    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    // Método para obter a cor do veículo
    public String getCor() {
        return cor;
    }

    // Método para definir a cor do veículo
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato que deve ser implementado para gerar um comando de inserção
    public abstract String insert();
}
