package listaDeExercicios02;

import java.util.Scanner;

public class AreaDoRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura, altura, area;

        System.out.println("\nDigite valor de largura: ");
        largura = sc.nextDouble();

        System.out.println("\nDigtite valor de altura: ");
        altura = sc.nextDouble();

        area = largura * altura;

        System.out.println("\nArea do retangulo: " + area);








    }
}
