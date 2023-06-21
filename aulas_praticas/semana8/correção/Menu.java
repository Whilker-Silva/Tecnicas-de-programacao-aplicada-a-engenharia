package semana8.correção;
// 27 ptos
import java.util.Scanner;

public class Menu{

    //Atributos
    private Agenda contatos;// 2 ptos
    private Scanner entrada = new Scanner(System.in);//Inicialização no construtor

    public Menu(){
        contatos = new Agenda();
    }
      
    //Metodos

    public void executar(){// 5 ptos

        exibirMenu();//Erro: repetição de código
        int opcao = lerOpcao(); 
              
        while(opcao != 5){
        executarOpcao(opcao); 
        exibirMenu();//Erro: repetição de código
        opcao = lerOpcao();
        }

        entrada.close();
    }


    private void exibirMenu(){// 2 ptos
        System.out.printf("\n\n### Menu de opcoes ###\n");
        System.out.println("1. Adicionar contato");
        System.out.println("2. Remover contato");
        System.out.println("3. Atualizar contato");
        System.out.println("4. Imprimir contato");
        System.out.println("5. Sair");
    }    

    private void executarOpcao(int opcao){ // 13 ptos       
        switch(opcao){// 5 ptos
            case 1:// 2 ptos
                contatos.adicionarContato(lerNome(), lerContato());
            break;

            case 2: // 3 ptos
                if(contatos.removerContato(lerNome())){
                    System.out.print("Contato excluido com sucesso");
                } else{
                    System.out.print("Contato não localizado");
                }               
            break;

            case 3: // 3 ptos
                if(contatos.atualizarContato(lerNome(), lerContato())){
                    System.out.print("Contato excluido com sucesso");
                } else{
                    System.out.print("Contato não localizado");
                }   
            break;

            case 4: //ok
                imprimirContato();
            break;

            case 5: 
            break;

            default:
                System.out.print("Opcao invalida!");
        }
    }

    private int lerOpcao(){//ok
        System.out.print("Informe a opcao desejada: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private String lerNome(){// 1 pto
        System.out.print("Informe o nome do contato: ");
        return entrada.nextLine();
    }

    private Contato lerContato(){// 2 ptos
        System.out.print("Informe o enderço: ");
        String endereco = entrada.nextLine();
        System.out.print("Informe o telefone: ");
        String telefone = entrada.nextLine();

        return new Contato(endereco, telefone);
    }

    
    private void imprimirContato(){// 2 ptos
        String nome = lerNome();
        System.out.printf("\nContato: %s | Endereço: %s | Telefone: %s", nome, contatos.getEndereco(nome), contatos.getTelefone(nome));
    }
        
}
