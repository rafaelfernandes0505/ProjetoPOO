package backend.habitantes;

import backend.colonias.Colonia;
import backend.Utilizadores.Utilizador;

public abstract class Habitante extends Utilizador {

    private String profissao;
    private Colonia colonia;

    public Habitante(String nome, String email, String password,
                     String profissao, Colonia colonia) {
        super(nome, email, password);
        this.profissao = profissao;
        this.colonia = colonia;
    }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    public Colonia getColonia() { return colonia; }
}