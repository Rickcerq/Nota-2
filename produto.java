public class produto {
    private int quantidade_maxima, quantidade_minima, quantidade_atual;
    private double quantidade_media;

    public void setQuantidade_maxima(int quantidade_maxima) {
        this.quantidade_maxima = quantidade_maxima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }

    public void setQuantidade_atual(int quantidade_atual) {
        this.quantidade_atual = quantidade_atual;
    }

    public void setQuantidade_media(double quantidade_media) {
        this.quantidade_media = quantidade_media;   
    }

    public double calcular_media() {
        quantidade_media = (quantidade_maxima + quantidade_minima)/2;
        return quantidade_media;
    }

    public double getQuantidade_media() {
        return quantidade_media;
    }

    public void efetuar_comprar() {
        if (quantidade_atual >= quantidade_media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
