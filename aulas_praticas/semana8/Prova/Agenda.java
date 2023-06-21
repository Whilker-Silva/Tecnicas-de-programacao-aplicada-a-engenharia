import java.util.HashMap;

public class Agenda {

    private HashMap<String,Contato> listaContatos = new HashMap<>(); 

    public Agenda(){
        listaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Contato contato){
        listaContatos.put(nome, contato);
    }

    public boolean removerContato(String nome){

        if(listaContatos.get(nome) == null){
            return false;
        }
        listaContatos.remove(nome);
        return true;
    }

    public boolean atualizarContato(String nome, Contato contato){
        if(listaContatos.get(nome) == null){
            return false;
        }
        listaContatos.put(nome, contato);
        return true;
    }

    public String getEndereco(String nome){
        return listaContatos.get(nome).getEndereco();
    }

    public String getTelefone(String nome){
        return listaContatos.get(nome).getTelefone();
    }



    
    
}
