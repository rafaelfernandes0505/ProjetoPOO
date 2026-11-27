package frontend;
import frontend.Leitor;
import backend.Sistema.Sistema;
import java.util.Scanner;
import backend.Utilizadores.Utilizador;

public class menu {
    
    //Variaveis 
    Sistema sistema;
    
    //Construtor 
    public menu(Sistema sistema){
        this.sistema = sistema;
    }



    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;

        Utilizador utilizadorAtual = null;


        while (on) {
            System.out.println("Bem-vindo");
            System.out.println("1 - Mostrar todos os utilizadores");
            System.out.println("2 - Sair");

            

            int opcao = Leitor.LeitorIntervalo("Selecione uma opção: ", 0, 2);
            switch(opcao) {
                case 1:
                    fazerlogin();
                    break;
                case 2:
                    System.out.println("A sair...");
                    on = false;
                    break;
            }
        }   
    }

    private void fazerlogin(){
        int MAX_TENTATIVAS = 3;

        for(int t = 0; t <= MAX_TENTATIVAS; t++){
            String email = Leitor.LeitorString("Email:");
            String password = Leitor.LeitorString("Password");

            Utilizador u = sistema.autenticar(email,password);
            if(u!= null){
                System.out.println("Bem vindo, " + u.getNome() + "!");
                //encaminhar(u) (isto é o novo metodo para encaminhar o utilizador encontrado para o seu respetivo menu (dependendo da classe obviamente)).
            }
            System.out.println("Credenciais inválidas!");
        }
        System.out.println("Numero de tentativas excedidas.");
    }

    
}