// Question 3: Find the count of singulars in array -
// Skill Mapping: Expert
// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.
// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}
// Output: Count of singular socks = 3
// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left
// Socks Id - 20: total count 3 => One pair of socks - 1 singular left
// Socks Id - 30: total count 1 => No pair of socks - 1 singular left
// Socks Id - 50: total count 1 => No pair of socks - 1 singular left
// So, Total number of Singular socks = 3

import java.util.Scanner;

class CountSingulars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrNum = new int[N];
        for(int i = 0; i < N; i++) {
            arrNum[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = i+1; j < N; j++) {
                if(arrNum[i] == arrNum[j]) {
                    count += 1;
                }
            }
            if(count % 2 == 0) {
                result += 0;
            }
            else {
                result += 1;
            }
        }
        System.out.print(result);

    }
}
