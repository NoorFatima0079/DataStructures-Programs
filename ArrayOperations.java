import java.util.Scanner;

public class ArrayOperations {
    static int[] arr = new int[50];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, pos, val;
        do {
            System.out.println("\n1.Insert 2.Delete 3.Search 4.Update 5.Display 6.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Position (0-" + n + "): ");
                    pos = sc.nextInt();
                    System.out.print("Value: ");
                    val = sc.nextInt();
                    if (pos < 0 || pos > n || n == arr.length) {
                        System.out.println("Invalid position");
                        break;
                    }
                    for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
                    arr[pos] = val;
                    n++;
                    break;
                case 2:
                    System.out.print("Position to delete: ");
                    pos = sc.nextInt();
                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position");
                        break;
                    }
                    for (int i = pos; i < n - 1; i++) arr[i] = arr[i + 1];
                    n--;
                    break;
                case 3:
                    System.out.print("Value to search: ");
                    val = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == val) {
                            System.out.println("Found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                case 4:
                    System.out.print("Position to update: ");
                    pos = sc.nextInt();
                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.print("New value: ");
                    arr[pos] = sc.nextInt();
                    break;
                case 5:
                    if (n == 0) System.out.println("Array is empty");
                    else {
                        System.out.print("Array: ");
                        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 6);
        sc.close();
    }
}
