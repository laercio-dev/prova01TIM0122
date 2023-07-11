import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = leia.nextLine();

        System.out.println("Quantidade desse produto: ");
        float quantidade = leia.nextInt();

        System.out.println("Digite o valor do produto: ");
        float valor = leia.nextFloat();

        float total = quantidade*valor;

        System.out.printf("\n O Podruto: %s \n Quantidade: %f \n Valor: %f \n Total do Valor: %.2f",produto,quantidade,valor,total);

        System.out.println("Infome a porcentagem de desconto: ");
        String percentual = leia.next();

        String trocar = "0."+percentual;
        Float percentualTrocado = Float.parseFloat(trocar);

        System.out.println("Valor do desconto: "+total*percentualTrocado);
        System.out.println("Valor total da compra: "+(total-(total*percentualTrocado)));
    }
}
