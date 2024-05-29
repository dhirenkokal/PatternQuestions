import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the Number of rows");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SquarePattern(n);
        sc.close();
    }

    public static void SquarePattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
