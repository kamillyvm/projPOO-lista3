public class Robo {
    private int lin;
    private int col;
    private int passo;
    private final int linhas = 20;
    private final int colunas = 40;

    public Robo(int lin, int col, int passo) {
        this.lin = lin;
        this.col = col;
        this.passo = passo;
    }

    public void mostrarPosicaoAtual() {
        System.out.println("posicao atual da linha: " + lin + ", coluna: " + col);
    }

    public void andarFrente() {
        if (lin + passo < linhas) {
            lin += passo;
        } else {
            lin = linhas - 1;
        }
    }

    public void andarTras() {
        if (lin - passo >= 0) {
            lin -= passo;
        } else {
            lin = 0;
        }
    }

    public void andarDireita() {
        if (col + passo < colunas) {
            col += passo;
        } else {
            col = colunas - 1;
        }
    }

    public void andarEsquerda() {
        if (col - passo >= 0) {
            col -= passo;
        } else {
            col = 0;
        }
    }

    public void mostrarSala() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == lin && j == col) {
                    System.out.print("1");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
