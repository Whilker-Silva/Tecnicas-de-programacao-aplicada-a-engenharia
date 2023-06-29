public class SeguroVida implements Segurado {

    private int idade;
    private String genero;

    public SeguroVida(int idade, String genero) {
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public double getPremio() {

        int faixaEtaria = idade / 10 + 1;

        if (idade < 60) {
            return faixaEtaria * 100f;
        }

        if (genero.equals("feminino")) {
            return 700;

        }

        return 800;
    }

    @Override
    public String toString() {
        return String.format("Seguro de vida | Idade: %d | Genero: %s | Premio: R$%.2f", idade, genero, getPremio());
    }

}
