package exercicios.operadores;

public class exercicio3 {
    public static void main(String[] args) {

        int x = 10;
        int y = 8;
        int z = 6;
        int w = 4;
        int i = 40;
        int j = 30;
        int k = 20;
        int l = 10;
        int m = 5;
        int n = x + i;
        int o = x + k;

        System.out.println("\nTransformar em numero negativo: " + (-m));

        System.out.println("\nPre Incrementar: x = ++ y");

        x = ++y;

        System.out.println("\nValor de x: " + x);
        System.out.println("\nValor de y: " + y);

        System.out.println("\nPre Decrementar: z = -- w");

        z = -- w;

        System.out.println("\nValor de z: " + z);
        System.out.println("\nValor de w: " + w);

        System.out.println("\nPos Incrementar: i = j ++");

        i = ++j;

        System.out.println("\nValor de i: " + i);
        System.out.println("\nValor de j: " + j);

        System.out.println("\nPos Decrementar: k = l --");

        k =  l --;

        System.out.println("\nValor de k: " + k);
        System.out.println("\nValor de l: " + l);

        n = --o;

        System.out.println("\nValor de n: " + n);
        System.out.println("\nValor de o: " + o);



    }
}
