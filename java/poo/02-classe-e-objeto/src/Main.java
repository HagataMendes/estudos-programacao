import models.Carro;

public class Main {
    public static void main(String[] args) {


        Carro carro = new Carro();

        carro.Modelo = "Onix";
        carro.Ano = 2024;
        carro.Cor = "Preto";

        carro.ExibirInformacao();

    }
}
