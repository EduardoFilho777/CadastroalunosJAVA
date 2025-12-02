package br.edu.cadastro.service;

import br.edu.cadastro.model.Aluno;
import br.edu.cadastro.exception.CadastroException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CadastroService {
    // Lista principal de alunos
    private List<Aluno> alunos = new ArrayList<>();
    // Pilha para controlar histórico de cadastros
    private Stack<Aluno> historico = new Stack<>();

    // Método para cadastrar aluno
    public void cadastrarAluno(Aluno aluno) throws CadastroException {
        if (aluno.getNome() == null || aluno.getMatricula() == null) {
            throw new CadastroException("Dados do aluno incompletos.");
        }
        alunos.add(aluno);
        historico.push(aluno); // adiciona na pilha
        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Método para listar todos os alunos cadastrados
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno a : alunos) {
                a.exibirInfo();
            }
        }
    }

    // Método para desfazer o último cadastro (pilhagem)
    public void desfazerCadastro() {
        if (!historico.isEmpty()) {
            Aluno ultimo = historico.pop(); // remove o último da pilha
            alunos.remove(ultimo);
            System.out.println("Cadastro desfeito: " + ultimo.getNome());
        } else {
            System.out.println("Nenhum cadastro para desfazer.");
        }
    }

    // Método para ver o último aluno cadastrado sem remover
    public void verUltimoCadastro() {
        if (!historico.isEmpty()) {
            Aluno ultimo = historico.peek(); // consulta o topo da pilha
            System.out.println("Último cadastro: " + ultimo.getNome());
        } else {
            System.out.println("Nenhum cadastro realizado ainda.");
        }
    }
}


