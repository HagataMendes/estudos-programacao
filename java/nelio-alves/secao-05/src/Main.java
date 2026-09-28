//import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else {
            if (hora < 18) {
                System.out.println("Boa tarde");
            } else {
                System.out.println("Boa noite");
            }
            sc.close();

            Locale.setDefault(Locale.US);
            sc = new Scanner(System.in);

            int minutos = sc.nextInt();

            double conta = 50.0;
            if (minutos > 100) {
                conta += (minutos - 100) * 2.0;
            }

            System.out.printf("Valor da conta = R$ %.2f%n", conta);
            sc.close();

            double preco = 34.5;
            double desconto;
            if (preco < 20.0) {
                desconto = preco * 0.1;
            } else {
                desconto = preco * 0.5;
            }
            System.out.println(desconto);

            sc.close();

        }
    }
}

