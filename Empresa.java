package AvInd;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements IEmpresa{
    
    private List<Observer> observers;
    
    public void atualizarInformacoes(){
        notificacao();
    }
    
    public Empresa(){
        this.observers = new ArrayList<Observer>();
    }
    
    public void adicionar(Observer observer){
        observers.add(observer);
    }
    
    public void remover(Observer observer){
        int index = observers.indexOf(observer);
        if(index > -1){
            System.out.println("");
            System.out.println("O cliente do " + observer.getClass().getName() + " cancelou o recebimento de notificações");
            System.out.println("");
            
            observers.remove(observer);
        }
    }
    
    public void notificacao(){
        System.out.println("");
        System.out.println("Novas Atualizações...");
        System.out.println("");
        for(Observer o : observers){
            o.update();
        }
    }
}
