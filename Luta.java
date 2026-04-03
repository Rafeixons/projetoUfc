package exercicio_UFC;

public class Luta {

    public static void main(String[] args) {
        Lutadores lutador1 = new Lutadores("Mozart", "Brasileira", 24, 1.67, 78, 21, 6, 1);

        Lutadores lutador2 = new Lutadores("Rafaela", "Brasileira", 21, 1.68, 75, 24, 6, 1);

        System.out.println("Apresentando nossos LUTADORES!!");
        lutador1.apresentar();
        System.out.println("");
        System.out.println("Os pontos de: " + lutador1.getNome());
        lutador1.status();
        System.out.println("");
        lutador2.apresentar();
        System.out.println("");
        System.out.println("Os pontos de: " + lutador2.getNome());
        lutador2.status();
        System.out.println("");
        System.out.println("");
        
        

        UFC roud1 = new UFC();
        
        roud1.marcarLuta(lutador1, lutador2);
        
        System.out.println("No dia da luta...");

        roud1.setDesafiador(lutador1.getNome());
        roud1.getDesafiador();
        roud1.setDesafiante(lutador2.getNome());
        roud1.getDesafiante();

        roud1.lutar(lutador1, lutador2);
        lutador1.status();
        lutador2.status();
    }
}
