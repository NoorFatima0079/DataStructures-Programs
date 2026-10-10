import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }

        System.out.println("\nMatrix:");
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
                sum += a[i][j];
            }
            System.out.println();
        }
        System.out.println("\nSum of all elements = " + sum);

        System.out.println("\nTranspose:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        sc.close();
    }
}
