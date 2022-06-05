/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Main;

/**
 *
 * @author lucas
 */
public class Horarios {
    private String[] diasHorarios = new String[2];

    public Horarios() {
    }

    public void setDiasHorarios(String diasHorarios) {
        for(int i = 0; i < this.diasHorarios.length; i ++) {
            if(this.diasHorarios[i] == null) {
                this.diasHorarios[i] = diasHorarios;
                return;
            } else if(i+1 == this.diasHorarios.length && this.diasHorarios[i] != null) {
                System.out.println("Todos os horários já foram definidos.");
            }
        }
    }

    public String[] getDiasHorarios() {
        return diasHorarios;
    }
    
}
