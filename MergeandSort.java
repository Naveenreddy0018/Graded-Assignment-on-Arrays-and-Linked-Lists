// Question 5: Merge and Sort the elements in two Linked-List
// Skill Mapping: Intermediate
// Description: Consider two Linked-List with N number of integers in Data-Node respectively.
// Task 1- WAP in Java to merge both Linked-Lists.
// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.
// Sample input: Linked-List-1:- 25->35->12->4->36->48
// Linked-List-2:- 8->32->22->45->63->49
// Output:- 4->8->12->22->25->32->35->36->45->48->49->63

import java.util.Scanner;

class MergeandSort {
    class Node {
        int data;
        Node head;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
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
        System.out.println();
    }

    public void sort() {
        Node node = head;
        while(node != null) {
            Node temp = node.next;
            while(temp != null) {
                if(node.data > temp.data) {
                    int current = node.data;
                    node.data = temp.data;
                    temp.data = current;
                }
                temp = temp.next;
            }
            node = node.next;
        }
    }

    public void merge(MergeandSort list2) {
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = list2.head;
    }

    public static void main(String[] args) {
        MergeandSort merge_sort1 = new MergeandSort();
        MergeandSort merge_sort2 = new MergeandSort();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            merge_sort1.insert(sc.nextInt());
        }
        merge_sort1.display();
        for(int i = 0; i < N; i++) {
            merge_sort2.insert(sc.nextInt());
        }
        merge_sort2.display();
        merge_sort1.merge(merge_sort2);
        merge_sort1.sort();
        merge_sort1.display();
    }
}