package AvInd;

public class nichoBebidas implements Observer{
    public Empresa empresa;
    
    public nichoBebidas(Empresa empresa){
        this.empresa = empresa;
        this.empresa.adicionar(this);
    }
    
    public void update(){
        System.out.println("BEBIDAS: Olá, chegou um novo estoque daquela bebida que você gosta!");
    }
}
