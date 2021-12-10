import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static String opcao = "";

    static void Menuinicial() throws IOException {
        do {
            System.out.println("Alfa CRUD");
            System.out.println("***********");
            System.out.println("");
            System.out.println("MENU");
            System.out.println("***********");
            System.out.println("");
            System.out.println("1 - Criar pessoa/aluno");
            System.out.println("2 - Listas pessoas");
            System.out.println("3 - Atualizar pessoa/aluno");
            System.out.println("4 - Excluir pessoa/aluno");
            System.out.println("5 - Encerrar aplicação");
            System.out.println("");
            System.out.println("Selecione uma opção:");

            opcao = obj.readLine();

            switch (opcao) {
                case "1":

                    ;
                case "2":

                    ;
                case "3":

                    ;
                case "4":

                    ;
                case "5":

                    ;
                default:
                    System.out.println("");
                    System.out.println("Opção inválida");
                    System.out.println("");
            }

        } while (!(opcao == "1") || !(opcao == "2") || !(opcao == "3") || !(opcao == "4") || !(opcao == "5"));

    }

    public static void main(String[] args) throws IOException {

       Menuinicial();

    }
}
