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
    public static void mostrarCartasComputador(final int[] c, final int tc) {
        System.out.printf("COMPUTADOR%n");
        for (int i = 1; i < c.length; i++) {   
            System.out.printf("Carta %d: %s%n", i, face(c[i]));
        }

        System.out.printf("Total  : %d%n", tc);
    }
    
    
    public static int gerarCarta(final Random r) {
        return 1 + r.nextInt(13);
    }

    public static final String[] naipes = {"X", "♠", "♥", "♦", "♣"};

    public static String gerarNaipe(final Random r) {
        int n = r.nextInt(4);
        return naipes[n];
    }    
       
    public static final String[] faces = {"X", "A",  
                            "2", "3", "4", 
                            "5", "6", "7", 
                            "8", "9", "10",
                            "J", "Q", "K"
                        };
                        
    public static String face(final int c) {
        return faces[c];
    }

    public static int valor(final int c) {
        return (c > 10)? 10 : c;
    }

    public static int somarCartas(final int c1, final int c2, final int c3) {
        return valor(c1) + valor(c2) + valor(c3);
    }

    public static int somarCartas(final int[] cartas) {
        int s = 0;
        for (int i = 1; i < cartas.length; i++) {
            s += valor(cartas[i]);
        }
        return s;
    }    
    
    public static void main(String[] args) {
        Scanner sc;
        Random r;
        int[] c;
        int j1, j2, j3;
        int tc, tj;
        String resposta;
        boolean hitme;
    
        sc = new Scanner(System.in);
        r = new Random();
        // alocação do vetor/arranjo
        c = new int[4]; // c[0] não será utilizada
        
        for (int i = 1; i < c.length; i++) {
            c[i] = gerarCarta(r);
        }

        j1 = gerarCarta(r);
        j2 = gerarCarta(r);

        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %s%n", face(c[1]));

        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %s%n", face(j1));
        System.out.printf("Carta 2: %s%n", face(j2));

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

        tc = somarCartas(c);
        tj = somarCartas(j1, j2, j3);

        mostrarCartasComputador(c, tc);

        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %s%n", face(j1));
        System.out.printf("Carta 2: %s%n", face(j2));
        if (hitme)
            System.out.printf("Carta 3: %s%n", face(j3));
        System.out.printf("Total  : %d%n", tj);

        if (tj > 21) {
            System.out.println("Perdeu! (Excedeu 21)");
        } else {
            if (tc > 21) {
                System.out.println("Ganhou! (Oponente excedeu 21)");
            } else {
                if (tj > tc) {
                    System.out.println("Ganhou! (Mais perto de 21)");                    
                } else {
                    if (tj < tc) {
                        System.out.println("Perdeu! (Oponente mais perto de 21)");
                    } else {
                        System.out.println("Empate! (Mesmo valor)");                    
                    }
                }
            }
        }

        sc.close();
    }
}
