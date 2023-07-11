import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);

        int funcao;
        do {
        System.out.println("Informe seu número: ");
        int num = leia.nextInt();

        String mensagem = num%2==0 ? "Número informado é par" : "Número informado é impar";
        System.out.println(mensagem);

        System.out.println("Deseja reiniciar? 1 = sim | -1 = não");
        funcao = leia.nextInt();
        } while (funcao==1);
    }
}
