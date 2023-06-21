package semana8.correção;
// 2 ptos
public class Contato {
    
    private String endereco;//Erro: nome?
    private String telefone;

    public Contato(String endereco, String telefone){//Erro: nome?
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {// 1 pto
        return endereco;
    }
    
    public String getTelefone() {// 1 pto
        return telefone;
    }    

}
