package orientacaoobj;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroPessoa {
    public static void main(String[] args) throws ParseException {
        Pessoa caio = new Pessoa();
        caio.setNome("Caio");
        System.out.println(caio);
        caio.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("15/11/2004"));
        caio.setSexo("Masculino");

        caio.mudarNome("Caio Silva");
        System.out.println(caio);
    }
}
