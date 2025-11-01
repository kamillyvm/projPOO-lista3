public class Boneca extends Brinquedo implements Falante, Movimentavel {
    //classe concreta C3
    private String fraseFavorita;

    public Boneca(String nome, String cor, String fraseFavorita) {
        super(nome, cor);
        this.fraseFavorita = fraseFavorita;
    }

    @Override
    public void apresentar() {
        System.out.println("sou a boneca " + nome + ", com meu vestido " + cor + "!");
    }

    @Override
    public void falar() {
        System.out.println(nome + " diz: \"" + fraseFavorita + "\"");
    }

    @Override
    public void mover() {
        System.out.println(nome + " esta dancando");
    }

    @Override
    public void parar() {
        System.out.println(nome + " parou de dancar");
    }
}
