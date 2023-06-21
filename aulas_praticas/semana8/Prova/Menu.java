import java.util.Scanner;

public class Menu{

    //Atributos
    private Agenda contatos;
    private Scanner entrada = new Scanner(System.in);

    public Menu(){
        contatos = new Agenda();
    }
      
    //Metodos

    public void executar(){

        exibirMenu();
        int opcao = lerOpcao(); 
              
        while(opcao != 5){
        executarOpcao(opcao); 
        exibirMenu();
        opcao = lerOpcao();
        }

        entrada.close();
    }


    private void exibirMenu(){
        System.out.printf("\n\n### Menu de opcoes ###\n");
        System.out.println("1. Adicionar contato");
        System.out.println("2. Remover contato");
        System.out.println("3. Atualizar contato");
        System.out.println("4. Imprimir contato");
        System.out.println("5. Sair");
    }    

    private void executarOpcao(int opcao){        
        switch(opcao){
            case 1:
                contatos.adicionarContato(lerNome(), lerContato());
            break;

            case 2: 
                if(contatos.removerContato(lerNome())){
                    System.out.print("Contato excluido com sucesso");
                } else{
                    System.out.print("Contato não localizado");
                }               
            break;

            case 3: 
                if(contatos.atualizarContato(lerNome(), lerContato())){
                    System.out.print("Contato excluido com sucesso");
                } else{
                    System.out.print("Contato não localizado");
                }   
            break;

            case 4: 
                imprimirContato();
            break;

            case 5: 
            break;

            default:
                System.out.print("Opcao invalida!");
        }
    }

    private int lerOpcao(){
        System.out.print("Informe a opcao desejada: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private String lerNome(){
        System.out.print("Informe o nome do contato: ");
        return entrada.nextLine();
    }

    private Contato lerContato(){
        System.out.print("Informe o enderço: ");
        String endereco = entrada.nextLine();
        System.out.print("Informe o telefone: ");
        String telefone = entrada.nextLine();

        return new Contato(endereco, telefone);
    }

    
    private void imprimirContato(){
        String nome = lerNome();
        System.out.printf("\nContato: %s | Endereço: %s | Telefone: %s", nome, contatos.getEndereco(nome), contatos.getTelefone(nome));
    }
        
}