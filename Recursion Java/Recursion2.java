public class Recursion2{
    public static void toweerofHanoi(int n,String src, String helper,String des){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+des);
            return;
        }
        toweerofHanoi(n-1,src,des,helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + des);
        toweerofHanoi(n-1,helper,src,des);
    }
    public static void main(String args[]){
        int n=3;
        toweerofHanoi(n,"S","H","D");
    }
}