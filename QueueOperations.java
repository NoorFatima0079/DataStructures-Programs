import java.util.Scanner;

public class QueueOperations {
    static int[] q = new int[5];
    static int front = 0, rear = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (rear == q.length - 1) System.out.println("Queue is Full");
                    else {
                        System.out.print("Value: ");
                        q[++rear] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (front > rear) System.out.println("Queue is Empty");
                    else System.out.println("Removed: " + q[front++]);
                    break;
                case 3:
                    if (front > rear) System.out.println("Queue is Empty");
                    else {
                        System.out.print("Queue: ");
                        for (int i = front; i <= rear; i++) System.out.print(q[i] + " ");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
