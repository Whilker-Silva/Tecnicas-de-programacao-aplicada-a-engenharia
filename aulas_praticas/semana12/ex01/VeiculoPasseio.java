package semana12.ex01;

public class VeiculoPasseio implements Veiculo {

    @Override
    public double calculaAluguel(double valorDiaria, int qdtDiarias) {
        return valorDiaria * qdtDiarias;
    }
}
