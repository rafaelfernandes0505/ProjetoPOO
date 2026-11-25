package frontend;
import frontend.Leitor;

public class menu {
    
    public static void iniciarMenu() {
        boolean on = true;

        while (on) {
            System.out.println("Bem-vindo");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Sair");

        int opcao = Leitor.LeitorIntervalo("Selecione uma opção: ", 0, 1);
        
            switch(opcao) {
                case 1:
                    //fazerLogin(); //fazer este método mais tarde rafinha
                case 2:
                    System.out.println("A sair...");
                    on = false;
                    break;
            }
        }   
    }
}