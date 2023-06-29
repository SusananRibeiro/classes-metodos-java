package classes.desafio;
public class JantarApp {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Camila", 24.0);
        Comida c1 = new Comida("Feijao", 0.223);
        Comida c2 = new Comida("Batata frita", 0.300);

        System.out.println("Nome: " + p.nomePessoa + ", seu peso antes de comer: " + p.pesoPessoa + "Kg");
        System.out.println("Comeu: " + c1.nomeComida + " que pesa: " + c1.pesoComida +
                "g, " + p.nomePessoa + " passou a pesar: " + p.comer(c1) + " depois de comer");
        System.out.println("Comeu: " + c2.nomeComida + " que pesa: " + c2.pesoComida +
                "g, " + p.nomePessoa + " passou a pesar: " + p.comer(c2) + " depois de comer");
    }
}
