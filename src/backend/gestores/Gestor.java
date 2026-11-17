package backend.gestores;
import backend.habitantes.Habitante;
import backend.colonias.Colonia;


public class Gestor extends Habitante{
    public Gestor(int id, String nome, String email,Colonia colonia){
        super(id,nome,email,colonia);
    }
}