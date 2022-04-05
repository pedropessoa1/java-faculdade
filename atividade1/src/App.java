import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        float avistaComDesc;
        float parcelado;
        float valorDaBolsa;
        float valorComJuros;
        float porcentagem10;
        float porcentagem5;
        int opcao;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do produdo: ");
            valorDaBolsa = sc.nextFloat();
        
        System.out.printf("Valor do produdo é %.2f ",valorDaBolsa);
        System.out.println("Qual seria a forma de pagamento: ");
        
        System.out.println("Caso Avista 1 ");
        System.out.println("Caso Parcelado 2 ");
        System.out.println("Caso Dividido 3 ");
        System.out.println("Fechar o menu 0 ");

        opcao = sc.nextInt();

        if(opcao == 0 ){
            System.out.println("\nAté Logo!");
            sc.close();			
        }

        switch(opcao){
            case 1:
                System.out.println("VC escolheu Avista ");

                porcentagem10 = valorDaBolsa*10/100;
               avistaComDesc = valorDaBolsa - porcentagem10;

               System.out.println(avistaComDesc);
          break; 

            case 2:
            System.out.println("VC escolheu Parcelado "); 

            parcelado = valorDaBolsa / 2;

            System.out.println(parcelado);
            break;

            case 3:
            System.out.println("VC escolheu dividio em 3 com juros "); 

            porcentagem5 = valorDaBolsa*5/100;
            valorComJuros = valorDaBolsa + porcentagem5;


            System.out.println(valorComJuros);
            break;
        }
        

        
        
        
    }
}
