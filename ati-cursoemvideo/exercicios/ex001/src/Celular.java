public class Celular {
    String cor;
    int tam;
    String modelo;
    boolean ligado;

    void status(){

        System.out.printf("\nA cor é %s", this.cor);
        System.out.printf("\nO modelo do celular e: %s ",this.modelo );
        System.out.printf("\nO tamanho é %d ", this.tam);
        System.out.printf("\n o celular esta ligado ? %b ", this.ligado);
        
    }

    void ligar(){

        if (ligado == false) {

            System.out.println("\nERRO celular esta desligado ");
            
        }

        else{
            System.out.println("\nESTOU MEXENDO ");
        }

        
    }

    
}
