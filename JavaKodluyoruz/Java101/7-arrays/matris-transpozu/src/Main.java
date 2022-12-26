import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matris = new int[][]{{2, 3, 4}, {5, 6, 4}};
        int[][] transpoze = new int[matris[0].length][matris.length];

        System.out.println("Matris: ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");

        for (int j = 0; j < matris[0].length; j++) {
            for (int i = 0; i < matris.length; i++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[0].length; j++) {
                System.out.print(transpoze[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
