package frontend;

import java.util.Scanner;

// método para ler valores e valida-los
public class Leitor {

    private static final Scanner scanner = new Scanner(System.in);

    //leitor de inteiros
    public static int LeitorInt(String texto) {
        while (true) {
            System.out.print(texto); //texto é introduzido posteriormente no main
            String textoIntroduzido = scanner.nextLine().trim(); //o trim corta os espaços em branco pra nao bugar

            try {
                return Integer.parseInt(textoIntroduzido); //converte o texto introduzido em inteiros
            } catch (NumberFormatException e) { //se der erro, isto "apanha" o erro, guarda em "e" e imprime esta frase
                System.out.println("ERRO: Deve ser introduzido um número inteiro válido.");
            }
        }
    }

    //leitor de strings
    public static String LeitorString(String texto) {
        while (true) {
            System.out.print(texto); //texto é introduzido posteriormente no main
            String textoIntroduzido = scanner.nextLine().trim(); //o trim corta os espaços em branco pra nao bugar

            if (!textoIntroduzido.isEmpty()) { //se nao for introduzido texto da erro
                return textoIntroduzido;
            } else {
                System.out.println("ERRO: Deve ser introduzido algum texto.");
            }
        }
    }

    public static int LeitorIntervalo(String texto, int min, int max) { //serve pra nao ter que tar sempre a verificar se foi escolhida uma opcao valida no switch
        while (true) {
            int numero = LeitorInt(texto); //usa o metodo anterior para verificar se foi introduzido um inteiro

            if (numero >= min && numero <= max) {
                return numero;
            } else {
                System.out.println("ERRO: A opção escolhida deve estar entre " + min + " e " + max + ".");
            }
        }
    }
}