package m03_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

/* do {
     comando 1                      REGRA:
     comando 2                      V: volta    F: pula fora
   } while (condição)
*/

public class a03_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em °C: ");
            double c = sc.nextDouble();
            double f = ((9 * c) / 5) + 32;

            System.out.printf("Equivalente a °F: %.1f%n", f);
            System.out.print("Deseja repetir (s/n) ?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}
