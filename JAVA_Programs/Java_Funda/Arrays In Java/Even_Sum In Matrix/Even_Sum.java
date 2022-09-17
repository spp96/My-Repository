package Question_2;

import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner matrix = new Scanner(System.in);
        System.out.println("Enter Rows");
        int N = matrix.nextInt();
        System.out.println("Enter Columns");
        int M = matrix.nextInt();
        int[][] arr = new int[N][M];
//        matrix.nextLine();
        for(int i =0;i< N ;i++){
            for(int j=0;j<M;j++){
                arr[i][j] = matrix.nextInt();
            }
        }

        for(int i =0;i< M ;i++){
            int sum = 0;
            for(int j=0;j<N;j++){
                if (arr[j][i]%2==0){
                    sum+=arr[j][i];
                }
            }
            System.out.println(sum);
        }
    }
}
