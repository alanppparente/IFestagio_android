/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulajson;

/**
 *
 * @author Keylla
 */
public class AlunoTemHabilidade {
    int id_aluno;
    int id_habilidade;

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getId_habilidade() {
        return id_habilidade;
    }

    public void setId_habilidade(int id_habilidade) {
        this.id_habilidade = id_habilidade;
    }

    @Override
    public String toString() {
        return "AlunoTemHabilidade{" + "id_aluno=" + id_aluno + ", id_habilidade=" + id_habilidade + '}';
    }
    
    
    
}
