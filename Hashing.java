import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        //search
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("not");
        }

        System.out.println("the size of set is" + set.size());
        Iterator it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
