package classes.desafio;
public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nome, double peso) {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    double comer(Comida c) {
        return this.pesoPessoa + c.pesoComida;
    }
}
