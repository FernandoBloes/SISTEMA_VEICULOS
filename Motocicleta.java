public class Motocicleta extends Veiculo {

    // Variáveis que representam as características da motocicleta
    public int cilindradas;
    public int torque;

    // Construtor sem parâmetros para a classe Motocicleta
    public Motocicleta() {
        // Inicialização padrão
    }

    // Construtor que define as propriedades da motocicleta no momento da criação
    public Motocicleta(int cilindradas, int torque) {
        super(); // Chama o construtor da classe base (Veiculo)
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Método que gera a instrução SQL para inserir uma nova motocicleta no banco de
    // dados
    @Override
    public String insert() {
        return String.format(
                "INSERT INTO Motocicleta (Modelo, AnoFabricacao, Montadora, Cor, Cilindradas, Torque) " +
                        "VALUES ('%s', %d, '%s', '%s', %d, %d);",
                getModelo(), getAnoFabricacao(), getMontadora(), getCor(), cilindradas, torque);
    }

    // Método para obter o valor das cilindradas
    public int getCilindradas() {
        return cilindradas;
    }

    // Método para definir as cilindradas da motocicleta, com validação
    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("Cilindradas devem ser um valor positivo.");
        }
        this.cilindradas = cilindradas;
    }

    // Método para retornar o valor do torque da motocicleta
    public int getTorque() {
        return torque;
    }

    // Método para definir o torque da motocicleta, com validação
    public void setTorque(int torque) {
        if (torque <= 0) {
            throw new IllegalArgumentException("Torque deve ser um valor positivo.");
        }
        this.torque = torque;
    }
}
