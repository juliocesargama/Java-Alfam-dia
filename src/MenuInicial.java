import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuInicial {
    //Função Menu Inicial
    public void Menuinicial() throws IOException {

        Cadastrar cadastrar = new Cadastrar();
        Listar listar = new Listar();

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String opcao = "";

        do {
            System.out.println("****************");
            System.out.println("AlfaCRUD - MENU");
            System.out.println("****************");
            System.out.println("");
            System.out.println("1 - Criar pessoa/aluno");
            System.out.println("2 - Listas pessoas/alunos");
            System.out.println("3 - Atualizar pessoa/aluno");
            System.out.println("4 - Excluir pessoa/aluno");
            System.out.println("5 - Encerrar aplicação");
            System.out.println("");
            System.out.println("Selecione uma opção:");

            opcao = obj.readLine();

            switch (opcao) {
                case "1":
                    System.out.println("Criar Pessoa/Aluno");
                    System.out.println("");
                    cadastrar.Cadastro();
                    break;
                case "2":
                    System.out.println("Listar pessoas/alunos");
                    System.out.println("");
                    listar.ListarCadastros();
                    break;
                case "3":
                    System.out.println("Atualizar pessoa/aluno");
                    System.out.println("");

                    break;
                case "4":
                    System.out.println("Excluir pessoa/aluno");
                    System.out.println("");

                    break;
                case "5":
                    System.out.println("");
                    System.out.println("Encerrando a aplicação...");

                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("Opção inválida, tente novamente");
                    System.out.println("");
            }

        } while (!(opcao == "1") || !(opcao == "2") || !(opcao == "3") || !(opcao == "4") || !(opcao == "5"));

    }
}
