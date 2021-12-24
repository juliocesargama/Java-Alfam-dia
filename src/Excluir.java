import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excluir {

    Listar lista = new Listar();
    MenuInicial menu = new MenuInicial();
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    int opcao;

    public void Exclusao () throws IOException {

        if(!Main.cadastro.isEmpty()){
            do {

                System.out.println("Excluir Aluno/Pessoa");
                lista.ListagemResumida();
                System.out.println("Informe o número da Pessoa/Aluno a excluir: ");
                opcao = Integer.parseInt(obj.readLine());

            } while (opcao < 0 || opcao > Main.cadastro.size());

            Main.cadastro.remove(opcao);

            System.out.println("");
            System.out.println("Cadastro removido com sucesso!");
            System.out.println("Pressione ENTER para voltar ao menu inicial.");
            new java.util.Scanner(System.in).nextLine();

            menu.Menuinicial();

        }else{

            System.out.println("");
            System.out.println("Não há Aluno/Pessoas cadastradas.");
            System.out.println("");

        }
        System.out.println("Pressione ENTER para voltar ao menu inicial.");
        new java.util.Scanner(System.in).nextLine();
    }
}
