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
        System.out.println(c1.get(3));
    }
}
