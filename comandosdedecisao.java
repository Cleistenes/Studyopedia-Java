public class comandosdedecisao {
    public static void main(String[] args){
        int prova1 = 55;
        int prova2 = 45;
        int prova3 = 30;
        int media = (prova1+prova2+prova3) / 3;
        int resultadofinal = media;
        int faltas = 9;
        int maxFaltas = 12;
        System.out.println("Resultado final: " + resultadofinal + " Quantidade de faltas: " + faltas);
        if (resultadofinal >= 65 && faltas < maxFaltas) {
			System.out.println("Aprovado!");
		} else if (resultadofinal >= 40 && faltas < maxFaltas){
            System.out.println("Recuperacao por média");
        } else if (faltas > maxFaltas){
            System.out.println("Reprovado por falta.");
        }else {
            System.out.println("Reprovado.");
        }
        System.out.println("Fim do program!");
    }
}        
