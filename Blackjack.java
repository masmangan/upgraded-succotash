import java.util.Scanner;
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
        Scanner sc;
        Random r;
        int c1, c2;
        
        r = new Random();
        
        c1 = 1 + r.nextInt(13);
        c2 = 1 + r.nextInt(13);
        
        System.out.println(c1);
        System.out.println(c1);
        System.out.println(c1 + c2);
        
    }
}
