package listaDeExercicios02;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("\n Digite o valor em celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("\n Valor me fahrenheit:" +  fahrenheit);


    }
}
