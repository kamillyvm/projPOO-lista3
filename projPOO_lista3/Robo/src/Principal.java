import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Robo r1 = new Robo(0, 0, 2);
        int op;

        do {
            System.out.println("\nCONTROLE DO ROBO");
            System.out.println("1 - andar para frente");
            System.out.println("2 - andar para tras");
            System.out.println("3 - andar para direita");
            System.out.println("4 - andar para esquerda");
            System.out.println("5 - mostrar posicao atual");
            System.out.println("6 - sair");
            System.out.print("escolha uma opcao: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    r1.andarFrente();
                    break;
                case 2:
                    r1.andarTras();
                    break;
                case 3:
                    r1.andarDireita();
                    break;
                case 4:
                    r1.andarEsquerda();
                    break;
                case 5:
                    r1.mostrarPosicaoAtual();
                    break;
                case 6:
                    System.out.println("encerrando controle.");
                    break;
                default:
                    System.out.println("opcao invalida!");
            }

            if (op >= 1 && op <= 4) {
                r1.mostrarSala();
            }

        } while (op != 6);

        s.close();
    }
}
