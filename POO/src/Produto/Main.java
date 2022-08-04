package Produto;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(1);
        p.setDescricao("Caneta");
        p.setValor(2.5);

        System.out.println("O produto " + p.getDescricao() + "custa " + p.getValor());
    }
}
