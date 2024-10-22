public class VeiculoDomestico extends Veiculo {

    // Atributos da classe VeiculiDomestico
    public int passageiros;
    public String freio;
    public boolean airBag;

    // Construção do objeto
    public VeiculoDomestico() {
        // Construtor padrão
    }

    // Construtor do objeto com os valores dados
    public VeiculoDomestico(int passageiros, String freio, boolean airBag) {
        super(); // Inicializa os atributos da superclasse
        this.passageiros = passageiros;
        this.freio = freio;
        this.airBag = airBag;
    }

    // Método insert
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Veiculo (Modelo, AnoFabricacao, Montadora, Cor, Passageiros, Freio, AirBag) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), passageiros, freio, airBag);
    }

    // Pegando o número de passageiros
    public int getPassageiros() {
        return passageiros;
    }

    // Colocando o número de passageiros
    public void setPassageiros(int passageiros) {
        if (passageiros <= 0) {
            throw new IllegalArgumentException("Número de passageiros deve ser positivo.");
        }
        this.passageiros = passageiros;
    }

    // Pegendo o freio do carro
    public String getFreio() {
        return freio;
    }

    // Colocando o freio do carro
    public void setFreio(String freio) {
        this.freio = freio;
    }

    public boolean isAirBag() {
        return airBag;
    }

    // Colocando o airbag no carro
    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }
}
