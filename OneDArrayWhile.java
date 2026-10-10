import java.util.Scanner;

public class OneDArrayWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i = 0;
        while (i < n) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Array elements:");
        i = 0;
        int sum = 0;
        while (i < n) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            sum += arr[i];
            i++;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
