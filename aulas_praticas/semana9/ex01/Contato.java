package semana9.ex01;

public class Contato {

    private String nome;
    private String endereco;
    private String email;

    public Contato(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Endereço: " + endereco + " | E-mail: " + email;
    }
}
