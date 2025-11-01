public class Pelucia extends Carrinho {
    //classe concreta C4
    private String animal;

    public Pelucia(String nome, String cor, String animal) {
        super(nome, cor);
        this.animal = animal;
    }

    @Override
    public void apresentar() {
        System.out.println("sou uma pelucia " + animal + " chamada " + nome + "!");
    }
}
