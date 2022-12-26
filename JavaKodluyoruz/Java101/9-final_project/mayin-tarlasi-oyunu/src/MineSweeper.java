import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] map;
    String[][] game;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

        this.map = new String[rowNumber][colNumber];
        this.game = new String[rowNumber][colNumber];
    }

    void map() {
        System.out.println("Mayınların konumu: ");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                this.map[i][j] = "-";
            }
        }
        int mine = (this.rowNumber * this.colNumber) / 4;
        while (mine > 0) {
            int rowMinePlace = (int) (Math.random() * (this.rowNumber));
            int colMineSpace = (int) (Math.random() * (this.colNumber));
            if (this.map[rowMinePlace][colMineSpace] == "*") {
                mine++;
            }
            this.map[rowMinePlace][colMineSpace] = "*";
            mine--;
        }

        toPrint(this.map);

        for (int i = 0; i < this.game.length; i++) {
            for (int j = 0; j < this.game[0].length; j++) {
                this.game[i][j] = "-";
            }
        }
    }

    void run() {
        Scanner input = new Scanner(System.in);
        map();

        int row, col;
        boolean cont = true;

        while (cont == true) {
            System.out.println("=========================");
            toPrint(this.game);
            System.out.print("Satır giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun giriniz: ");
            col = input.nextInt();
            if (this.map[row][col] == "*") {
                cont = false;
                System.out.println("Game over!");

            } else {
                int count = 0;
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if ((i >= 0 && i < this.game[0].length) && (j >= 0 && j < this.game[0].length)) {
                            if (this.map[i][j] == "*") {
                                count++;
                            }
                        }
                    }
                }
                this.game[row][col] = String.valueOf(count);
            }
            if (isWin() == true) {
                toPrint(this.game);
                System.out.println("Tebrikler kazandınız!");
                cont = false;
            }
        }
    }

    boolean isWin() {
        for (int i = 0; i < this.game.length; i++) {
            for (int j = 0; j < this.game[0].length; j++) {
                if (this.map[i][j] == "-") {
                    if(this.game[i][j] == "-"){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    void toPrint(String arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

// hiç yardım almadım ama 3 saat uğraştım :))
