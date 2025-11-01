public class Robozinho extends Carrinho implements Movimentavel {
    //classe concreta C5
    private int bateria;

    public Robozinho(String nome, String cor, int bateria) {
        super(nome, cor);
        this.bateria = bateria;
    }

    @Override
    public void apresentar() {
        System.out.println("sou o robozinho " + nome + " da cor " + cor + " e tenho " + bateria + "% de bateria");
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta se movendo com suas rodinhas");
    }

    @Override
    public void parar() {
        System.out.println(nome + " parou de se mover");
    }
}
