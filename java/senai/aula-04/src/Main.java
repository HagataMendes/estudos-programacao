import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        int num = 229;
//        Long num04 = 10L;
//        byte numNovo = -128;
//        byte numNovo02 = 127;
//        System.out.println(num+num04);
//        System.out.println(num-num04);
//        System.out.println(num/num04);
//        System.out.println(num%num04);
//
//        System.out.println(numNovo*numNovo02);
//
//        System.out.println("-------------------------------------------");
//        String nome = "Hagata";
//        System.out.println();
//
//        char status = 'H';
//        char status1 = 'A';
//        char status2 = 'G';
//        char status3 = 'A';
//        char status4 = 'T';
//        char status5 = 'A';
//        System.out.println(status+status1+status2+status3+status4+status5);
//        System.out.println(""+status+status1+status2+status3+status4+status5);
//

//        System.out.println("-------------------------------------------");
//
//        Float num02 = 217.5f;
//        Double num03 = 10.5;
//        System.out.println(num+num02);
//        System.out.println(num-num02);
//        System.out.println(num/num02);
//        System.out.println(num%num02);
//
//
//
//            Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite tre caracteres:");
//
//        char char1 = scanner.next().charAt(0); // Lê o primeiro caractere
//        char char2 = scanner.next().charAt(0); // Lê o segundo caractere
//        char char3 = scanner.next().charAt(0); // Lê o terceiro caractere
//
//        // Concatena e exibe os caracteres
//        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3);
//        scanner.close();


        System.out.println("-------------------------------------------");
//
//        //Promoção Automática
//
//        int numeroInt = 10;
//        double numeroDouble = numeroInt; // Promoção automática
//        System.out.println(numeroInt);
//        System.out.println(numeroDouble); // Saída: 10.0
//


//       //Casting Explícito
//
//        double numeroDouble = 123.456;
//        int numeroInt = (int) numeroDouble; // Casting explícito
//        System.out.println(numeroInt); // Saída: 123 (perda da parte decimal)
//
//     // Parsing de Strings

//        String numeroTexto = "42";
//        int numeroInt = Integer.parseInt(numeroTexto);
//        System.out.println(numeroInt); // Saída: 42
//
//       //Exemplo de Problema com Estouro:
//        byte valor = 127;
//        valor++;
//        System.out.println(valor); // Saída: -128 (overflow)

      //Atividade 4

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String inputInt = scanner.nextLine();

        try {
            int numeroInt = Integer.parseInt(inputInt);
            System.out.println("Número inteiro convertido: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
        }

        System.out.print("Digite um número decimal: ");
        String inputDouble = scanner.nextLine();

        try {
            double numeroDouble = Double.parseDouble(inputDouble);
            System.out.println("Número decimal convertido: " + numeroDouble);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para decimal: " + e.getMessage());
        }
    }
    }