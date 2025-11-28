package br.edu.cadastro.service;

import br.edu.cadastro.model.Aluno;
import br.edu.cadastro.exception.CadastroException;
import java.util.ArrayList;
import java.util.List;

public class CadastroService {
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) throws CadastroException {
        if (aluno.getNome() == null || aluno.getMatricula() == null) {
            throw new CadastroException("Dados do aluno incompletos.");
        }
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            a.exibirInfo();
        }
    }
}
