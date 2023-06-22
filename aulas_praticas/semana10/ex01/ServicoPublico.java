package semana10.ex01;

public class ServicoPublico extends Beneficiario implements ContribuinteINSS {

    private double mediaSalarial;
    
    public ServicoPublico(String cpf, String nome, double mediaSalarial){
        super(nome, cpf);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public double calculaAposentadoria(){
        return mediaSalarial*0.8;
    }

    @Override
    public double calculaConribucao(){
        return mediaSalarial*0.14;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Contrição INSS: %.2f\n", calculaConribucao());
    }

    
}
