package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollections {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.addAll(list1);
        System.out.println(list2);
/*        System.out.println(list1.add(3));
        System.out.println(list1.size());*/

        Object [] arr = list2.toArray();
        System.out.println();
    }
}

// https://youtu.be/Dm6ybcQmGpw?t=1050