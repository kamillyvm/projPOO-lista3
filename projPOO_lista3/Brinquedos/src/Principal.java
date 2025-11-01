import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Brinquedo> brinquedos = new ArrayList<>();

        brinquedos.add(new Carrinho("relampago", "vermelho", 100));
        brinquedos.add(new Boneca("lili", "rosa", "Vamos tomar chá? ☕"));
        brinquedos.add(new Pelucia("ted", "marrom", "ursinho"));
        brinquedos.add(new Robozinho("zipp", "azul", 80));

        System.out.println("APRESENTACAO DOS BRINQUEDOS");
        for (Brinquedo b : brinquedos) {
            b.apresentar();
        }

        System.out.println("\nTESTE DE SOBRECARGA");
        Carrinho car = new Carrinho("speedy", "amarelo", 50);
        car.acelerar();
        car.acelerar(20);

        System.out.println("\nTESTE DE INTERFACES");
        Boneca boneca = new Boneca("lili", "rosa", "oi, amiguinho!");
        boneca.falar();
        boneca.mover();
        boneca.parar();

        Robozinho robo = new Robozinho("zipp", "azul", 80);
        robo.mover();
        robo.parar();

        System.out.println("\nTESTE DE HERANCA");
        boneca.saudacao(); // herdado de Brinquedo
    }
}
