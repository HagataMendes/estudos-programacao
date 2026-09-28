package models;

    public class Carro extends Veiculo{
        public Long Id;
    public String Modelo;
    public int Ano;
    public String Cor;




    public void ExibirInformacao() {
        System.out.println(Id+ "O modelo do carro é: " + Modelo + "O ano do carro é:" + Ano + "A cor do meu carro é:" + Cor);

    }

        @Override
        public void MoverVeiculo() {
            System.out.println("Carro em movimento");
            System.out.println("Carro em alta velocidade");

        }
    }

