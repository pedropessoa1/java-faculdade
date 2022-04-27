import java.util.Scanner;
import classes.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Retangulo a1 = new Retangulo();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
                a1.altura = sc.nextDouble();
        System.out.println("Digite a largura: ");
                a1.largura = sc.nextDouble();
        
        System.out.printf("Valor da Area é :  %.2f" , a1.area());
        System.out.printf("\nValor do perimetro é :  %.2f" , a1.perimetro());
        System.out.printf("\nValor do diagonal é :  %.2f" , a1.diagonal());


             


        
    }
}
