package exercicio_25;

import java.util.Random;

public class UFC {

    private String desafiador;
    private String desafiante;
    private int rounds;

    public void marcarLuta(Lutadores lutador1, Lutadores lutador2) {
        if (lutador1.getCategoria() == lutador2.getCategoria()) {
            System.out.println("Luta marcada para dia 26/04/2026");
        } else {
            System.out.println("Os lutadores não estão na mesma categoria, selecione outro lutador.");
        }
    }

    public void lutar(Lutadores lutador1, Lutadores lutador2) {

        System.out.println("Porrada... AAAAH... PUM...POU...PENG... TUUUUU");

        if (lutador1.getPeso() > lutador2.getPeso()) {
            System.out.println("Lutador " + lutador1.getNome() + " venceu!");
            lutador1.setVitorias(1);

        } else {
            System.out.println("Lutador " + lutador2.getNome() + " venceu!");
            lutador2.setVitorias(1);

        }

    }

    public String getDesafiador() {
        System.out.println("O desafiador é: " + desafiador);
        return desafiador;
    }

    public void setDesafiador(String desafiador) {
        this.desafiador = desafiador;
    }

    public String getDesafiante() {
        System.out.println("O desafiante é: " + desafiante);
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}
