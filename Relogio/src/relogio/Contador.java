package relogio;

public class Contador {
    
    Ponteiro ponteiroHora = new Ponteiro();
    Ponteiro ponteiroMinuto = new Ponteiro();
    Ponteiro ponteiroSegundo = new Ponteiro();
    
    public void acertarRelogio(int hora, int minuto, int segundo){
        
        hora = hora % 12;
        
        ponteiroHora.posicao = hora;
        ponteiroMinuto.posicao = minuto/5;
        ponteiroSegundo.posicao = segundo/5;
    }
    
    public int lerHora(){
        
    }
    
    public int lerMinuto(){
        
    }
    
    public int lerSegundo(){
        
    }
    
    
}
