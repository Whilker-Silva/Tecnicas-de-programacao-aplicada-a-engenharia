package semana13.aula2.ex1;

public abstract class Ingredientes extends Sanduiche {

    private Sanduiche s;

    public Ingredientes(Sanduiche s) {
        super(s.getNome());
        this.s = s;
    }

    public Sanduiche getSanduiche() {
        return s;
    }

}
