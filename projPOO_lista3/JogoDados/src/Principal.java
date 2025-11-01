import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		ArrayList<Dados> Jogadores = new ArrayList<Dados>(); 
		
		Dados j1 = new Dados();
		Dados j2 = new Dados();
		Dados j3 = new Dados();
		Dados j4 = new Dados();
		
		Jogadores.add(j1);
		Jogadores.add(j2);
		Jogadores.add(j3);
		Jogadores.add(j4); 
		
		int opc = 0;
		do {
			System.out.println("bem-vindo(a), ao Jogos De Apostas!");
			s.nextLine();
			
			System.out.println("----------------------------------");
			System.out.println("          REGRAS DO JOGO");
			System.out.println("----------------------------------");
			System.out.println("1 - o jogo eh para 4 jogadores.");
			System.out.println("2 - cada jogador escolhe um numero de 2 a 12");
			System.out.println("3 - ninguem pode repetir o mesmo numero na rodada.");
			System.out.println("4 - dois dados sao lancados e o valor soma.");
			System.out.println("5 - quem acertar o valor da soma vence a rodada.");
			System.out.println("6 - se ninguém acertar, o ponto vai para a máquina.");
			System.out.println("----------------------------------");
			System.out.println("aperte ENTER para iniciar!");
			
			s.nextLine();
			
			j1.Raking();
			int index = 1;
			
			do {
				
				s.nextLine();
				System.out.println("INICIANDO JOGO");
				System.out.println( index+"ª" + " PARTIDA");
			
				for (int i = 0; i < Jogadores.size(); i++) {
					s.nextLine();
					System.out.println("JOGADOR " + (i + 1));
					System.out.println("---------------------");
                  
					System.out.println("nome: ");
					Jogadores.get(i).setNome(s.nextLine()); 
                
					System.out.println("numero escolhido: "); 
					Jogadores.get(i).setNumAposta(s.nextInt());
                
				}
			
				s.nextLine();
				System.out.println("DADOS SENDO LANÇADOS...");
				
				
				boolean aux = false;
				int numeroSortido = -1;
				for(int j = 0; j < Jogadores.size(); j++) {
					s.nextLine();
					Jogadores.get(j).NumeroSortido();
					
					if(Jogadores.get(j).validarVencedor()) {
						System.out.println("parabens " + Jogadores.get(j).getNome() + " voce venceu!" );
						System.out.println("numero sortido: " + Jogadores.get(j).getNumeroSortido() );
						aux = true;
					}
					
					numeroSortido = Jogadores.get(j).getNumeroSortido(); 
				}
				
				if(!aux) {
					System.out.println("nenhum jogador venceu :( " );
					System.out.println("numero sortido: " + numeroSortido); 
				}
				
				index += 1;
				
			}while(index <= 3);
			
			
			for(int i = 0; i<Jogadores.size(); i++) {
			
				if(Jogadores.get(i).getPontuação() > Jogadores.get(i).getPontuação()) {
					Jogadores.get(i).registrarVitorias();
				}else {
					Jogadores.get(i).setQuantVM(+1); 
				} 
			}
		
			for (Dados jogador : Jogadores) { 	
					jogador.Raking();
			}
			s.nextLine();
		
			System.out.println("desejam jogar novamente? (1-sim, 2-nao)");
			opc = s.nextInt();
			 
			
		}while(opc != 2);
	}
}