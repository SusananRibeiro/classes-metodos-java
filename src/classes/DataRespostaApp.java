package classes;

public class DataRespostaApp {
    public static void main(String[] args) {
        DataResposta d1 = new DataResposta();
        System.out.println(d1.obterDataFormatada()); // 0/0/0 --> sem inicializar a
        System.out.println(d1.teste); // false --> sem inicializar
        System.out.println(d1.teste2); //


        d1.ano = 2021; // mudar só o ano
        var d2 = new DataResposta(15, 04, 2012);

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d1.obterDataFormatada()); // 15/4/2012
        System.out.println(d2.obterDataFormatada()); // 12/1/1986

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}
