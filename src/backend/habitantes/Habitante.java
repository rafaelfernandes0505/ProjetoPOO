package backend.habitantes;
import backend.colonias.Colonia;



public abstract class Habitante{
    private int id;
    private String nome;
    private String email;
    private static int proximoId = 1;
    private Colonia colonia;

    public Habitante(int id, String nome, String email, Colonia colonia){
        this.id = proximoId++;
        this.nome = nome;
        this.email = email;
        this.colonia = colonia;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public void setEmail(String email) {
    this.email = email;
    }

    
}