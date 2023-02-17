import java.util.Scanner;
/*
 * desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro
 * entre 1 e 10.
 * o usuário deve informar de qual número ele deseja ver a tabuada.
 * a saída deve ser conforme o exemplo abaixo:
 * 
 tabuada de 5:
 5x1=5
 ...
 */
public class ex_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println ("Tabuada de: " + tabuada);

        for(int i = 1; i <= 10; i++) {
            //no i++ pode ser colocado também <i = i + 1>
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
