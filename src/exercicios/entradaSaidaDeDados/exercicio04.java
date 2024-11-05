package exercicios.entradaSaidaDeDados;

public class exercicio04 {
    public static void main(String[] args) {

        int quatidade = 1000;
        long identificador = 100001;
        float altura = 25.4f;
        double area = 45.4567;
        double tamanho = 650000000.00;
        char tipo = 'A';
        String palavra = "generation";

        System.out.printf("Variavel quantidade = %d", quatidade);
        System.out.printf("Variavel identidicador %d", identificador);
        System.out.printf("Variavel altura %.2f ", altura);
        System.out.printf("Variavel area = %.2f", area);
        System.out.printf("Variavel tamanho = %e", tamanho);
        System.out.printf("Variavel tamanho = %E" , tamanho);
        System.out.printf("Variavel tipo = %c", tipo);
        System.out.printf("Variavel palavra = %s" , palavra);




    }
}
