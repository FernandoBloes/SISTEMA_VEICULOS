public class Caminhao extends Veiculo {

    // Atributos da classe Caminhao
    public int eixo;
    public int peso;

    // Construtor do objeto
    public Caminhao() {
        // Construtor padrão
    }

    // Construtor do objeto com os valores dados
    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, int eixo, int peso) {
        super(); // Inicializa os atributos da superclasse
        this.eixo = eixo;
        this.peso = peso;
    }

    // Método insert
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Caminhao (Modelo, AnoFabricacao, Montadora, Cor, Eixo, Peso) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), eixo, peso);
    }

    // Pegando o eixo
    public int getEixo() {
        return eixo;
    }

    // Colocando o eixo
    public void setEixo(int eixo) {
        if (eixo <= 0) {
            throw new IllegalArgumentException("Número de eixos deve ser um valor positivo.");
        }
        this.eixo = eixo;
    }

    // Pegando o peso do caminhao
    public int getPeso() {
        return peso;
    }

    // Colocando o peso do caminhao
    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser um valor positivo.");
        }
        this.peso = peso;
    }
}