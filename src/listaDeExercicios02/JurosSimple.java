package listaDeExercicios02;

import java.util.Scanner;

public class JurosSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double capital, taxa, montante;
        int tempo;

        System.out.println("\n Digite valor do capital:" );
        capital = sc.nextDouble();

        System.out.println("\n Digite valor de taxa da juros ANUAL:");
        taxa = sc.nextDouble();

        System.out.println("\n Digite o tempo:");
        tempo = sc.nextInt();

        montante = capital * taxa / tempo;

        System.out.println("\n Valor final do montante:" + montante);

    }
}
