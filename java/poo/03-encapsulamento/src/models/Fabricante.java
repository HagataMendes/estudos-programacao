package models;

public class Fabricante {
    public class Carro extends ModeloAno {

        public Long Id;
        public String Modelo;
        public int Ano;
        public String Cor;

        @Override
        public void VeiculoDoAno() {
            System.out.println("Carro de corrida ABCD");
        }

    }
}
