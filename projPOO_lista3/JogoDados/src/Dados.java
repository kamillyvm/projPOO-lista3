import java.util.Random;

public class Dados {
	
	//Atributos 
	private String nome;
	private int aposta;
	private int d1;
	private int d2;
	private int sortido;
	private int pontuacao;   
	private int pontoMaq;
	private int qtdVM;
	private int qtdVitorias;
	
	//metodos  
	
	public int JogarDado() {
		Random rand = new Random();
	    return 1 + rand.nextInt(6);
	    
	}
	
	public void NumeroSortido() {
        this.d1 = JogarDado();
        this.d2 = JogarDado();
        this.sortido = this.d1 + this.d2;
    }
	
	public void Raking() {
		if(this.nome == null && this.qtdVitorias == 0) {
			System.out.println("RAKING DE VITORIAS");
			System.out.println("--------------------------");
			System.out.println("nome: Sem Jogadores");
			System.out.println("quantidade de vitorias: 000");
		}else {	
			System.out.println("RAKING DE VITORIAS");
			System.out.println("--------------------------");
			System.out.println("nome: " + this.nome);
			System.out.println("quantidade de Pontuação: " + this.pontuacao);
			System.out.println("quantidade de vitorias: " + this.qtdVitorias);
		}
	}

	public boolean validarVencedor() {
		boolean test = false;
		
			if(this.aposta == this.sortido) {
				test = true;
				this.pontuacao += 1;
			} else {
				test = false;
				this.pontoMaq += 1; 
			}
		return test; 
	}
	
	public void registrarVitorias() {
		this.qtdVitorias += 1;
	}
	
	public void MaquinaObjt() {
		System.out.println("nome: Maquina");
		System.out.println("pontuação: " + this.pontoMaq);
		System.out.println("vitorias: " + this.qtdVM);
		
	}
	
	public String exibirInfo() {
		
			return "Nome: " + this.nome + "\n" +
				   "Numero Apostado: " + this.aposta + "\n" +
				   "Pontuação: " + this.pontuacao;   
				 
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + "\n" +
			   "Numero Apostado: " + this.aposta + "\n" +
			   "Quantidade de Pontuação: " + this.pontuacao + "\n" +
			   "Quantidade de vitorias: " + this.qtdVitorias; 
	} 
	
	Dados() {
		
	}
	 
	public String getNome() {
		return this.nome; 
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumAposta() {
		return this.aposta; 
	}
	public void setNumAposta(int aposta) {
		this.aposta = aposta;
	}
	public int getPontuação() {
		return this.pontuacao; 
	}
	public void setPontuação(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getQuantVitorias() {
		return this.qtdVitorias; 
	}
	public void setQuantVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	
	public int getQuantVM() {
		return qtdVM;
	}

	public void setQuantVM(int qtdVM) {
		this.qtdVM = qtdVM;
	}

	public int getDado1() {
		return d1;
	}
	public int getDado2() {
		return d2;
	}
	public int getNumeroSortido() {
		return sortido; 
	}
	
	
	
}