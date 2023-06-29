package classes;
public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }
    Data(int dataDia, int dataMes, int dataAno) {
        dia = dataDia;
        mes = dataMes;
        ano = dataAno;
    }

    String obterDataFormatada () {
        return dia + "/" + mes + "/" + ano;
    }
}

