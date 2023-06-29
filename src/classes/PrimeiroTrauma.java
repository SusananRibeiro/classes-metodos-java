package classes;
public class PrimeiroTrauma {
    int a = 3; // atributo de instância ou membro de instância
    static int b = 4; // atributo estático ou membro estático

    public static void main(String[] args) {

        PrimeiroTrauma p = new PrimeiroTrauma(); // para poder acessar o atributo de instância "a"

        System.out.println(p.a);
        System.out.println(b);

    }
}
