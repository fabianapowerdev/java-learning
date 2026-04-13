package fundamentos;

/*public class Usuario {

    String login;
    String senha;

    // Construtor
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}*/

/*
 * classe ✔️
 * objeto ✔️
 * construtor ✔️
 * atributo ✔️
 */

// encapsulada 👇🏻

public class Usuario {

    private final String login;
    private final String senha;

    // Construtor
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Getter do login
    public String getLogin() {
        return login;
    }

    // Método de autenticação (aqui que mora a mágica)
    public boolean autenticar(String login, String senha) {
        return this.login.equalsIgnoreCase(login) && this.senha.equals(senha);
    }
}

