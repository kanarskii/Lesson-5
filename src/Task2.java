public class Task2 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if(i == 0 || i % 2 == 0){
                    if(j % 2 == 0){
                        chessboard[i][j] = "W";
                    }else {
                        chessboard[i][j] = "B";
                    }
                }
                if(i % 2 != 0){
                    if(j % 2 == 0){
                        chessboard[i][j] = "B";
                    }else {
                        chessboard[i][j] = "W";
                    }
                }
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
