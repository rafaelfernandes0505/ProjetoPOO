package backend.habitantes;

import backend.colonias.Colonia;

public class Cientista extends Habitante {

    private String areaCientifica;

    public Cientista(String nome, String email, String password,
                     String profissao, Colonia colonia, String areaCientifica) {
        super(nome, email, password, profissao, colonia);
        this.areaCientifica = areaCientifica;
    }

    public String getAreaCientifica() { return areaCientifica; }
}