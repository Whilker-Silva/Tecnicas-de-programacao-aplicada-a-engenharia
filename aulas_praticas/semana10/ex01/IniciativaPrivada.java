package semana10.ex01;

public class IniciativaPrivada extends Beneficiario {

    private int percentualContribuicao;

    public IniciativaPrivada(String cpf, String nome, int percentualContribuicao) {
        super(nome, cpf);
        this.percentualContribuicao = percentualContribuicao;
    }

    @Override
    public double calculaAposentadoria() {
        double tetoINSS = 7507.49;
        return tetoINSS * percentualContribuicao / 100;
    }

}
