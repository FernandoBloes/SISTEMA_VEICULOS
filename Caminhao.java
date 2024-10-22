public class Caminhao extends Veiculo {

    // Variáveis que definem os atributos do Caminhão
    public int eixo;
    public int peso;

    // Construtor padrão para a classe Caminhao
    public Caminhao() {

    }

    // Construtor que recebe parâmetros para inicializar os atributos do Caminhão
    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, int eixo, int peso) {
        super(); // Chama o construtor da classe pai (Veiculo)
        this.eixo = eixo;
        this.peso = peso;
    }

    // Método que retorna o comando SQL para inserção de dados no banco
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Caminhao (Modelo, AnoFabricacao, Montadora, Cor, Eixo, Peso) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), eixo, peso);
    }

    // Retorna o número de eixos do caminhão
    public int getEixo() {
        return eixo;
    }

    // Define o número de eixos com uma validação
    public void setEixo(int eixo) {
        if (eixo <= 0) {
            throw new IllegalArgumentException("Número de eixos deve ser um valor positivo.");
        }
        this.eixo = eixo;
    }

    // Retorna o peso do caminhão
    public int getPeso() {
        return peso;
    }

    // Define o peso do caminhão com uma validação
    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser um valor positivo.");
        }
        this.peso = peso;
    }
}
