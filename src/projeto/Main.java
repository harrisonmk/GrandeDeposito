package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double valor = scan.nextDouble();

        if (valor > 0) {

            System.out.printf("""
                               Deposito realizado com sucesso!
                               Saldo atual: R$ %s \n """, deci.format(valor));

        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");

        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");

        }

    }

}
