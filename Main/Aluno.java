/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.Main;

/**
 *
 * @author lucas
 */
public class Aluno extends Pessoa{
    String email, endereco, dataIngresso;
    Responsavel responsavel;
    Modalidade[] atividadesMatriculadas = new Modalidade[6];

    public Aluno(String cpf, String nome, String email, String endereco, String celular, String dataIngresso) {
        super(cpf, nome, celular);
        this.email = email;
        this.endereco = endereco;
        this.dataIngresso = dataIngresso;
    }

    public Aluno(String cpf, String nome, String email, String endereco, String celular, String dataIngresso, Responsavel responsavel) {
        super(cpf, nome, celular);
        this.email = email;
        this.endereco = endereco;
        this.dataIngresso = dataIngresso;
        this.responsavel = responsavel;
    }
    
    public void MatricularModalidade(Modalidade modalidade) {
        for (int i = 0; i < 6; i++) {
            if(this.atividadesMatriculadas[i] == null) {
                this.atividadesMatriculadas[i] = modalidade;
                return;
            }
        }
    }
    
}
