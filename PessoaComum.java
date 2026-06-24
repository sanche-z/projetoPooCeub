public class PessoaComum extends Pessoa {
    public PessoaComum(String nome, double peso, double altura) {
        super(nome, peso, altura);

    }

    @Override
    public String classificarIMC() { // ClassificarImcPessoaComum
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";

        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";

        }

    }

}
