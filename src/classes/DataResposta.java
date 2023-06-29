package classes;
public class DataResposta {
    int dia; // variável de instância
    int mes; // variável de instância
    int ano; // variável de instância
    boolean teste; // só para teste
    char teste2; // só para teste

    DataResposta() {
        //dia = 01;
        //mes = 01;
        //ano = 1970;
        //this(1, 1, 1970); // Como método

    }

    DataResposta(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        String formato = "%d/%d/%d"; // variável local
        return String.format(formato, this.dia, this.mes, this.ano); // retorna uma string formatada igual ao ".printf"
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada()); // Outra forma de fazer, mas não funciona em algumas plataformas: web, mobile
    }
}
