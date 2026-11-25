package backend.colonias;
import backend.habitantes.Habitante;
import java.util.ArrayList;

public class Colonia{
    
    private int id;
    private String nome;
    private String planeta;
    private int missoesConcluidas = 0;


    private List<Habitante> habitantes;

    public Colonia(int id, String nome, String planeta){
        this.id = id;
        this.nome = nome;
        this.planeta = planeta;
        this.missoesConcluidas = 0;
        this.habitantes = new ArrayList<>();
    }
    
    public List<Habitante> getHabitantes(){
        return habitantes;
    }
    
    public void adicionarHabitante(Habitante h){
        habitantes.add(h);
    }

    

    public boolean removerHabitante(int id){
        for( int i = 0; i < habitantes.size(); i++){
            if(habitantes.get(i).getId() == id){
                habitantes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Habitante procurarHabitanteporId(int id){
        for ( Habitante h : habitantes){
            if(h.getId() == id)
                            return h;
            }
        }
        return null;
    }


}