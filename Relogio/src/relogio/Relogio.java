
package relogio;

public class Relogio {

   
    public static void main(String[] args) {
        
        Contador c1 = new Contador();
        
        c1.acertarRelogio(3, 30, 50);
        
        System.out.println("Posição Hora: " + c1.ponteiroHora.posicao);
        System.out.println("Posição Minuto: " + c1.ponteiroMinuto.posicao);
        System.out.println("Posicao Segundo: " + c1.ponteiroSegundo.posicao);
        System.out.println("Hora : " + c1.lerHora() + " " + c1.lerMinuto()+ " " + c1.lerSegundo());
        
    }
    
}
