package classes;
public class DataApp {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(12, 01, 1986);

        data2.dia = 12;
        data2.mes = 01;
        data2.ano = 1986;

        System.out.println(data1.obterDataFormatada());
        System.out.printf("Data de nascimento: %d/ %d/ %d.", data2.dia, data2.mes, data2.ano);

    }
}
