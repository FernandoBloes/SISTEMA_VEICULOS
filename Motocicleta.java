public class Motocicleta extends Veiculo {

    // Atributos da classe Motocicleta
    public int cilindradas;
    public int torque;

    // Construtor do objeto
    public Motocicleta() {
        // Construtor padrão
    }

    // Construtor do objeto com os valores dados
    public Motocicleta(int cilindradas, int torque) {
        super(); // Inicializa os atributos da superclasse
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Métedo insert
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Motocicleta (Modelo, AnoFabricacao, Montadora, Cor, Cilindradas, Torque) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), cilindradas, torque);
    }

    // Pegando as cilindradas
    public int getCilindradas() {
        return cilindradas;
    }

    // Colocando as cilindradas
    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("Cilindradas devem ser um valor positivo.");
        }
        this.cilindradas = cilindradas;
    }

    // Pegando o torque
    public int getTorque() {
        return torque;
    }

    // Colocando o torque
    public void setTorque(int torque) {
        if (torque <= 0) {
            throw new IllegalArgumentException("Torque deve ser um valor positivo.");
        }
        this.torque = torque;
    }
}
