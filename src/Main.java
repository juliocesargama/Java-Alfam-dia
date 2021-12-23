import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.time.LocalDateTime.now;

public class Main {

    static ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();

    public static void main(String[] args) throws IOException {

        MenuInicial menu = new MenuInicial();
        menu.Menuinicial();

    }
}
