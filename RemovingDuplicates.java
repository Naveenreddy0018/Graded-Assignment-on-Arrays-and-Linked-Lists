// Question 6: Remove Duplicates from Linked-List
// Skill Mapping: Intermediate
// Description: Consider a Linked-List with N number of repeated integers in Data-Node.
// Task - WAP in Java to remove the repeated integer numbers from Linked-List.
// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5
// Output:- 2->5->12->3->1

import java.util.HashSet;
import java.util.Scanner;

class RemovingDuplicates {
    class Node {
        int data;
        Node next;
        Node head;
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        Node temp = head;
        if(head == null) {
            head = node;
        }
        else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void removeDuplicates() {
        if(head == null) {
            return;
        }
        HashSet<Integer> dup = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (dup.contains(current.data)) {
                previous.next = current.next;
            } else {
                dup.add(current.data);
                previous = current;
            }
            current = current.next;
        }

    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        RemovingDuplicates list = new RemovingDuplicates();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            list.insert(sc.nextInt());
        }
        list.removeDuplicates();
        list.display();
    }
}