package classes.desafio.resposta;

public class JantarRespostaApp {
    public static void main(String[] args) {
        ComidaResposta c1 = new ComidaResposta("Arroz", 0.180);
        ComidaResposta c2 = new ComidaResposta("Feijao", 0.300);

        PessoaResposta p = new PessoaResposta("Joao", 99.8);
        System.out.println(p.apresentar()); // Ola, eu sou o Joao eu tenho 99.8Kgs.

        p.comer(c1);
        System.out.println(p.apresentar()); // Ola, eu sou o Joao eu tenho 99.98Kgs.

        p.comer(c2);
        System.out.println(p.apresentar());	// Ola, eu sou o Joao eu tenho 100.28Kgs.
    }
}
