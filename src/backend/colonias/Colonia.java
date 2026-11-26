package backend.colonias;

import java.util.ArrayList;

import backend.habitantes.Habitante;

public class Colonia {

    private static int proximoId = 1;

    private final int id;
    private String nome;
    private String planeta;
    private int missoesConcluidas;
    private ArrayList<Habitante> habitantes;

    public Colonia(String nome, String planeta) {
        this.id = proximoId++;
        this.nome = nome;
        this.planeta = planeta;
        this.missoesConcluidas = 0;
        this.habitantes = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getPlaneta() { return planeta; }
    public int getMissoesConcluidas() { return missoesConcluidas; }
    public ArrayList<Habitante> getHabitantes() { return habitantes; }

    public void incrementarMissoesConcluidas() {
        missoesConcluidas++;
    }

    public boolean adicionarHabitante(Habitante h) {
        if (habitantes.contains(h)) {
            return false;
        }
        habitantes.add(h);
        return true;
    }

    public boolean removerHabitante(int id) {
        for (int i = 0; i < habitantes.size(); i++) {
            if (habitantes.get(i).getId() == id) {
                habitantes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Habitante procurarHabitantePorId(int id) {
        for (Habitante h : habitantes) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }
}