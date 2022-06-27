/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Loja {

    String nomeFantasia, razSocial;
    int cnpj, digitoCnpj;
    float faturamento, area;
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }
    
    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }
    public String getRazSocial() {
        return this.razSocial;
    }
    
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public int getCnpj() {
        return this.cnpj;
    }
    
    public void setDigitoCnpj(int digitoCnpj) {
        this.digitoCnpj = digitoCnpj;
    }
    public int getDigitoCnpj() {
        return this.digitoCnpj;
    }
    
    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }
    public float getFaturamento() {
        return this.faturamento;
    }
    
    public void setArea(float area) {
        this.area = area;
    }
    public float getArea() {
        return this.area;
    }

    public Loja(String nomeFantasia, String razSocial, int cnpj, int digitoCnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razSocial = razSocial;
        this.cnpj = cnpj;
        this.digitoCnpj = digitoCnpj;
    }

    public Loja(String nomeFantasia, int cnpj, 
    int digitoCnpj, float faturamento, String pubAlvo) {
        String publicoAlvo = pubAlvo;
        this.nomeFantasia = nomeFantasia;
        this.razSocial = nomeFantasia;
        this.cnpj = cnpj;
        this.digitoCnpj = digitoCnpj;
        this.faturamento = faturamento;
    }

    public void calcFaturamento(Loja lojaA, Loja lojaB) {
      if(lojaA.getFaturamento() > lojaB.getFaturamento()){
          System.out.printf("O faturamento da %s e maior.\n", lojaA.getNomeFantasia());
      } else if(lojaB.getFaturamento() > lojaA.getFaturamento()){
          System.out.printf("O faturamento da %s e maior.\n", lojaB.getNomeFantasia());
      } else System.out.println("Os faturamentos sao iguais.");
    }

    public float calcAluguel() {
        float valorMetro = 50.00f;
        float aluguel = this.area * valorMetro;
        return aluguel;
    }
}
