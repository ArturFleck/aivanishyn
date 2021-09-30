package homework_12;

public class TestCollectionImpl {

    public static void main(String[] args) {
        checkOperations();
    }
    private static void checkOperations(){
        CustomCollection c1 = new CustomCollectionImpl();
        c1.add("first");
        c1.add("second");
        c1.add("third");
        c1.display();
        System.out.println(c1.size());

        System.out.println("----------------------------------------");

        c1.clear();
        System.out.println(c1.size());
        c1.display();

        System.out.println("----------------------------------------");

        c1.add("monday");
        c1.add("tuesday");
        c1.add("wednesday");
        c1.add("thursday");
        c1.add("friday");
        c1.add("saturday");
        c1.add("sunday");
        System.out.println(c1.size());
        c1.display();
        System.out.println(c1.contains("friday"));
        System.out.println(c1.get(3));
        c1.clear();

        System.out.println("----------------------------------------");

        c1.addAll(new String[]{"Some","Nice","TEXT","are","laying","in","HERE","!!!"});
        c1.display();
        System.out.println(c1.size());
        c1.delete(1);
        c1.display();
        System.out.println(c1.size());
        c1.delete(7);
        c1.display();
        System.out.println(c1.size());
        c1.delete(3);
        c1.display();
        System.out.println(c1.size());
        c1.delete("in");
        c1.display();
        System.out.println(c1.size());

        System.out.println("----------------------------------------");

        CustomCollection c2=new CustomCollectionImpl();
        CustomCollection c3=new CustomCollectionImpl();
        c2.addAll(new String[]{"Some","Nice","TEXT","are","laying","in","HERE","!!!"});
        c3.addAll(new String[]{"Give","Me","Back","My","Cookie"});
        System.out.println(c2.size());
        System.out.println(c3.size());
        c2.addAll(c3);
        System.out.println(c2.size());
        c2.display();

        System.out.println("----------------------------------------");

        System.out.println(c2.equals(c2));

        System.out.println("----------------------------------------");
        CustomCollection c4 = new CustomCollectionImpl();
        c4.addAll(new String[]{"Some","Nice","TEXT","are","laying","In","HERE","!!!"}); // 'In' from big letter I

        System.out.println(c2.equals(c4));

    }
}
