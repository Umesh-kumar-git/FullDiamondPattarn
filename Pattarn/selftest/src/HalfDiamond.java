import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1 ; i<=N;i++){

            for (int j = 1; j<=N-i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i+(i-1);k++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}