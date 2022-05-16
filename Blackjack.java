import java.util.Random;
import java.util.Scanner;

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

    public static int valor(int c) {
        if (c > 10)
            return 10;
        else
            return c;
    }
    
    public static int somarCartas(int c1, int c2, int c3) {
        return valor(c1) + valor(c2) + valor(c3);
    }
   
    public static void main(String[] args) {
        Scanner sc;
        Random r;
        int c1, c2, c3;
        int j1, j2, j3;
        String resposta;
        boolean hitme;
        
        sc = new Scanner(System.in);
        r = new Random();
        
        c1 = gerarCarta(r);
        c2 = gerarCarta(r);
        c3 = gerarCarta(r);
        
        j1 = gerarCarta(r);
        j2 = gerarCarta(r);
        
        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %d%n", c1);
        
        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %d%n", j1);
        System.out.printf("Carta 2: %d%n", j2);

        System.out.printf("%nDeseja uma terceira carta? (sim/NÃO)%n");
        resposta = sc.nextLine();
        
        if ("sim".equalsIgnoreCase(resposta))
            hitme = true;
        else
            hitme = false;
        
        if (hitme)
            j3 = gerarCarta(r);
        else
            j3 = 0;
        
        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %d%n", c1);
        System.out.printf("Carta 2: %d%n", c2);
        System.out.printf("Carta 3: %d%n", c3);
        System.out.printf("Total  : %d%n", somarCartas(c1, c2, c3));
       
        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %d%n", j1);
        System.out.printf("Carta 2: %d%n", j2);
        if (hitme)
            System.out.printf("Carta 3: %d%n", j3);
        System.out.printf("Total  : %d%n", somarCartas(j1, j2, j3));
        
        
        sc.close();
    }
}
