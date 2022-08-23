package AvInd;

public interface IEmpresa {
    public void adicionar(Observer observer);
    
    public void remover(Observer observer);
    
    public void notificacao();
}
