package PatternPrinting;

import java.util.Scanner;

public class HolloSquare{
    public static void main (String args[]){
        System.out.println("enter the number of row and column:");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i =1; i<=row ;i++){
            for (int j = 1; j<=col; j++){

                if (i == 1 || i == row || j == 1|| j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                 
            }
            System.out.println(" ");
        }

        sc.close()

        
    }
}

   
