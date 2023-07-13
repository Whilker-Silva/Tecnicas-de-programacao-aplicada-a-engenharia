package semana13.aula2.ex1;

public class Queijo extends Ingredientes {

    private int quantidade;

    public Queijo(Sanduiche s, int quantidade) {
        super(s);
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return 2.3 * quantidade + getSanduiche().getPreco();
    }
}
