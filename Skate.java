public class Skate extends Veiculo {

    // Atributos da classe Skate
    public String marca;
    public String tipoRodas;

    // Construtor do objeto
    public Skate() {
        // Construtor padrão
    }

    // Construtor do objeto com os valores dados
    public Skate(String modelo, int anoFabricacao, String montadora, String cor, String marca, String tipoRodas) {
        super(modelo, anoFabricacao, montadora, cor); // Inicializa os atributos da superclasse
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    // Método insert
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Skate (Modelo, AnoFabricacao, Montadora, Cor, Marca, TipoRodas) " +
                        "VALUES ('%s', %d, '%s', '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), marca, tipoRodas);
    }

    // Pegando a marca
    public String getMarca() {
        return marca;
    }

    // Colocando a marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Pegando o tipo de roda
    public String getTipoRodas() {
        return tipoRodas;
    }

    // Colocando o tipo de roda
    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }
}