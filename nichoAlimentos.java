package AvInd;

public class nichoAlimentos implements Observer{
    public Empresa empresa;
    
    public nichoAlimentos(Empresa empresa){
        this.empresa = empresa;
        this.empresa.adicionar(this);
    }
    
    public void update(){
        System.out.println("ALIMENTOS: Promoção em produtos alimentícios, temos novidades para você, vem conferir!");
    }
}
