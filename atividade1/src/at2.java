import java.util.Locale;
import java.util.Scanner;

public class at2 {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float pi = 314159;
        float a, b, c, areatriangulo;

        System.out.println("Digite o valor para A(base) ");
        a = sc.nextFloat();
        System.out.println("Digite o valor para B(base) ");
        b = sc.nextFloat();
        System.out.println("Digite o valor para C(altura) ");
        c = sc.nextFloat();

        areatriangulo = (a * c) / 2;

        System.out.printf("\nA area do triangulo é de %.2f", areatriangulo);
        System.out.println("\n");

        float areaCirculo;

        areaCirculo = pi * (c*c);

        System.out.printf("A area do circulo é %f", areaCirculo);

        System.out.println("\n");
        
        float areatrapezio;

        areatrapezio = ((a + b) * c) / 2;

        System.out.printf("\nValor do trapedio é de %.2f", areatrapezio);
        
        //lado * lado
        System.out.println("\n");

        float areaQuadrado;

        areaQuadrado = b * b;

        System.out.printf("Area do quadrado %f", areaQuadrado);

        System.out.println("\n");

        float areaRetangulo;

        areaRetangulo = a * b;

        System.out.printf("Area do retangulo é %.2f", areaRetangulo);
    }
}
