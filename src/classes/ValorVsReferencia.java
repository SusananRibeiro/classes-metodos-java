package classes;
public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + "  " + b); // 3.0  1.0

        Data d1 = new Data(15, 04, 2012);
        Data d2 = d1; // atribuição por referência (objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2023;

        System.out.println("d1: " + d1.obterDataFormatada()); // d1: 31/12/2023
        System.out.println("d2: " + d2.obterDataFormatada()); // d2: 31/12/2023

        voltarDataParaValorPadrao(d1); // chamando o método que contém o objeto como parâmetro
        System.out.println("d1: " + d1.obterDataFormatada()); // d1: 1/1/1970
        System.out.println("d2: " + d2.obterDataFormatada()); // d2: 1/1/1970

        int c = 5;
        alterarPrimitivo(c); // chamado o método que contém o tipo primitivo como parâmetro
        System.out.println(c); // 5

    }
    // Método que contém o objeto como parâmetro
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    // Método que contém tipo primitivo como parâmetro
    static void alterarPrimitivo(int a) {
        a++;
    }
}
