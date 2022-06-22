public class ControleRemoto implements Icontrolador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // Metodos Abstrados
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
    }
    @Override //QUER DIZER QUE ESTA SOBSCREVENDO E DESCONSIDERANDO A OUTRA PROGAMAÇÃO
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
        
    }
    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("-----MENU-----");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
            
        }
    }
    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("impossvel aumentar volume");
        }
            
    }
    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else{
            System.out.println("Impossivel diminuir volume");
        }
    }
    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if (this.getLigado() && getVolume() >  0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        if(this.getLigado() && !(this.getTocando())){ //&& QUER DIZER "'E' TAL COISA" E ! QUER DIZER NÃO 
            this.setTocando(true);
        }else{
            System.out.println("Não conseguir reprododuzir");
        }
    }
    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não da para pausar");
        }
    }
    
}
