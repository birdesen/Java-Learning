import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int n1 = 0, n2 = 0, n3 = 0;

            for (int j = 0; j < n; j++) {

                double u = Math.pow(2, j);
                n3 = (int) u * b;
                n1 = n2 + n3;

                n3 = n2;
                n2 = n1;

                System.out.print(a + n1 + " ");
            }
            System.out.println();
        }
        in.close();


    }
}
