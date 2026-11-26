package backend.missoes;

import java.util.ArrayList;

import backend.gestores.Gestor;
import backend.habitantes.Habitante;

public class Missao {

    private static int proximoId = 1;

    private final int id;
    private String designacao;
    private String objetivo;
    private ArrayList<Habitante> equipa;
    private Gestor gestor;
    private EstadoMissao estado;

    public Missao(String designacao, String objetivo, Gestor gestor) {
        this.id = proximoId++;
        this.designacao = designacao;
        this.objetivo = objetivo;
        this.gestor = gestor;
        this.equipa = new ArrayList<>();
        this.estado = EstadoMissao.PLANEADA;
    }

    public int getId() { return id; }

    public String getDesignacao() { return designacao; }
    public void setDesignacao(String designacao) { this.designacao = designacao; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public Gestor getGestor() { return gestor; }

    public ArrayList<Habitante> getEquipa() { return equipa; }

    public EstadoMissao getEstado() { return estado; }
    public void setEstado(EstadoMissao estado) { this.estado = estado; }

    public boolean adicionarParticipante(Habitante h) {
        if (equipa.contains(h)) {
            return false;
        }
        equipa.add(h);
        return true;
    }

    public boolean removerParticipante(Habitante h) {
        return equipa.remove(h);
    }
}