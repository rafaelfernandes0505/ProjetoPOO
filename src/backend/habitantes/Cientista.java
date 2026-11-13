package backend.habitantes;
import backend.colonias.Colonia;


public class Cientista extends Habitante{
    private String areaCientifica;

    public Cientista(int id, String nome, String email, String areaCientifica,Colonia colonia) {
        super(id, nome, email,colonia);
        this.areaCientifica = areaCientifica;
    }

}