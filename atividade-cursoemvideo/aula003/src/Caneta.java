
public class Caneta {

    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.printf("Modelo:  %s ", this.modelo);
        System.out.printf("Uma caneta %s", this.cor);
        System.out.printf("Carga: %d  ", this.carga);
        System.out.printf(" Esta tampada? %b ", this.tampada);
    }

    public void rabiscar(){

        if (this.tampada == true){

            System.out.println("ERRO!! Não posso rabiscar ");
        }else{
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar(){

        this.tampada = true;

    }

    public void destampar(){

        this.tampada = false;

    }
}
