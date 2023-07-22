import java.io.*;
import java.util.*;

/*In Hackerrank I used class name is given default as Solution. I'm changing it to JavaSubarray to match file name*/
public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            int tot = arr[i];
            if (tot < 0){
                count += 1;
            }
            for(int j = i+1;j<n;j++){
                tot += arr[j];
                if (tot < 0){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
