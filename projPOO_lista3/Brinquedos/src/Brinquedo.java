public abstract class Brinquedo {
    //classe abstrata C1

    protected String nome;
    protected String cor;

    public Brinquedo(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public abstract void apresentar();

    public void saudacao() {
        System.out.println("ola! eu sou um brinquedo chamado " + nome + ".");
    }
    
}
