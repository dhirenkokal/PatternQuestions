import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the Number of rows");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RightAngledTrianglePatternNumbers2(n);
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

    public static void RightAngledTrianglePatternStars(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void RightAngledTrianglePatternNumbers(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void RightAngledTrianglePatternNumbers2(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    
    public static void InvertedRightAngledTrianglePatternStars(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
