public class VeiculoDomestico extends Veiculo {

    // Definição das propriedades da classe VeiculoDomestico
    public int passageiros;
    public String freio;
    public boolean airBag;

    // Construtor padrão da classe
    public VeiculoDomestico() {
        // Inicialização padrão
    }

    // Construtor que aceita valores para as propriedades
    public VeiculoDomestico(int passageiros, String freio, boolean airBag) {
        super(); // Chama o construtor da superclasse
        this.passageiros = passageiros;
        this.freio = freio;
        this.airBag = airBag;
    }

    // Método para gerar o comando de inserção no banco de dados
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Veiculo (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Freio, AirBag) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), passageiros, freio, airBag);
    }

    // Método para obter o número de passageiros
    public int getPassageiros() {
        return passageiros;
    }

    // Método para definir o número de passageiros
    public void setPassageiros(int passageiros) {
        if (passageiros <= 0) {
            throw new IllegalArgumentException("Número de passageiros deve ser positivo.");
        }
        this.passageiros = passageiros;
    }

    // Método para obter o tipo de freio
    public String getFreio() {
        return freio;
    }

    // Método para definir o tipo de freio
    public void setFreio(String freio) {
        this.freio = freio;
    }

    // Método para verificar se o veículo possui airbag
    public boolean isAirBag() {
        return airBag;
    }

    // Método para definir a presença do airbag
    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }
}
