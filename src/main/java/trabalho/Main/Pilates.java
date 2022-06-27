/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Main;

/**
 *
 * @author lucas
 */
public class Pilates extends Modalidade {
    private Turma[] turma = new Turma[2];

    public Pilates(float preco, String nome) {
        super(preco, nome);
    }

    public Turma[] getTurma() {
        return turma;
    }

    public void setTurma(Turma[] turma) {
        for(int i = 0; i < this.turma.length; i++) {
            if(this.turma[i] == null) {
                this.turma = turma;
                return;
            }
        }
    }
}
