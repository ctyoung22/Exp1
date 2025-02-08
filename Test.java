package Exp1;
import java.util.Scanner;
import java.timepackage;
import java.time.Duration;
import java.time.Instant;


public class Test {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer for variable n");
        int n = sc.nextInt();
        
        long starTime = System.nanoTime();
        iterativeF(n);
        long endTime = System.nanoTime();
        long executionTime = (endTime - starTime);

        long starTime2 = System.nanoTime();
        recursiveF(n);
        long endTime2 = System.nanoTime();
        long executionTime2 = (endTime2-starTime2);

        System.out.println("Recursive answers");
        System.out.println(iterativeF(n));
        System.out.println(recursiveF(n));

        System.out.println("Time elapsed: " + executionTime + " nanoSeconds");
        System.out.println("Time elapsed: " + executionTime2 + " nanoSeconds");

        sc.close();
    }
    
    public static int iterativeF(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 2;
        }
        if(n == 2){
            return 4;
        }

        int result = 0;
        int last  = 0;
        int second = 2;
        int first = 4;

        for(int i = 3; i <=n; i++){
            result = first + (i * second) - (2 * last) + 5;
            last = second;
            second = first;
            first = result;
        }
        return result; 
    }
   
    
    public static int recursiveF(int n) {
      //base case of n = 0, 1, and 2 returns 0, 2, and 4 respectively
      if(n == 0){
          return 0;
      }
      if(n == 1){
          return 2;
      }
      if(n == 2){
          return 4;
      }
      //recursively calls itself applying formula
      return recursiveF(n-1) + n*recursiveF(n-2) - 2*recursiveF(n-3) + 5;
    }

    
    
}
