package classes;

public class ContaBanco {


    //ATRIBUTOS 
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // METODOS

    public void estadoAtual(){

        System.out.println(" \n --------------------------------------");
         System.out.println("CONTA " + this.getNumConta());
         System.out.println("DONO "+ this.getDono());
         System.out.println("TIPO DA CONTAR "+ this.getTipo());
         System.out.println("SALDO "+ this.getSaldo());
         System.out.println("STATUS " + this.getStatus());
    }

    public void abrirConta(String tipo){
        
        setTipo(tipo);
        setStatus(true);

        if (tipo == "CC") {
            //this.saldo = 50;
            //esses dois jeitos de fazer são as mesmas coisas 
            this.setSaldo (50);
            
        } else if (this.tipo == "CP"){
            this.setSaldo(150);
            
        }
        System.out.println("CONTA ABERTA COM SUCESSO");

    };

    public void fecharConta(){

        if (this.getSaldo() > 0 ) {
            System.out.println("CONTA COM DINHEIRO ");
            
        } else if (this.getSaldo() < 0 ){
            System.out.println("CONTA EM DEBITO");
        } else {
            this.setStatus(false);
            //this.status = false;
            System.out.println("CONTA FECHADA COM SUCESSO");
        }
    };

    public void depositar( float valor ){

        if (this.getStatus() == true) {

            this.setSaldo(this.getSaldo() + valor ); 
            /* OU
            this.saldo = this.saldo + valor ESSE MODO MEXE DIRETO NO ATRIBUTO   */
            System.out.printf("DEPOSITO RALIZADO COM SUCESSO NA CONTA DE  " + this.getDono());


        } else if (this.getStatus() == false){
            System.out.println("ERRO VOCE NÃO TEM CONTA ");
        }

    };

    public void sacar(float valor ){

        if (this.getStatus() == true ){
            if (this.getSaldo() >= valor ){ 
                this.setSaldo(this.getSaldo() - valor );
                    System.out.printf("O VALOR DE FOI DEPOSITADO COM SUCESSO NA CONTA DE  "+  this.getDono() );
            }
            else {
                System.out.println("SALDO INSUICIENTE ");
            }
        } else {
            System.out.println("ERRO VOÇE NÃO TEM CONTA");
        }

    };

    public void pagarMensal(){

        int valor = 0;

        if (this.getTipo() == "CC"){
            valor = 12;
        } else if (this.getTipo() == "CP"){
            valor = 20;

        }

        if (this.getStatus() == true ) {
            if (this.getSaldo() > valor){
                this.setSaldo(this.getSaldo() - valor );

                /*this.saldo = this.saldo - valor;*/
                System.out.println("MENSALIDADE PAGAR COM SUCESSO POR " + this.getDono());

            } else{
                System.out.println("SALDO INSULFICIENTE");
            }
        
        }else{
            System.out.println("IMPOSSIVEL PAGAR VOÇE NÃO TEM CONTAR  ");
        }

    };

    //METODOS ESPECIAIS 

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    };

    




    
}
