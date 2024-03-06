import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        produto p1 = new produto();

        System.out.println("Digite a quantidade atual em estoque");
        p1.setQuantidade_atual(input.nextInt());

        System.out.println("Digite a quantidade maxima em estoque");
        p1.setQuantidade_maxima(input.nextInt());

        System.out.println("Digite a quantidade minima em estoque");
        p1.setQuantidade_minima(input.nextInt());

        p1.setQuantidade_media(0);

        p1.calcular_media();

        System.out.println("A quantidade média dos produtos é de "+ p1.getQuantidade_media());

        p1.efetuar_comprar();
    }
}
