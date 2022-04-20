import java.util.Scanner;
//import classes.Retangulo;
import classes.Calculo;

public class App {
    public static void main(String[] args) throws Exception {

        calculomecc c1 = new calculomecc();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
            c1.altura = sc.nextInt();
        System.out.println("Digite seu peso: ");
            c1.peso = sc.nextInt();

        System.out.println("Seu IMC é : %.2f", c1.calculomc());


             


        
    }
}
