import java.util.Scanner;
/*
 * faça um programa que calcule o fatorial de um número inteiro
 * fornecido pelo usuário.
 * 
 * ex.: 5!=120 (5 x 4x 3 x2 x 1)
 */
public class ex_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        
        System.out.print(fatorial + "! = ");
        for ( int i = fatorial ; i >= 1 ; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
