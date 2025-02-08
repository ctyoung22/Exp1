package Exp1;

public class Compare {
    
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

    public static int recursiveF(int input) {

        return 0;
    }

    public static void main(String[]args) {
        
    }
}
