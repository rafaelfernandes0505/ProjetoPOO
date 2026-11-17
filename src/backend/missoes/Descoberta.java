package backend.missoes;
import backend.habitantes.Habitante;


public class Descoberta{
    int id;
    Missao missao;
    Habitante responsavel;
    String tipo;
    int data;
    String descrição;

     public Descoberta(int id, Missao missao, Habitante responsavel,
                      String tipo, int data, String descrição) {
        this.id = id;
        this.missao = missao;
        this.responsavel = responsavel;
        this.tipo = tipo;
        this.data = data;
        this.descrição = descrição;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Missao getMissao() {
        return missao;
    }

    public Habitante getResponsavel() {
        return responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public int getData() {
        return data;
    }

    public String getDescrição() {
        return descrição;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

    public void setResponsavel(Habitante responsavel) {
        this.responsavel = responsavel;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    
}