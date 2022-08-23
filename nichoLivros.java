package AvInd;

public class nichoLivros implements Observer{
    public Empresa empresa;
    
    public nichoLivros(Empresa empresa){
        this.empresa = empresa;
        this.empresa.adicionar(this);
    }
    
    public void update(){
        System.out.println("LIVROS: Novidades em boxes de livros capa dura com aquele desconto especial!");
    }
}
