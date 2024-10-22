public class Skate extends Veiculo {

    // Definindo as propriedades da classe Skate
    public String marca;
    public String tipoRodas;

    // Construtor vazio para inicialização sem parâmetros
    public Skate() {
        // Inicialização padrão sem valores
    }

    // Construtor para criar um objeto Skate com as informações fornecidas
    public Skate(String modelo, int anoFabricacao, String montadora, String cor, String marca, String tipoRodas) {
        super(modelo, anoFabricacao, montadora, cor); // Chama o construtor da superclasse Veiculo
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    // Geração da consulta SQL para inserir um novo skate no banco de dados
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Skate (Modelo, AnoFabricacao, Montadora, Cor, Marca, TipoRodas) " +
                        "VALUES ('%s', %d, '%s', '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), marca, tipoRodas);
    }

    // Método para obter o valor da marca do skate
    public String getMarca() {
        return marca;
    }

    // Método para definir o valor da marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para acessar o tipo de rodas
    public String getTipoRodas() {
        return tipoRodas;
    }

    // Método para definir o tipo de rodas
    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }
}
