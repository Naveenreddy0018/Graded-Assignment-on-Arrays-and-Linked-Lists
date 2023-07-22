import java.io.*;
import java.util.*;
/*In Hackerrank I used class name which is given default as Solution. I'm changing it to JavaDequeue to match file name*/
public class JavaDequeue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        long max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if( i >= m-1){
                max = Math.max(max, new HashSet<>(deque).size());
                deque.remove();
            }
            if( max == m) {
                break;
            }
        }
        System.out.println(max);
    }
}
