package semana10.ex01;

public class IniciativaPrivada extends Beneficiario {

    private int percentualContribuicao;
    private static final double TETOINSS = 7507.49;

    public IniciativaPrivada(String cpf, String nome, int percentualContribuicao) {
        super(nome, cpf);
        this.percentualContribuicao = percentualContribuicao;
    }

    @Override
    public double calculaAposentadoria() {        
        return TETOINSS * percentualContribuicao / 100;
    }

}
