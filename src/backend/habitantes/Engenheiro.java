package backend.habitantes;
import backend.colonias.Colonia;

public class Engenheiro extends Habitante{
    String especialidadeTecnica;

    public Engenheiro(int id, String nome, String email, String especialidadeTecnica,Colonia colonia){
        super(id, nome, email,colonia);
        this.especialidadeTecnica = especialidadeTecnica;
    }

    public String getespecialidadeTenica(){
        return this.especialidadeTecnica;
    }
}