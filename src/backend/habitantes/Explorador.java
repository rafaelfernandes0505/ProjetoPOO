package backend.habitantes;

import backend.colonias.Colonia;

public class Explorador extends Habitante {

    public Explorador(String nome, String email, String password,
                      String profissao, Colonia colonia) {
        super(nome, email, password, profissao, colonia);
    }
}