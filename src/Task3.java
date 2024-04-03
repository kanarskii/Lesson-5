import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0 || i == 0){
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = number++;
                }
            }else{
                for (int j = array[i].length - 1; j >= 0; j--){
                    array[i][j] = number++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
