package backend.habitantes;
import backend.colonias.Colonia;

public class Engenheiro extends Habitante{
    String especialidadeTecnica;

    public Engenheiro(String nome, String email, String password,
                     String profissao, Colonia colonia, String especialidadeTecnica) {
        super(nome, email, password, profissao, colonia);
        this.especialidadeTecnica = especialidadeTecnica;
    }

    public String getespecialidadeTenica(){
        return this.especialidadeTecnica;
    }
}