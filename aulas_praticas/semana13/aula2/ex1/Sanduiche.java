package semana13.aula2.ex1;

public abstract class Sanduiche {

    private String nome;

    public Sanduiche(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getPreco();
}
