package br.edu.cadastro.model;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public void exibirInfo() {
        System.out.println("Aluno: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula);
    }
}
