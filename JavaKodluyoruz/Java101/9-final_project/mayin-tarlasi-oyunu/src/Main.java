import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- - - - Mayın Tarlası Oyunu - - - -");
        System.out.print("Satır sayısı giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısı giriniz: ");
        int col = input.nextInt();

        MineSweeper mine = new MineSweeper(col,row);
        mine.run();





    }
}
