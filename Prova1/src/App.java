import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner yasmim = new Scanner(System.in);
        float [] nota = new float[4];

        for (int i = 0; i<10; i++){
            System.out.printf("\n Digite a nota da %s º Pessoa!",i);
            for (int j = 0; j<4; j++){
                System.out.printf("\n Digite a %s nota: ",j);
                nota[j] = yasmim.nextFloat();
            }
            media(nota[0],nota[1],nota[2],nota[3]);
        }
    }
    public static void media (float nota1, float nota2, float nota3, float nota4){
            float media = (nota1+nota2+nota3+nota4)/4;
            System.out.println("Media do aluno: "+media);
            aprovacao(media);
            mediaMaior(media);
    }
    public static void aprovacao (float media) {
            if (media>=7){
                System.out.println(" ALUNO APROVADO");
            } else if (media<7){
                System.out.println(" ALUNO REPROVADO");
            } else {
                System.out.println(" INFORMAÇÕES INVALIDAS");
            }
            return;
    }
    public static void mediaMaior(float media) {
        float maior = 0;
        float menor = 1000;

        maior = media>maior ? media : maior;
        menor = media<menor ? media : menor; 

        System.out.println("Maior media é: "+maior);
        System.out.println("Menor media é: "+menor);
    }
}