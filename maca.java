public class maca {
    private int quantidade;
    private double preço;
    public boolean setQuantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void preço_total() {
        double preço_total = quantidade * preço;
        System.out.printf("O preço total da compra foi de %.2f R$", preço_total); 
    }
    
}
