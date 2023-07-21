// Question 2: Find missing numbers in array -
// Skill Mapping: Basic
// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.
// Sample input: arrNum = {1, 2, 4, 5, 6}
// Output: 3
// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}
// Output: 4, 7, 9, 12, 13

import java.util.Scanner;

class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < N; i++) {
            if(arr[i] - arr[i-1] == 1) {
                continue;
            }  
            if(arr[i] - arr[i-1] >= 2) {
                int k = arr[i] - arr[i-1] - 1;
                while(k > 0) { 
                    System.out.print(arr[i]-k+ " ");
                    k -= 1;
                }
            }  
            else {
                System.out.print(arr[i]-1 + " ");
            }
        }

    }
}