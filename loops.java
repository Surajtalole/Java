import java.util.*;

public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < 11; i++) {
            System.out.println(i * n);
        }

    }
}