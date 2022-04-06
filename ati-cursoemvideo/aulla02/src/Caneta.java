public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.printf("Modelo %s \n" , this.modelo);
        System.out.printf("Uma caneta %s \n" , this.cor);
        System.out.printf("Ponta: %.2f \n ", this.ponta);
        System.out.printf("Carga %d\n ", this.carga);
        System.out.printf("esta tampada ? %b   ", this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO não posso escrever esta tampado \n");
        }

        else{
            System.out.println("\nESTOU RABISCANDO");
        }
            

    }

    void tampar(){
        this.tampada = true;


    }

    void destampar(){

        this.tampada = false;


    }

    
}
