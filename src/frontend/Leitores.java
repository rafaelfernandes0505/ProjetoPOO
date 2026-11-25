package frontend;

import java.util.Scanner;
//OLA AMIGO RAFA, SE ESTIVERES A VER ISTO INFORMO TE QUE SIM USEI O GEMINI PARA ME AJUDAR MAS TUDO O QUE ESTA AQUI FUI EU QUE ESCREVI
//ADMITO QUE DESCONHECIA ALGUMAS DAS COISAS QUE AQUI ESTÃO, MAS APRENDI DIREITINHO
//SE ACHARES QUE ALGUMA COISA ESTÁ MAL OU DESNECESSÁRIA DIZ ME


// método para ler valores e valida-los
public class Leitor {

    private static final Scanner scanner = new Scanner(System.in);

    //leitor de inteiros
    public static int LeitorInt(String texto) {
        while(true) {
            System.out.print(texto); //texto é introduzido posteriormente no main
                String textoIntroduzido = scanner.nextLine().trim(); //o trim corta os espaços em branco pra nao bugar

            try {
                return Intenger.parseInt(textoIntroduzido); //converte o texto introduzido em inteiros
            } catch (NumberFormatException e) { //se der erro, isto "apanha" o erro, guarda em "e" e imprime esta frase
                System.out.print("ERRO: Deve ser introduzido um número inteiro válido.");
            }
        }
    }
}
    //leitor de strings
    public static String LeitorString(String texto) {
        while(true) {
            System.out.print(texto); //texto é introduzido posteriormente no main
                String textoIntroduzido = scanner.nextLine().trim(); //o trim corta os espaços em branco pra nao bugar
            if (!textoIntroduzido.isEmpty()) { //se nao for introduzido texto da erro
                return textoIntroduzido;
            } else {
                System.out.print("ERRO: Deve ser introduzido algum texto.");
            }
        }
    }

    public static int LeitorIntervalo(String texto, int min, int max) { //serve pra nao ter que tar sempre a verificar se foi escolhida uma opcao valida no switch
        while (true) {
            int numero = LeitorInt(texto); //usa o metodo anterior para verificar se foi introduzido um inteiro

            if (numero >= min && <= max) {
                return numero;
            } else {
                System.out.print("ERRO: A opção escolhida deve estar entre " + min + " e " + max + ".");
            }
        }
    }
