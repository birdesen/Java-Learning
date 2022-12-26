public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n-------------------------------------");
        int sum = 0;
        for (int i : list) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("      Toplamı: " + sum);

        System.out.println("\n-------------------------------------");

        String[] cars = {"BMW", "Mercedes", "Audi"};
        for (String str : cars) {
            System.out.print(str + " ");
        }

        System.out.println("\n-------------------------------------");

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
