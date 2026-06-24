// Estamos criando uma classe abstrata chamada Pessoa, que implementa a interface Calcular.
public abstract class Pessoa implements Calcular {

    // Atrbutos em "private" para garantir o encapsulamento
    // para proteger os dados e permitir o acesso controlado a eles.
    private String nome;
    private double peso;
    private double altura;

    // construtor para inicializar os atributos da classe Pessoa
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

    }



    // metodo para calcular imc

    @Override
    public double calcularIMC() {
        return peso / (altura * altura);

    }

    // Método para mostrar dados

    public abstract String classificarIMC();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);

    }

}