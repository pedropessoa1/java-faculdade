
public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public  Caneta( String m , String c, float p ){ //este é o metodo contrutor
            this.tampar();
            this.cor = c;
            this.setPonta(p);
            this.modelo = m;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;

    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p ){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampada(){
        this.tampada = false;
    }

    public void status(){

        System.out.println("Sobre a caneta: ");
        System.out.printf("\nmodelo %s", this.getModelo());
        System.out.printf("\nPonta %.2f ", this.getPonta());
        System.out.printf("Cor: %s", this.cor);
        System.out.printf("Tampada? %b ", this.tampada);

    }
    
}
