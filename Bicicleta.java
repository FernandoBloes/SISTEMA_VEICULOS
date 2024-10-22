public class Bicicleta extends Veiculo {

    // Atributos da classe Bicicleta
    public String material;
    public String marca;
    public int marchas;
    public boolean amortecedores;

    // Construtor do objeto
    public Bicicleta() {
        // Construtor padrão
    }

    // Construtor do objeto com os valores dados
    public Bicicleta(String material, int marchas, boolean amortecedores, String marca) {
        super(); // Inicializa os atributos da superclasse
        this.material = material;
        this.marchas = marchas;
        this.amortecedores = amortecedores;
        this.marca = marca;
    }

    // Método insert
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Bicicleta (Modelo, AnoFabricacao, Montadora, Cor, Material, Marchas, Amortecedores, Marca) "
                        +
                        "VALUES ('%s', %d, '%s', '%s', '%s', %d, %b, '%s');",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), material, marchas, amortecedores, marca);
    }

    // Pegando o material da bicicleta
    public String getMaterial() {
        return material;
    }

    // Colocando o material da bicicleta
    public void setMaterial(String material) {
        if (material == null || material.isEmpty()) {
            throw new IllegalArgumentException("Material não pode ser nulo ou vazio.");
        }
        this.material = material;
    }

    // Pegando a marca
    public String getMarca() {
        return marca;
    }

    // Colocando a marca
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    // Pegando as marchas
    public int getMarchas() {
        return marchas;
    }

    // Colocando as marchas
    public void setMarchas(int marchas) {
        if (marchas < 0) {
            throw new IllegalArgumentException("Número de marchas não pode ser negativo.");
        }
        this.marchas = marchas;
    }

    public boolean isAmortecedores() {
        return amortecedores;
    }

    public void setAmortecedores(boolean amortecedores) {
        this.amortecedores = amortecedores;
    }
}
