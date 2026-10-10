import java.util.Scanner;

public class StackOperations {
    static int[] stack = new int[5];
    static int top = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (top == stack.length - 1) System.out.println("Stack Overflow");
                    else {
                        System.out.print("Value: ");
                        stack[++top] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (top == -1) System.out.println("Stack Underflow");
                    else System.out.println("Popped: " + stack[top--]);
                    break;
                case 3:
                    if (top == -1) System.out.println("Stack is empty");
                    else System.out.println("Top element: " + stack[top]);
                    break;
                case 4:
                    if (top == -1) System.out.println("Stack is empty");
                    else {
                        System.out.println("Stack (top to bottom):");
                        for (int i = top; i >= 0; i--) System.out.println(stack[i]);
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
