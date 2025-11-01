import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int op;

        do {
            System.out.println("\nSISTEMA DE ENTREGA DE GAS");
            System.out.println("1 - fazer pedido");
            System.out.println("2 - confirmar entrega");
            System.out.println("3 - ver pedidos confirmados");
            System.out.println("4 - ver pedidos entregues");
            System.out.println("6 - sair");
            System.out.print("escolha uma opcao: ");
            op = s.nextInt();
            s.nextLine();

            switch (op) {
                case 1:
                    System.out.print("\ndigite o endereco de entrega: ");
                    String end = s.nextLine();

                    Pedido novoPedido = new Pedido(end);
                    novoPedido.mostrarPedido();

                    System.out.print("\ndeseja alterar o endereco? (s-sim/n-nao): ");
                    String resp = s.nextLine();

                    if (resp.equalsIgnoreCase("s")) {
                        System.out.print("novo endereco: ");
                        String novoEnd = s.nextLine();
                        novoPedido.alterarEndereco(novoEnd);
                        System.out.println("endereco alterado com sucesso!");
                    }

                    System.out.print("\ndeseja confirmar o pedido? (s-sim/n-nao): ");
                    String confirma = s.nextLine();

                    if (confirma.equalsIgnoreCase("s")) {
                        System.out.print("quantidade de botijoes: ");
                        int qtd = s.nextInt();
                        s.nextLine();
                        System.out.print("numero do cartão de credito: ");
                        String cartao = s.nextLine();
                        novoPedido.confirmarPedido(qtd, cartao);

                        System.out.println("\npedido confirmado com sucesso!");
                        novoPedido.mostrarPedido();
                        pedidos.add(novoPedido);
                    } else {
                        System.out.println("pedido nao confirmado.");
                    }
                    break;

                case 2:
                    System.out.print("\ndigite o codigo do pedido para confirmar entrega: ");
                    int codBusca = s.nextInt();
                    s.nextLine();

                    boolean encontrado = false;
                    for (Pedido p : pedidos) {
                        if (p.getCodigoPedido() == codBusca) {
                            p.marcarComoEntregue();
                            System.out.println("pedido " + codBusca + " marcado como entregue.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("pedido nao localizado.");
                    }
                    break;

                case 3:
                    System.out.println("\nPEDIDOS CONFIRMADOS");
                    for (Pedido p : pedidos) {
                        if (p.getStatus().equalsIgnoreCase("confirmado")) {
                            p.mostrarPedido();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nPEDIDOS ENTREGUES");
                    for (Pedido p : pedidos) {
                        if (p.getStatus().equalsIgnoreCase("entregue")) {
                            p.mostrarPedido();
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nencerrando o sistema.");
                    break;

                default:
                    System.out.println("\nOpcao invalida!");
            }

        } while (op != 6);

        s.close();
    }
}
