package frontend;
import frontend.Leitores;

public class Menu {
    
    public static void iniciarMenu() {
        boolean on = true;

        while (on) {
            System.out.println("Bem-vindo");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Sair");

        int opcao = Leitores.LeitorIntervalo("Selecione uma opção: ", 0, 1);
        
            switch(opcao) {
                case 1:
                    fazerLogin(); //fazer este método mais tarde rafinha
                case 2:
                    System.out.println("A sair...");
                    on = false;
                    break;
            }
        }   
    }
}