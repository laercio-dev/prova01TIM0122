import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        float bandeira1 = 1.8f;
        float bandeira2 = 2.3f;

        System.out.println("Qual a distância percorrida? ");
        float distancia = leia.nextFloat();
        System.out.println("Qual a bandeira é a corrida? 1 ou 2");
        int funcao = leia.nextInt();

        if (funcao==1){
            System.out.println("Valor da corrida é "+distancia*bandeira1);
        } else if (funcao==2){
            System.out.println("Valor da corrida é "+distancia*bandeira2);
        } else {
            System.out.println("Erro no programa!");
        }
    }
}
