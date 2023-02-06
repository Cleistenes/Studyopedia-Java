import java.util.Scanner;

public class estudoscanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1=0,n2=0,n3=0,n4=0,media=0;
        int falta=0;
        int maxFaltas = 12;
        String nome="", res="";

        System.out.print("Digite o nome do aluno: ");
        nome=scan.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.print("Digite a última nota: ");
        n4=scan.nextInt();
        media=(n1+n2+n3+n4)/4;
        System.out.print("Digite o total de faltas: ");
        falta=scan.nextInt();
        
        if (media >= 65 && falta < maxFaltas) {
			res="aprovado";;
		} else if (media >= 40 && falta < maxFaltas){
            res="para recuperacao";
        } else if (falta > maxFaltas){
            res="reprovado por falta";
        }else {
            res="reprovado";
        }
        System.out.printf("Aluno %s foi %s, com nota %d e total de %d faltas",nome,res,media,falta);
    }
}       