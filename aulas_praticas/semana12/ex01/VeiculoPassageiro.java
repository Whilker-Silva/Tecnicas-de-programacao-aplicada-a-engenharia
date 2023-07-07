package semana12.ex01;

public class VeiculoPassageiro implements Veiculo {
    private int capacidade;

    public VeiculoPassageiro(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public double calculaAluguel(double valorDiaria, int qdtDiarias) {
        return valorDiaria * qdtDiarias * (1 + (capacidade / 100.0));
    }

}
