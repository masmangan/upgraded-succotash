import java.util.Random;

/**
 * Escreva uma descrição da classe Blackjack aqui.
 * 
 * @author marco.mangan@pucrs.br 
 * @version (um número da versão ou uma data)
 */
public class Blackjack
{
    public static int gerarCarta(Random r) {
        return 1 + r.nextInt(13);
    }
    
    public static void main(String[] args) {
        Random r;
        int c1, c2, c3;
        int j1, j2, j3;
        
        r = new Random();
        
        c1 = gerarCarta(r);
        c2 = gerarCarta(r);
        c3 = gerarCarta(r);
        
        j1 = gerarCarta(r);
        j2 = gerarCarta(r);
        j3 = gerarCarta(r);
        
        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %d%n", c1);
        System.out.printf("Carta 2: %d%n", c2);
        System.out.printf("Carta 3: %d%n", c3);
        System.out.printf("Total  : %d%n", c1 + c2 + c3);
       
        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %d%n", j1);
        System.out.printf("Carta 2: %d%n", j2);
        System.out.printf("Carta 3: %d%n", j3);
        System.out.printf("Total  : %d%n", j1 + j2 + j3);
        
    }
}
