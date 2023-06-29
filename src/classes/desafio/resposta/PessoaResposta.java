package classes.desafio.resposta;

import classes.desafio.resposta.ComidaResposta;

public class PessoaResposta {
    String nome;
    double peso;

    PessoaResposta(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(ComidaResposta comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Ola, eu sou o " + this.nome + " eu tenho " + this.peso + "Kgs.";
    }
}
