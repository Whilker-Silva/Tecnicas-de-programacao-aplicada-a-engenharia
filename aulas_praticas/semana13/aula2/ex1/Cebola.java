package semana13.aula2.ex1;

public class Cebola extends Ingredientes {

    private int quantidade;

    public Cebola(Sanduiche s, int quantidade) {
        super(s);
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return 1.3 * quantidade + getSanduiche().getPreco();
    }
}
