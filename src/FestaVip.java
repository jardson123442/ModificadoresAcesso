

public class FestaVip {
    private int quantidadeCafe = 30;
    private int quantidadeSalgado = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    private void beberCafe(){
        quantidadeCafe--;
        System.out.println("Cafe tomado!");
    }

    private void comerSalgado(){
        quantidadeSalgado--;
        System.out.println("Salgado comido!");
    }


    
}
