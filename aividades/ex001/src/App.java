import java.util.Scanner;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();
        

        System.out.println("Digite o codigo do produdo: ");
                p1.codigo = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
                p1.qtd = sc.nextDouble();
        System.out.println("Digite valor: ");
                p1.valor = sc.nextDouble();

        System.out.println("Digite o codigo do produdo: ");
                p1.codigo = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
                p1.qtd = sc.nextDouble();
        System.out.println("Digite valor: ");
                p1.valor = sc.nextDouble();

        System.out.printf("Valor total %.2f" , p1.resultotal);
        
    }
}
