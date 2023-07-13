package semana13.aula2.ex1;

public class Tomate extends Ingredientes {

    private int quantidade;

    public Tomate(Sanduiche s, int quantidade) {
        super(s);
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return 0.5 * quantidade + getSanduiche().getPreco();
    }
}
