
package backend.missoes;

import java.util.ArrayList;

import backend.habitantes.Habitante;

public class Missao {
    private int id;
    private String designação;
    private String objetivo;
    private ArrayList<Habitante> equipa;
    private String Estado;

    // Construtor
    public Missao(int id, String designação, String objetivo,
                  ArrayList<Habitante> equipa, String Estado) {
        this.id = id;
        this.designação = designação;
        this.objetivo = objetivo;
        this.equipa = equipa;
        this.Estado = Estado;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDesignação() {
        return designação;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public ArrayList<Habitante> getEquipa() {
        return equipa;
    }

    public String getEstado() {
        return Estado;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDesignação(String designação) {
        this.designação = designação;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setEquipa(ArrayList<Habitante> equipa) {
        this.equipa = equipa;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
