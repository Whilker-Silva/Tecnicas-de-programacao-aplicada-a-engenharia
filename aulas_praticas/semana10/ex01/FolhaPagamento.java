package semana10.ex01;

import java.util.ArrayList;

public class FolhaPagamento {

    private ArrayList<Beneficiario> listaBeneficiarios;

    public FolhaPagamento() {
        listaBeneficiarios = new ArrayList<>();
    }

    public void cadastrarBeneficiario(Beneficiario ben) {
        listaBeneficiarios.add(ben);
    }

    public void gerarFolhaPagamento() {
        
        for(Beneficiario ben : listaBeneficiarios){
            System.out.println(ben.toString());
        }
    }

}
