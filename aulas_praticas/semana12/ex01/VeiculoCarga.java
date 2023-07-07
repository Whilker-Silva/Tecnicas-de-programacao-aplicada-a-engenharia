package semana12.ex01;

public class VeiculoCarga implements Veiculo {
    private String tipoCabine;

    public VeiculoCarga(String tipoCabine) {
        this.tipoCabine = tipoCabine;
    }

    @Override
    public double calculaAluguel(double valorDiaria, int qdtDiarias) {
        if (tipoCabine.equals("simples")) {
            return 1.2 * valorDiaria * qdtDiarias;
        }
        return 1.5 * valorDiaria * qdtDiarias;
    }

}
