import java.util.Scanner;

public class Main {
    int max;
    int[] arr;
    int tos = -1;

    public Main(int size) {
        this.max = size;
        arr = new int[max];
    }

    public void push(int data) {
        if (tos == max - 1) {
            System.out.println("Overflow");
            return;
        }
        tos++;
        arr[tos] = data;
        System.out.println("Pushed: " + data);
    }

    public void pop() {
        if (tos == -1) {
            System.out.println("Underflow");
            return;
        }
        int popped = arr[tos];
        System.out.println("Popped: " + popped);
        tos--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        Main stack = new Main(size);

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("add value in push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
