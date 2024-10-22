public class Principal {

    public static void main(String[] args) {
        // Instanciando um skate
        Skate skate = new Skate();
        skate.setModelo("Longboard");
        skate.setMarca("Santa Cruz");
        skate.setCor("Roxo");
        skate.setTipoRodas("Poliuretano");

        // Exibindo as características do skate
        System.out.println("Modelo: " + skate.getModelo());
        System.out.println("Marca: " + skate.getMarca());
        System.out.println("Cor: " + skate.getCor());
        System.out.println("Tipo de Rodas: " + skate.getTipoRodas());

        // Instanciando uma bicicleta
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setModelo("Mountain Bike");
        bicicleta.setMarca("Specialized Rockhopper");
        bicicleta.setCor("Verde");
        bicicleta.setMaterial("Carbono");
        bicicleta.setMarchas(24);
        bicicleta.setAmortecedores(true);

        // Exibindo as características da bicicleta
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Cor: " + bicicleta.getCor());
        System.out.println("Material: " + bicicleta.getMaterial());
        System.out.println("Marchas: " + bicicleta.getMarchas());

        // Instanciando um caminhão
        Caminhao caminhao = new Caminhao();
        caminhao.setModelo("Caçamba");
        caminhao.setAnoFabricacao(2024);
        caminhao.setMontadora("Volvo FH");
        caminhao.setCor("Azul");
        caminhao.setEixo(4);
        caminhao.setPeso(18000);

        // Exibindo as características do caminhão
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
        System.out.println("Montadora: " + caminhao.getMontadora());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Quantidade de Eixos: " + caminhao.getEixo());
        System.out.println("Peso Bruto: " + caminhao.getPeso());

        // Instanciando uma motocicleta
        Motocicleta moto = new Motocicleta();
        moto.setModelo("Yamaha MT-09");
        moto.setAnoFabricacao(2023);
        moto.setMontadora("Yamaha");
        moto.setCor("Vermelha");
        moto.setCilindradas(847);
        moto.setTorque(87);

        // Exibindo as características da moto
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano de Fabricação: " + moto.getAnoFabricacao());
        System.out.println("Montadora: " + moto.getMontadora());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Torque: " + moto.getTorque());

        // Instanciando um carro doméstico
        VeiculoDomestico carro = new VeiculoDomestico();
        carro.setModelo("Sedan");
        carro.setAnoFabricacao(2022);
        carro.setMontadora("Honda");
        carro.setCor("Preto");
        carro.setPassageiros(5);
        carro.setFreio("ABS");
        carro.setAirBag(true);

        // Exibindo as características do carro
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Montadora: " + carro.getMontadora());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Máximo de Passageiros: " + carro.getPassageiros());
        System.out.println("Tipo de Freio: " + carro.getFreio());
        System.out.println("Airbag: " + (carro.isAirBag() ? "Sim" : "Não"));
    }
}
