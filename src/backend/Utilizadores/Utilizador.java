package backend.Utilizadores;

public abstract class Utilizador {

    private static int proximoId = 1;

    private final int id;
    private String nome;
    private String email;
    private String password;

    protected Utilizador(String nome, String email, String password) {
        this.id = proximoId++;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { this.password = password; }

    public String toString() {
    return "ID: " + id + " | Nome: " + nome + " | Email: " + email;
    }

    public boolean verificarPassword(String tentativa) {
        return password.equals(tentativa);
    }
}   