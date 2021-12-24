import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class MenuInicial {
    //Função Menu Inicial
    public void Menuinicial() throws IOException, ParseException {

        Cadastrar cadastrar = new Cadastrar();
        Listar listar = new Listar();
        Editar editar = new Editar();
        Excluir excluir = new Excluir();

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String opcao = "";

        do {
            System.out.println("****************");
            System.out.println("AlfaCRUD - MENU");
            System.out.println("****************");
            System.out.println("");
            System.out.println("1 - Criar pessoa/aluno");
            System.out.println("2 - Listar pessoas/alunos");
            System.out.println("3 - Atualizar pessoa/aluno");
            System.out.println("4 - Excluir pessoa/aluno");
            System.out.println("5 - Encerrar aplicação");
            System.out.println("");
            System.out.println("Selecione uma opção:");

            opcao = obj.readLine();
            System.out.println("");

            switch (opcao) {
                case "1":
                    cadastrar.Cadastro();
                    break;
                case "2":
                    listar.ListagemCompleta();
                    break;
                case "3":
                    editar.Edicao();
                    break;
                case "4":
                    excluir.Exclusao();
                    break;
                case "5":
                    System.out.println("");
                    System.out.println("Encerrando a aplicação...");

                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("Opção inválida, tente novamente.");
                    System.out.println("");
            }
        } while (!(opcao == "1") || !(opcao == "2") || !(opcao == "3") || !(opcao == "4") || !(opcao == "5"));
    }
}
