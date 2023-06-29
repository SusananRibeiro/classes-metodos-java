package classes;
public class AreaCircApp {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5.6);
        //a1.pi = 1000000;

        System.out.println(a1.area()); // 98.51744000000001
        System.out.println(AreaCirc.area(6)); // 113.09400000000001 --> Método estático, pertencem a classe e não ao objeto
        System.out.println(AreaCirc.PI); // 3.1415
        System.out.println(Math.PI); // 3.141592653589793
    }
}

