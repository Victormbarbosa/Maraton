
package copamundo;

import java.util.Scanner;


public class CopaMundo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, a, b, contador;
        n = leer.nextInt();
        a = leer.nextInt();
        b = leer.nextInt();
        int y = (int) (Math.log((double) n) / Math.log(2));
        int[] vector = new int[n+1];
        for (int i = 1; i <= n; i++) {
            vector[i]=i;
        }
        for (int i = 1; i <= y; i++) {
            contador = 0;
            for (int j = 1; j <= n / (i); j+=2) {
                contador++;
                if ((vector[j] == a && vector[j + 1] == b) || (vector[j] == b && vector[j + 1] == a)) {
                    if (i == y) {
                        System.out.println("Final!");
                        i=y;
                        j=n/i;
                    } else {
                        System.out.println("" + i);
                        i=y;
                        j=n/i;
                    }
                } else {
                    if (vector[j] == a || vector[j + 1] == a) {
                        vector[contador] = a;
                    } else {
                        if (vector[j] == b || vector[j + 1] == b) {
                            vector[contador] = b;
                        } else {
                            vector[contador] = j;
                        }
                    }
                }
            }
        }
    }

}
