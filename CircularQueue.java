import java.util.Scanner;

public class CircularQueue {
    static int[] q = new int[5];
    static int front = 0, rear = -1, count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count == q.length) System.out.println("Queue is Full");
                    else {
                        System.out.print("Value: ");
                        rear = (rear + 1) % q.length;
                        q[rear] = sc.nextInt();
                        count++;
                    }
                    break;
                case 2:
                    if (count == 0) System.out.println("Queue is Empty");
                    else {
                        System.out.println("Removed: " + q[front]);
                        front = (front + 1) % q.length;
                        count--;
                    }
                    break;
                case 3:
                    if (count == 0) System.out.println("Queue is Empty");
                    else {
                        System.out.print("Queue: ");
                        for (int i = 0; i < count; i++)
                            System.out.print(q[(front + i) % q.length] + " ");
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
