package semana10.ex01;

public class ForcasArmadas extends Beneficiario implements ContribuinteINSS {

    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario) {
        super(nome, cpf);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public double calculaAposentadoria() {
        return ultimoSalario*0.9;
    }

    @Override
    public double calculaConribucao() {
        return ultimoSalario*0.11;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Contrição INSS: %.2f\n", calculaConribucao());
    }

}
