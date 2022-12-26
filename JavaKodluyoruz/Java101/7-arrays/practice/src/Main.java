public class Main {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] list = new int[10];
        int list2[] = new int[10];
        int[] list3 = {1, 2, 3, 4, 5};
        double[] list4 = {1.1, 1.2, 1.3};

        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[1] = 10;


        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.print(list[i] + " ");
        }
        System.out.println("\n------------------------------------------------");

        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i] + " ");
        }
        System.out.println("\n------------------------------------------------");

        printArray(list4);

        System.out.println("\n------------------------------------------------");

        int[] list5 = {1, 2, 3, 4, 5};
        int[] newList = reverse(list5);
        printArray(newList);

        System.out.println("\n------------------------------------------------");

        int[][] matris = new int[6][6];

        matris[0][0] = 0;
        matris[2][3] = 839;
        System.out.print(matris[2][3] = 839);

        System.out.println("\n------------------------------------------------");

        int[][] matris2 = {{00, 01, 02}, {10, 11, 12}};

        System.out.println("matris[2][3]");
        System.out.println("matrisin dikey(column) uzunluğu: " + matris2.length);
        System.out.println("matrisin yatay(row) uzunluğu: " + matris2[0].length);

        System.out.println("------------------------------------------------");

        System.out.println("matris[3][4]");

        int[][] matris3 = new int[3][4];
        int number = 1;
        for (int i = 0; i < matris3.length; i++) {
            for (int j = 0; j < matris3[i].length; j++) {
                matris3[i][j] = number++;
            }
        }

        for (int i = 0; i < matris3.length; i++) {
            for (int j = 0; j < matris3[i].length; j++) {
                System.out.print(matris3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matrisin dikey(column) uzunluğu: " + matris3.length);
        System.out.println("matrisin yatay(row) uzunluğu: " + matris3[0].length);


    }
}
