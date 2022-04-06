import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double codigo, qtd, valor, resul1, resul2, resultotal;
        


        System.out.println("Digite o codigo do produdo: ");
                codigo = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
                qtd = sc.nextDouble();
        System.out.println("Digite valor: ");
                valor = sc.nextDouble();
        
        resul1 = (valor * qtd);

        System.out.println("Digite o codigo do produdo: ");
                codigo = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
                qtd = sc.nextDouble();
        System.out.println("Digite valor: ");
                valor = sc.nextDouble();

        resul2 = (valor * qtd);
        resultotal = (resul1 + resul2);

        System.out.printf("Valor total é : %.2f", resultotal);



    }
}
