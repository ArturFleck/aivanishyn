package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollections {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.add(3));
        System.out.println(list.size());
    }
}
