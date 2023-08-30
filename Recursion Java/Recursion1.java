public class Recursion1{
    public static void printNumb(int n){
        if( n==6){
            return;
        }
        System.out.println(n+1);
        printNumb(n);
    } 
    public static void main(String args[]){
        int n=1;

    }
}