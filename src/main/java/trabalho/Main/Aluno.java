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
    private String email, endereco, dataIngresso;
    private Responsavel responsavel;
    private Modalidade[] atividadesMatriculadas = new Modalidade[6];
    private float mensalidade;

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

    public float getMensalidade() {
        float valorTotal = 0;
        int totalModalidades = 0;
        for(int i = 0; i < this.atividadesMatriculadas.length; i++) {
            if(this.atividadesMatriculadas[i] != null) {
                valorTotal += this.atividadesMatriculadas[i].getPreco();
                totalModalidades++;
            }
        }
        if(totalModalidades == 2) {
            return valorTotal * 0.95f;
        }
        if(totalModalidades <= 3) {
            return valorTotal * 0.80f;
        }
        if(responsavel != null){
            return valorTotal * 0.90f;
        }
        
        return valorTotal;
        
    }
    
    
    
}
