package backend.Utilizadores;

public abstract class Utilizador {

    private static int proximoId = 1;

    private final int id;
    private String nome;
    private String email;

    protected Utilizador(String nome, String email) {
        this.id = proximoId++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}