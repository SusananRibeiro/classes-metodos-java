package classes;
public class AreaCirc {
    double raio;
    static final double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area() {
        return PI * raio * raio;   // Ou pi * (Math.pow(raio, 2)
    }

    static double area(double raio) {
        return PI * (Math.pow(raio, 2)); // Ou PI * raio * raio
    }
}
