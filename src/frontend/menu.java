package frontend;
import frontend.Leitor;
import backend.Sistema.Sistema;
import java.util.Scanner;

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

        while (on) {
            System.out.println("Bem-vindo");
            System.out.println("1 - Mostrar todos os utilizadores");
            System.out.println("2 - Sair");

            

            int opcao = Leitor.LeitorIntervalo("Selecione uma opção: ", 0, 2);
            switch(opcao) {
                case 1:
                    sistema.listarUtilizadores();
                    break;
                case 2:
                    System.out.println("A sair...");
                    on = false;
                    break;
            }
        }   
    }
}