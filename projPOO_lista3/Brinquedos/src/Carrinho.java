public class Carrinho extends Brinquedo {
    //classe concreta C2
    private int velocidade;

    public Carrinho(String nome, String cor) {
        super(nome, cor);
        this.velocidade = 0;
    }

    public Carrinho(String nome, String cor, int velocidade) {
        super(nome, cor);
        this.velocidade = velocidade;
    }

    @Override
    public void apresentar() {
        System.out.println("sou um carrinho " + cor + " chamado " + nome + " e corro a " + velocidade + " km/h!");
    }

    // Sobrecarga de método
    public void acelerar() {
        velocidade += 5;
        System.out.println(nome + " acelerou para " + velocidade + " km/h!");
    }

    public void acelerar(int valor) {
        velocidade += valor;
        System.out.println(nome + " acelerou muito! agora esta a " + velocidade + " km/h!");
    }
}
