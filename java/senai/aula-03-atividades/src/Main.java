//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Média de Tres Números
    int num01 = 29;
    int num02 = 50;
    int num03 = 38;
    double media = (num01 + num02 + num03) / 3.0;

    float media02 = (num01 + num02 + num03) / 3.0f;

    long media03 = (num01 + num02 + num03) / 3L;

    System.out.println("A média é: " +media);
    System.out.println("A média é: " +media02);
    System.out.println("A média é: " +media03);

        System.out.println("------------------------------------------");



    //Declaração de long
        long distancia = 149600000L;

        System.out.println(" A distancia da Terra ao sol é:" + distancia + "km.");

        System.out.println("------------------------------------------");

        //Valor Unicode
                char letra = 'H';
                char letra1 = 'A';
                char letra2 = 'G';
                char letra3 = 'A';
                char letra4 = 'T';
                char letra5 = 'A';

                int valorUnicode = letra;

                System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);

                System.out.println("O valor Unicode de '" + letra1 + "' é: " + valorUnicode);

                System.out.println("O valor Unicode de '" + letra2 + "' é: " + valorUnicode);

                System.out.println("O valor Unicode de '" + letra3 + "' é: " + valorUnicode);

                System.out.println("O valor Unicode de '" + letra4 + "' é: " + valorUnicode);

                System.out.println("O valor Unicode de '" + letra5 + "' é: " + valorUnicode);

                 System.out.println("------------------------------------------");

                 //TiposBooleanos
        int numero = 5;
        boolean maiorQueDez = numero > 10;

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);

       //Arrays
        int[] numeros = {10, 20, 30, 40, 50,60,70,80,90,100};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Terceiro número: " + numeros[3]);
        System.out.println("Quarto  número: " + numeros[4]);
        System.out.println("Quinto número: " + numeros[5]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        System.out.println("------------------------------------------");

        //Retangulo
        double largura = 5.0;
        double altura = 3.0;
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);

        System.out.println("------------------------------------------");

        //String e dados multivalorados
        String nome = "Hágata Mendes";
        int idade = 23;
        double peso = 57.0;
        System.out.println("Olá, " + nome +  "minha idade é" + idade);

        System.out.println("------------------------------------------");

        //Impar ou par
        int num = 8;
        if (num % 2 == 0) {
            System.out.println("O número " + num+ " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");


        }
    }
}



