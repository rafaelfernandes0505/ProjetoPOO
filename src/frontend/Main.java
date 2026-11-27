package frontend;

import backend.gestores.Administrador;
import backend.Sistema.Sistema;

public class Main {
    public static void main(String[] args) {

        // 1. Cria o Sistema: guarda todos os dados do programa
        Sistema sistema = new Sistema();

        // 3. Administrador por defeito, para o primeiro login
        Administrador administrador = new Administrador("Admin1", "Admin123@gmail.com", "admin123");
        sistema.adicionarUtilizador(administrador);

        Administrador administrador2 = new Administrador("Admin2", "Admin2123@gmail.com", "admin123");
        sistema.adicionarUtilizador(administrador2);



        // 4. Cria o Menu e entrega-lhe o Sistema
        menu menu = new menu(sistema);

        // 5. Arranca o programa
        menu.iniciarMenu();
    }
}