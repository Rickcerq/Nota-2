import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            maca m1 = new maca();

            System.out.println("Quantas maças você deseja comprar?");
            m1.setQuantidade(input.nextInt());

            if (m1.getQuantidade() < 12) {
                m1.setPreço(1.30);
            } else {
                m1.setPreço(1);
            }

            m1.preço_total();
     }
    }