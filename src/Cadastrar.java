import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.LocalDateTime.now;

public class Cadastrar {
    //Função Cadastrar Pessoa/Aluno
    public void Cadastro() throws IOException, ParseException {

        MenuInicial menu = new MenuInicial();

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String opcao = "";

        System.out.println("É um aluno (S/N)?");
        opcao = obj.readLine().toUpperCase();

        if(opcao.contains("S")){

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

            aluno.setDataCadastro(now());
            aluno.setDataUltAlt(now());

            Main.cadastro.add(aluno);

        }else {

            Pessoa pessoa = new Pessoa();

            System.out.println("Digite o nome: ");
            pessoa.setNome(obj.readLine());

            System.out.println("Digite o telefone no formato (xx)xxxxx-xxxx: ");
            pessoa.setTelefone(obj.readLine());

            System.out.println("Digite a data de nascimento no formato dd/mm/aaaa: ");
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(obj.readLine());

            pessoa.setDataNasc(date);

            pessoa.setDataCadastro(now());
            pessoa.setDataUltAlt(now());

            Main.cadastro.add(pessoa);

        }

        System.out.println("");
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Pressione ENTER para voltar ao menu inicial.");
        new java.util.Scanner(System.in).nextLine();

        menu.Menuinicial();
    }

}
