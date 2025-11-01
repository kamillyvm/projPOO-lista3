import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private static int cont = 1;
    private int codPedido;
    private String dataCompra;
    private String horaCompra;
    private String endEntrega;
    private int quantidade;
    private double precoUnitario;
    private double totalCompra;
    private String horaEntrega;
    private String cartao;
    private String status;

    public Pedido(String endEntrega) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter dataFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFmt = DateTimeFormatter.ofPattern("HH:mm");

        this.codPedido = cont++;
        this.dataCompra = agora.format(dataFmt);
        this.horaCompra = agora.format(horaFmt);
        this.endEntrega = endEntrega;
        this.status = "pendente";
        this.precoUnitario = 100.0;
    }

    public void confirmarPedido(int quantidade, String cartao) {
        this.quantidade = quantidade;
        this.cartao = cartao;
        calcularTotal();
        calcularHoraEntrega();
        this.status = "confirmado";
    }

    public void alterarEndereco(String novoEndereco) {
        this.endEntrega = novoEndereco;
    }

    public void calcularTotal() {
        this.totalCompra = this.quantidade * this.precoUnitario;
    }

    public void calcularHoraEntrega() {
        LocalDateTime horaCompraAtual = LocalDateTime.now();
        LocalDateTime horaEntregaCalculada = horaCompraAtual.plusHours(2);

        DateTimeFormatter horaFmt = DateTimeFormatter.ofPattern("HH:mm");
        this.horaEntrega = horaEntregaCalculada.format(horaFmt);
    }

    public void marcarComoEntregue() {
        this.status = "entregue";
    }

    public void mostrarPedido() {
        System.out.println("\nDADOS DO PEDIDO");
        System.out.println("codigo: " + codPedido);
        System.out.println("data da compra: " + dataCompra);
        System.out.println("hora da compra: " + horaCompra);
        System.out.println("endereco: " + endEntrega);
        System.out.println("quantidade: " + quantidade);
        System.out.println("preco unitario: R$" + precoUnitario);
        System.out.println("total: R$" + totalCompra);
        System.out.println("hora de entrega: " + horaEntrega);
        System.out.println("status: " + status);
    }

    public int getCodigoPedido() {
        return codPedido;
    }

    public String getStatus() {
        return status;
    }
}
