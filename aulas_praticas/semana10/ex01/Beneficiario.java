package semana10.ex01;

public abstract class Beneficiario {
    private String nome;
    private String cpf;

    public Beneficiario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calculaAposentadoria();

    @Override
    public String toString() {
        return String.format("Nome: %s\n", nome) +
                String.format("CPF: %s\n", cpf) +
                String.format("Aposentadoria: %.2f\n", calculaAposentadoria());
    }

}
