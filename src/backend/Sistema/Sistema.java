package backend.Sistema;

import java.util.ArrayList;

import backend.colonias.Colonia;
import backend.gestores.Gestor;
import backend.missoes.Missao;
import backend.Utilizadores.Utilizador;

public class Sistema {

    private ArrayList<Utilizador> utilizadores = new ArrayList<>();
    private ArrayList<Colonia> colonias = new ArrayList<>();
    private ArrayList<Missao> missoes = new ArrayList<>();

    // ---------- Utilizadores ----------

    public Utilizador autenticar(String email, String password) {
        for (Utilizador u : utilizadores) {
            if (u.getEmail().equalsIgnoreCase(email) && u.verificarPassword(password)) {
                return u;
            }
        }
        return null; // login falhou
    }

    public Utilizador procurarUtilizadorPorEmail(String email) {
        for (Utilizador u : utilizadores) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }

    public void listarUtilizadores() {
    if (utilizadores.isEmpty()) {
        System.out.println("Não existem utilizadores registados.");
        return;
    }

    for (int i = 0; i < utilizadores.size(); i++) {
        System.out.println((i + 1) + ". " + utilizadores.get(i));
    }
}

    // devolve false se o email já existir (evita duplicados)
    public boolean adicionarUtilizador(Utilizador u) {
        if (procurarUtilizadorPorEmail(u.getEmail()) != null) {
            return false;
        }
        utilizadores.add(u);
        return true;
    }

    public ArrayList<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    // ---------- Colónias ----------

    public boolean adicionarColonia(Colonia c) {
        for (Colonia existente : colonias) {
            if (existente.getNome().equalsIgnoreCase(c.getNome())) {
                return false;
            }
        }
        colonias.add(c);
        return true;
    }

    public Colonia procurarColoniaPorId(int id) {
        for (Colonia c : colonias) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Colonia> getColonias() {
        return colonias;
    }

    // ---------- Missões ----------

    public void adicionarMissao(Missao m) {
        missoes.add(m);
        Gestor g = m.getGestor();
        g.adicionarMissao(m);
    }

    public Missao procurarMissaoPorId(int id) {
        for (Missao m : missoes) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Missao> getMissoes() {
        return missoes;
    }
}