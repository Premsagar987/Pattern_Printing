import java.util.Scanner;

public class AlphabetSquare {
    // ABCDE
    // ABCDE
    // ABCDE

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i= 1; i<=row; i++){
            for (int j = 1;j<=col; j++){
                System.out.println("A B C D");
            }
        }
        
        
    }
}
