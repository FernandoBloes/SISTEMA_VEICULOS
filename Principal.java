public class Principal {

    public static void main(String[] args) {
        // Objeto do Veículo Domestico
        VeiculoDomestico carro = new VeiculoDomestico();
        carro.setModelo("Hatch");
        carro.setAnoFabricacao(2021);
        carro.setMontadora("Citroen");
        carro.setCor("Branco");
        carro.setPassageiros(5);
        carro.setFreio("Disco");
        carro.setAirBag(true);

        // Informações do carro
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Montadora: " + carro.getMontadora());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Máximo de Passageiros: " + carro.getPassageiros());
        System.out.println("Tipo de Freio: " + carro.getFreio());
        System.out.println("Airbag: " + (carro.isAirBag() ? "Sim" : "Não"));

        // Objeto da motocicleta
        Motocicleta moto = new Motocicleta();
        moto.setModelo("Suzuki GSX-R1000");
        moto.setAnoFabricacao(2021);
        moto.setMontadora("Suzuki");
        moto.setCor("Amarela");
        moto.setCilindradas(1000);
        moto.setTorque(120);

        // Informações da motocicleta
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano de Fabricação: " + moto.getAnoFabricacao());
        System.out.println("Montadora: " + moto.getMontadora());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Torque: " + moto.getTorque());

        // Objeto do Caminhão
        Caminhao caminhao = new Caminhao();
        caminhao.setModelo("Baú");
        caminhao.setAnoFabricacao(2024);
        caminhao.setMontadora("Mercedes-Benz Atego");
        caminhao.setCor("Prata");
        caminhao.setEixo(3);
        caminhao.setPeso(15000);

        // Informação do caminhão
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
        System.out.println("Montadora: " + caminhao.getMontadora());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Quantidade de Eixos: " + caminhao.getEixo());
        System.out.println("Peso Bruto: " + caminhao.getPeso());

        // objeto da Bicicleta
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setModelo("E-Bikes");
        bicicleta.setMarca("Trek Powerfly");
        bicicleta.setCor("Branca");
        bicicleta.setMaterial("Alumínio");
        bicicleta.setMarchas(21);
        bicicleta.setAmortecedores(true);

        // Informações sobre a bicicleta
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Cor: " + bicicleta.getCor());
        System.out.println("Material: " + bicicleta.getMaterial());
        System.out.println("Marchas: " + bicicleta.getMarchas());

        // objeto do Skate
        Skate skate = new Skate();
        skate.setModelo("Cruiser");
        skate.setMarca("Globe Blazer");
        skate.setCor("Azul Claro");
        skate.setTipoRodas("Goma");

        // Informações sobre o skate
        System.out.println("Modelo: " + skate.getModelo());
        System.out.println("Marca: " + skate.getMarca());
        System.out.println("Cor: " + skate.getCor());
        System.out.println("Tipo de Rodas: " + skate.getTipoRodas());
    }
}