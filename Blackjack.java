import java.util.Random;

/**
 * Escreva uma descrição da classe Blackjack aqui.
 * 
 * @author marco.mangan@pucrs.br 
 * @version (um número da versão ou uma data)
 */
public class Blackjack
{
    public static void main(String[] args) {
        Random r;
        int c1, c2;
        int j1, j2;
        
        r = new Random();
        
        c1 = 1 + r.nextInt(13);
        c2 = 1 + r.nextInt(13);
        
        j1 = 1 + r.nextInt(13);
        j2 = 1 + r.nextInt(13);
        
        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %d%n", c1);
        System.out.printf("Carta 2: %d%n", c2);
        System.out.printf("Total  : %d%n", c1 + c2);
       
        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %d%n", j1);
        System.out.printf("Carta 2: %d%n", j2);
        System.out.printf("Total  : %d%n", j1 + j2);
        
    }
}
