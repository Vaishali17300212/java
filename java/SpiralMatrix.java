import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 4; 
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++)
                System.out.print(m[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(m[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(m[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--)
                    System.out.print(m[i][left] + " ");
                left++;
            }
        }
        
    }
}



