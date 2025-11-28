package br.edu.cadastro;

import br.edu.cadastro.exception.CadastroException;
import br.edu.cadastro.model.Aluno;
import br.edu.cadastro.service.CadastroService;

public class Main {public static void main(String[] args) {
        CadastroService service = new CadastroService();

        try {
            Aluno aluno1 = new Aluno("Eduardo", 20, "2025001");
            service.cadastrarAluno(aluno1);

            Aluno aluno2 = new Aluno("Marcus", 22, "2025002");
            service.cadastrarAluno(aluno2); // Vai lançar exceção

        } catch (CadastroException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        service.listarAlunos();
    }
}

    

