import java.util.Scanner;
//  using ascii value of a=97 and A=65
//  j + ascii value

public class LowerCaseALphabetPattern {
    public static void main (String args[]){
    System.out.println("enter the number of row and column:");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    for (int i = 0;i<row;i++){
        for (int j=1;j<=col;j++){
            System.out.print((char)(j +96)+"");
        }
        System.out.println();
    }
    

}    
}
