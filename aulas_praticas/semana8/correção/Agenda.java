package semana8.correção;
// 16 ptos
import java.util.HashMap;

public class Agenda {

    private HashMap<String,Contato> listaContatos = new HashMap<>(); //Erro: 2 inicializações? // 2 ptos

    public Agenda(){// 2 ptos
        listaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Contato contato){//Erro: parâmetros
        listaContatos.put(nome, contato);
    }

    public boolean removerContato(String nome){// 5 ptos

        if(listaContatos.get(nome) == null){
            return false;
        }
        listaContatos.remove(nome);
        return true;
    }

    public boolean atualizarContato(String nome, Contato contato){//Erro: parâmetros
        if(listaContatos.get(nome) == null){
            return false;
        }
        listaContatos.put(nome, contato);
        return true;
    }

    public String getEndereco(String nome){// 3 ptos
        return listaContatos.get(nome).getEndereco();
    }

    public String getTelefone(String nome){// 4 ptos
        return listaContatos.get(nome).getTelefone();
    }



    
    
}
