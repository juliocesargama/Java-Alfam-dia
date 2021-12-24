import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.LocalDateTime.now;

public class Editar {

    Listar lista = new Listar();
    MenuInicial menu = new MenuInicial();
    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    int opcao;

        public void Edicao () throws IOException, ParseException {

        if(!Main.cadastro.isEmpty()){
            do {

                System.out.println("Alterar Aluno/Pessoa");
                lista.ListagemResumida();
                System.out.println("Informe o número da Pessoa/Aluno a alterar: ");
                opcao = Integer.parseInt(obj.readLine());

            } while (opcao < 0 || opcao > Main.cadastro.size());

            if (Main.cadastro.get(opcao) instanceof Aluno) {
                Aluno aluno = new Aluno();

                System.out.println("Digite o nome do Aluno: ");
                aluno.setNome(obj.readLine());

                System.out.println("Digite o telefone no formato (xx)xxxxx-xxxx: ");
                aluno.setTelefone(obj.readLine());

                System.out.println("Digite a data de nascimento no formato dd/mm/aaaa: ");
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date date = formatter.parse(obj.readLine());

                aluno.setDataNasc(date);

                System.out.println("Digite a nota final do aluno: ");
                aluno.setNotaFinal(Double.parseDouble(obj.readLine()));

                aluno.setDataUltAlt(now());
                aluno.setDataCadastro(Main.cadastro.get(opcao).getDataCadastro());

                Main.cadastro.set(opcao, aluno);

            } else {

                Pessoa pessoa = new Pessoa();

                System.out.println("Digite o nome: ");
                pessoa.setNome(obj.readLine());

                System.out.println("Digite o telefone no formato (xx)xxxxx-xxxx: ");
                pessoa.setTelefone(obj.readLine());

                System.out.println("Digite a data de nascimento no formato dd/mm/aaaa: ");
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date date = formatter.parse(obj.readLine());

                pessoa.setDataNasc(date);

                pessoa.setDataUltAlt(now());
                pessoa.setDataCadastro(Main.cadastro.get(opcao).getDataCadastro());

                Main.cadastro.set(opcao, pessoa);

            }

            System.out.println("");
            System.out.println("Cadastro alterado com sucesso!");
            System.out.println("Pressione ENTER para voltar ao menu inicial.");
            new java.util.Scanner(System.in).nextLine();

            menu.Menuinicial();

        }
    }
}
