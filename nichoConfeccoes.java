package AvInd;

public class nichoConfeccoes implements Observer{
    public Empresa empresa;
    
    public nichoConfeccoes(Empresa empresa){
        this.empresa = empresa;
        this.empresa.adicionar(this);
    }
    
    public void update(){
        System.out.println("CONFECÇÕES: Estamos com um estoque novinho em confecções, vem dá uma olhada!");
    }
}
