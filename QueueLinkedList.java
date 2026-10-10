import java.util.Scanner;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node front = null, rear = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Value: ");
                    Node n = new Node(sc.nextInt());
                    if (rear == null) front = rear = n;
                    else {
                        rear.next = n;
                        rear = n;
                    }
                    break;
                case 2:
                    if (front == null) System.out.println("Queue is Empty");
                    else {
                        System.out.println("Removed: " + front.data);
                        front = front.next;
                        if (front == null) rear = null;
                    }
                    break;
                case 3:
                    if (front == null) System.out.println("Queue is Empty");
                    else {
                        System.out.print("Queue: ");
                        Node t = front;
                        while (t != null) {
                            System.out.print(t.data + " ");
                            t = t.next;
                        }
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
