/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Main;

/**
 *
 * @author lucas
 */
public class Turma {
    private Aluno[] capacidadeAluno = new Aluno[10];
    private Horarios horarios;

    public Turma(Horarios horarios) {
        this.horarios = horarios;
    }
    
    public Aluno[] getCapacidadeAluno() {
        return capacidadeAluno;
    }

    public void setAluno(Aluno aluno) {
        for(int i =  0; i < this.capacidadeAluno.length; i++) {
            if(this.capacidadeAluno[i] == null) {
                this.capacidadeAluno[i] = aluno;
                return;
            } else if(i+1 == this.capacidadeAluno.length && this.capacidadeAluno[i] != null) {
                System.out.println("Turma cheia.");
            }
        }
    }

    public String[] getHorarios() {
        return this.horarios.getDiasHorarios();
    }

    public void setHorarios(String horarios) {
        this.horarios.setDiasHorarios(horarios);
    }
    
}
