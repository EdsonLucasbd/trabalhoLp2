/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Main;

/**
 *
 * @author lucas
 */
public class Responsavel extends Pessoa{
    private Pessoa parente;

    public Responsavel(String cpf, String nome, String celular) {
        super(cpf, nome, celular);
    }

    public void setParente(Pessoa parente) {
        this.parente = parente;
    }
    
}
