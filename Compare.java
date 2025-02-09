package Exp1;

public class Compare {
    
    public static int iterativeF(int n){ 

// Base Cases 
    if(n == 0){ 
        return 0; 
    } 
    else if(n == 1){ 
        return 2; 
    } 
    if(n == 2){ 
        return 4; 
    } 
//Initialize loop values 
    int result = 0; 
    int last  = 0; 
    int second = 2; 
    int first = 4; 
 
// Iterative loop from 3 to n 
// Using the values from the three most recent  
// results, compute the next term, up to the  
// term requested in the method call. 
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

    public static void main(String[]args) {
        
    }
}
