package homework_12;

public class TestCollectionImpl {

    public static void main(String[] args) {
        checkOperations();
    }
    private static void checkOperations(){
        CustomCollection c1 = new CustomCollectionImpl();
/*        c1.add("first");
        c1.add("second");
        c1.add("third");
        c1.display();
        c1.size();
        c1.clear();
        c1.size();
        c1.display();
        c1.add("monday");
        c1.add("tuesday");
        c1.add("wednesday");
        c1.add("thursday");
        c1.add("friday");
        c1.add("saturday");
        c1.add("sunday");
        c1.size();
        c1.display();
        System.out.println(c1.contains("friday"));
        System.out.println(c1.get(3));*/
        c1.clear();



        c1.addAll(new String[]{"Some","Nice","TEXT","are","laying","in","HERE","!!!"});
        c1.display();

        CustomCollection c2=new CustomCollectionImpl();
        CustomCollection c3=new CustomCollectionImpl();
        c2.addAll(new String[]{"Some","Nice","TEXT","are","laying","in","HERE","!!!"});
        c3.addAll(new String[]{"Give","Me","Back","My","Cookie"});
        c2.addAll(c3);
    }
}
