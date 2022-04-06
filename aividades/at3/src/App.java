import java.util.Scanner;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        System.out.println("Digite o codigo do produdo: ");
                p1.codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
                p1.qtd = sc.nextInt();
        System.out.println("Digite valor: ");
                p1.valor = sc.nextInt();

        System.out.println("Digite o codigo do produdo: ");
                p1.codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
                p1.qtd = sc.nextInt();
        System.out.println("Digite valor: ");
                p1.valor = sc.nextInt();

        System.out.printf("Valor total %d" , p1.resultotal);
        
    }
}
