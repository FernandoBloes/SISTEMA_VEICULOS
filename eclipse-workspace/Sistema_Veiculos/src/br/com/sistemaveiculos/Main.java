package br.com.sistemaveiculos;

public class Main {
    public static void main(String[] args) {
        AutomovelDomestico automovel = new AutomovelDomestico("Fusca", 1976, 5, "ABS", true);
        System.out.println(automovel.gerarComandoInsert());
    }
}
