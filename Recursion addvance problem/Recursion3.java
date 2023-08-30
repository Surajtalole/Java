public class Recursion3{
    public static int placeTiles(int n,int m){
        if(n == m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        int verticalPlacement = placeTiles(n-m,m);
        int horPlacements = placeTiles(n-1,m);
        return verticalPlacement + horPlacements;
    }

    public static void main (String args[]){
        int n =3, m=3;
        System.out.println(placeTiles(n,m));
    }
}