import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int codigo, qtd, valor, resul1, resul2, resultotal;
        


        System.out.println("Digite o codigo do produdo: ");
                codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
                qtd = sc.nextInt();
        System.out.println("Digite valor: ");
                valor = sc.nextInt();
        
        resul1 = (valor * qtd);

        System.out.println("Digite o codigo do produdo: ");
                codigo = sc.nextInt();
        System.out.println("Digite a quantidade: ");
                qtd = sc.nextInt();
        System.out.println("Digite valor: ");
                valor = sc.nextInt();

        resul2 = (valor * qtd);
        resultotal = (resul1 + resul2);

        System.out.printf("Valor total é : %d", resultotal);



    }
}
