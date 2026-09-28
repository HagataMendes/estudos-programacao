public class Condicionais {
    public static void main (String[] args) {
        int anoDeLancamento = 2022;
        boolean incluindoNoPlano = true;
        double notaDofilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assitir!");
        }

        if (incluindoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else  {
            System.out.println("Deve pagar a locação");
        }
    }
}
