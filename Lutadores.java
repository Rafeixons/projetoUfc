package exercicio_25.pkg03;

import java.util.Scanner;

public class Lutadores {

    Scanner s = new Scanner(System.in);

    UFC l = new UFC();

    private String nome;
    private String nascionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascionalidade: " + nascionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("");
    }

    public void status() {
        System.out.println("Numero de vitórias: " + getVitorias() + "\n Numero de Derrotas: " + getDerrotas() + "\nNumero de Empates: " + getEmpates() + "\n");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public Lutadores(String nome, String nascionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        if (getPeso() <= 52.0) {
            System.out.println("Categoria: Peso inválido");
        } else if (getPeso() <= 70) {
            System.out.println("Categoria: Peso leve!");
        } else if (getPeso() <= 83) {
            System.out.println("Categoria: Peso médio!");
        } else if (getPeso() <= 150) {
            System.out.println("Categoria: Peso pesado!");
        } else {
            System.out.println("Categoria: Peso inválido!");
        }

        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = getVitorias() + vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
