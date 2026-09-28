import models.Carro;
import models.ContaBancaria;
import models.Fabricante;

public class Main {
    public static void main(String[] args) {


        Carro carro = new Carro();

        carro.Id = 777L;
        carro.Modelo = "Onix";
        carro.Ano = 2024;
        carro.Cor = "Preto";

        carro.ExibirInformacao();

        System.out.println("Conceito de Abstração!!!");
        carro.MoverVeiculo();

        System.out.println("Conceito de Polimorfismo!!!");
        Fabricante fab = new Fabricante();

        System.out.println("Conceito de Encapsulamento");
        ContaBancaria saldo = new ContaBancaria();

        //

        System.out.println(saldo.getSaldo());
        saldo.Depositar(357.99);

    }
}
