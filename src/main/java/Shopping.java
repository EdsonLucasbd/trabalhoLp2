/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Shopping {
    private String nome;
    private Loja[] lojas = new Loja[10];

    public Shopping(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addLojas(Loja loja) {
        for (int i = 0; i < 10; i++) {
            if(this.lojas[i] == null) {
                this.lojas[i] = loja;
                break;
            }
        }
        
    }
    
    public String consultaMaiorFaturamento(){
        float maiorFaturamento = this.lojas[0].getFaturamento();
        String nomeFantasia = null;
        int i;

        for(i = 0; this.lojas[i] != null; i++) {
            if(this.lojas[i].getFaturamento() > maiorFaturamento) {
                maiorFaturamento = this.lojas[i].getFaturamento();
                nomeFantasia = this.lojas[i].getNomeFantasia();
            }
        }
        return nomeFantasia;
    }
    
    public float faturamentoMedio() {
        float media = 0;
        float total = 0;
        int i, count = 0;
        for (i = 0; this.lojas[i] != null; i++){
            if(this.lojas[i].calcAluguel() > 1000){
                total += this.lojas[i].getFaturamento();
            }
            count = i;
        }
        return media = total / count;
    }
}
