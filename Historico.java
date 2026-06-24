import java.util.ArrayList;

public class Historico {

    private ArrayList<String> registros;

    public Historico() {

        registros = new ArrayList<>();

    }

    public void adicionar(String texto) {

        registros.add(texto);

    }

    public void mostrarHistorico() {

        for (String item : registros) {

            System.out.println(item);

        }

    }

}