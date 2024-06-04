import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the Number of rows");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TrianglePatternStars(n);
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


    public static void InvertedRightAngledTrianglePatternNumbers(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n+1-i; j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }

    public static void TrianglePatternStars(int n){
        for(int i = 0; i < n ; i++){
            
            //Print Spaces
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }

            //Print Stars
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }

            //Print Spaces
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
