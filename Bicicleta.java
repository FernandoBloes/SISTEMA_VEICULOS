public class Bicicleta extends Veiculo {

    // Variáveis específicas da classe Bicicleta
    public String material;
    public String marca;
    public int marchas;
    public boolean amortecedores;

    // Construtor padrão da classe Bicicleta
    public Bicicleta() {

    }

    // Construtor com parâmetros para inicializar os atributos da Bicicleta
    public Bicicleta(String material, int marchas, boolean amortecedores, String marca) {
        super(); // Chamando o construtor da classe pai (Veiculo)
        this.material = material;
        this.marchas = marchas;
        this.amortecedores = amortecedores;
        this.marca = marca;
    }

    // Método para gerar um comando SQL de inserção de dados
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Bicicleta (Modelo, AnoFabricacao, Montadora, Cor, Material, Marchas, Amortecedores, Marca) "
                        +
                        "VALUES ('%s', %d, '%s', '%s', '%s', %d, %b, '%s');",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), material, marchas, amortecedores, marca);
    }

    // Retorna o material utilizado na construção da bicicleta
    public String getMaterial() {
        return material;
    }

    // Define o material da bicicleta com validação
    public void setMaterial(String material) {
        if (material == null || material.isEmpty()) {
            throw new IllegalArgumentException("Material não pode ser nulo ou vazio.");
        }
        this.material = material;
    }

    // Retorna a marca da bicicleta
    public String getMarca() {
        return marca;
    }

    // Define a marca da bicicleta com validação
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    // Retorna o número de marchas da bicicleta
    public int getMarchas() {
        return marchas;
    }

    // Define o número de marchas com validação
    public void setMarchas(int marchas) {
        if (marchas < 0) {
            throw new IllegalArgumentException("Número de marchas não pode ser negativo.");
        }
        this.marchas = marchas;
    }

    // Verifica se a bicicleta possui amortecedores
    public boolean isAmortecedores() {
        return amortecedores;
    }

    // Define a presença de amortecedores na bicicleta
    public void setAmortecedores(boolean amortecedores) {
        this.amortecedores = amortecedores;
    }
}
