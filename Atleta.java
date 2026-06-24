public class Atleta extends Pessoa {
    public Atleta(String nome, double peso, double altura) {
        super(nome, peso, altura);

    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc > 20 && imc < 27) {
            return " Condição atlética";
        } else if (imc > 27 && imc < 30) {
            return "Massa muscular elevada";
        } else {
            return "Avaliação necessária";
        }
    }
}