package classes.equalshashcode;
public class Usuario {
    String nome;
    String email;

    // Implementar o Equals
    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto; // o cast (Usuario) é para converter o "Object" para o tipo "Usuario"
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }
        return false;
    }

    // HASHCODE -- Falta implementar
    public int hashCode() {
        return 0;
    }
}
