package semana12.ex01;

public class Locacao {
    private Veiculo veiculo;

    public Locacao(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorAluguel(double valorDiaria, int qtdDiarias) {
        return veiculo.calculaAluguel(valorDiaria, qtdDiarias);
    }
}
