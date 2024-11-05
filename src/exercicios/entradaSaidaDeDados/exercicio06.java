package exercicios.entradaSaidaDeDados;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade;
        long identificador;
        float altura;
        double area;
        char tipo;
        String frase;
        boolean ativo;

        System.out.println("\nDigite um valor para a variavel quantidade (int): ");
        quantidade =  scanner.nextInt();

        System.out.println("\nDigite um valor para a variavel identificador (long) ");
        identificador = scanner.nextLong();

        System.out.printf("\nQuantidede de valro para variaver altura (float) ");
        altura = scanner.nextFloat();

        System.out.println("\nQuantidade de valor para variavel area (double) ");
        area = scanner.nextDouble();

        System.out.println("\nDigite um valo para a variavel tipo (char) ");
        tipo = scanner.next().charAt(0);

        System.out.println("\nDigite um valor para a vaiavel frase (Sring) ");
        scanner.skip("\\R?");
        frase = scanner.nextLine();

        System.out.println("\nDigite u valor para a variavel ativo (boolean) ");
        ativo = scanner.nextBoolean();

        System.out.println("\nDados recebidos via teclado:\n");


        System.out.println("\nVariavel quantidade =" + quantidade);
        System.out.println("\nVariavel identificador ="  + identificador);
        System.out.println("\nVariavel altura =" + altura);
        System.out.println("\n Variavel area =" + area);
        System.out.println("\nVariave tipo =" +  tipo);
        System.out.println("\nVariavel palavra =" + frase);
        System.out.println("\nVariavel tamanho =" +  ativo);









    }
}
