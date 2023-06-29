package classes.equalshashcode;
//import java.util.Date;
public class EqualsSemHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@mail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@mail.com";

        System.out.println(u1 == u2); // false --> não é o mesmo endereço de memória
        System.out.println(u1.equals(u2)); // true --> depois de implementar o equals na classe Usuario
        System.out.println(u2.equals(u1)); // true --> depois de implementar o equals na classe Usuario
        //System.out.println(u2.equals(new Date())); // false
    }

}