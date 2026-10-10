import java.util.Scanner;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node top = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Value: ");
                    Node n = new Node(sc.nextInt());
                    n.next = top;
                    top = n;
                    break;
                case 2:
                    if (top == null) System.out.println("Stack Underflow");
                    else {
                        System.out.println("Popped: " + top.data);
                        top = top.next;
                    }
                    break;
                case 3:
                    if (top == null) System.out.println("Stack is empty");
                    else System.out.println("Top element: " + top.data);
                    break;
                case 4:
                    if (top == null) System.out.println("Stack is empty");
                    else {
                        System.out.println("Stack (top to bottom):");
                        Node t = top;
                        while (t != null) {
                            System.out.println(t.data);
                            t = t.next;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
