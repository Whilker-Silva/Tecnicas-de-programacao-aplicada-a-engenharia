package semana13.aula2.ex1;

public class Hamburguer extends Ingredientes {

    private int quantidade;

    public Hamburguer(Sanduiche s, int quantidade) {
        super(s);
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return 4.0 * quantidade + getSanduiche().getPreco();
    }
}
