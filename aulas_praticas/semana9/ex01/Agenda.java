package semana9.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {

    private ArrayList<Contato> listaContatos;

    public Agenda() {
        listaContatos = new ArrayList<>();
    }

    public void cadastrar(String nome, String endereco, String email, String cpf, String estadoCivel) {
        listaContatos.add(new PessoaFisica(nome, endereco, email, cpf, estadoCivel));
    }

    public void cadastrar(String nome, String endereco, String email, String cnpj, int inscricaoEstadual) {
        listaContatos.add(new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual));
    }

    public Contato buscarContato(String contato) {

        for (Contato c : listaContatos) {

            if (c instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) c;
                if (pf.getCpf().equals(contato)) {
                    return pf;
                }
            }

            else {
                PessoaJuridica pj = (PessoaJuridica) c;
                if (pj.getCnpj().equals(contato)) {
                    return pj;
                }
            }
        }

        return null;
    }

    public boolean remover(String contato) {

        Contato c = buscarContato(contato);

        if (c != null) {
            listaContatos.remove(c);
            return true;
        }

        return false;
    }

    public List<Contato> getListaContatos() {
        return Collections.unmodifiableList(listaContatos);
    }

}
