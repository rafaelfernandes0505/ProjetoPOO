package backend.gestores;

import java.util.ArrayList;

import backend.missoes.Missao;
import backend.Utilizadores.Utilizador;

public class Gestor extends Utilizador {

    private ArrayList<Missao> missoes;

    public Gestor(String nome, String email, String password) {
        super(nome, email, password);
        this.missoes = new ArrayList<>();
    }

    public void adicionarMissao(Missao m) {
        missoes.add(m);
    }

    public int getNumeroMissoes() {
        return missoes.size();
    }

    public ArrayList<Missao> getMissoes() {
        return missoes;
    }
}