package AvInd;

public class EmpresaNotificacao {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        nichoAlimentos nichoalimentos = new nichoAlimentos(empresa);
        nichoBebidas nichobebidas = new nichoBebidas(empresa);
        nichoConfeccoes nichoconfeccoes = new nichoConfeccoes(empresa);
        nichoLivros nicholivros = new nichoLivros(empresa);
        
        int count = 0;
        
        while (count <= 10) {
            empresa.atualizarInformacoes();
            if (count == 3) {
                empresa.remover(nicholivros);
            }
            if (count == 6) {
                empresa.remover(nichoconfeccoes);
            }
            
            try {
                Thread.sleep(3000);
                
                if (count == 10) {
                    System.out.println("Fim...");
                    System.exit(0);
                }
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}