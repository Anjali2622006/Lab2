

import java.util.Scanner;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = next;
    }
}

public class List {
    Nodes head;

    
    public void printlist(int data) {
        Nodes newNode = new Nodes(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Nodes current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    
    public void LinkedList() {
        Nodes current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        List list = new List();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements to add: ");
        int n = in.nextInt();
    
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            list.printlist(data);
        }

        list.LinkedList();
        in.close();
    }
}