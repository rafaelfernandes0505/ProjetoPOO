package frontend;

import backend.gestores.Administrador;
import backend.Sistema.Sistema;

public class Main {
    public static void main(String[] args) {

        // 1. Cria o Sistema: guarda todos os dados do programa
        Sistema sistema = new Sistema();

        // 3. Administrador por defeito, para o primeiro login
        sistema.adicionarUtilizador(
            new Administrador("Admin1", "Admin123@gmail.com", "admin123")
        );

        // 4. Cria o Menu e entrega-lhe o Sistema
        menu menu = new menu(sistema);

        // 5. Arranca o programa
        menu.iniciarMenu();
    }
}