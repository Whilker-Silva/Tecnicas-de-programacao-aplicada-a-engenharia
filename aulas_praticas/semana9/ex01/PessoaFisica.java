package semana9.ex01;

public class PessoaFisica extends Contato {

    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String estadoCivel) {

        super(nome, endereco, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivel;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " | CPF: " + cpf + " | Estado civil: " + estadoCivil;
    }

}
