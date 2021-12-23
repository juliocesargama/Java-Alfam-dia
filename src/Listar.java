import java.io.IOException;

public class Listar {

    MenuInicial menu = new MenuInicial();
    //Função Listar Pessoa/Aluno
    public void ListarCadastros() throws IOException {
        System.out.println("");
        System.out.println("Pessoa(s)/Aluno(s) cadastrado(s): ");
        System.out.println("");

        if(Main.cadastro.isEmpty()){
            System.out.println("Não há Aluno ou Pessoa cadastrada.");
            System.out.println("");

            System.out.println("Pressione qualquer tecla para voltar ao menu inicial.");
            new java.util.Scanner(System.in).nextLine();

            menu.Menuinicial();
        }else{
            for (Pessoa item: Main.cadastro) {
                System.out.println("Nome: " + item.getNome());
                System.out.println("Telefone: " + item.getTelefone());
                System.out.println("Data de Nascimento: " + item.getDataNasc());

                if(item instanceof Aluno) {
                    Aluno aluno = (Aluno) item;
                    System.out.println("Nota Final: " + aluno.getNotaFinal());
                }
                System.out.println("Data da Atualização: " + item.getDataUltAlt());
                System.out.println("Data de Cadastro: " + item.getDataCadastro());
                System.out.println("");
            }
            System.out.println("Total: " + Main.cadastro.size());
            System.out.println("");

            System.out.println("Pressione qualquer tecla para voltar ao menu inicial.");
            new java.util.Scanner(System.in).nextLine();

            menu.Menuinicial();
        }



    }

}
