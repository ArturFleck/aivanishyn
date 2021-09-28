package homework_12;

public class CustomCollectionImpl implements CustomCollection {

    private Collection first;
    private Collection last;

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        System.out.print("first>>>last: ");
        Collection current = first;
        while (current != null) {
            current.disp();
            current = current.next;
        }
        System.out.println();
    }


    @Override
    public boolean add(String str) {
        Collection newCollection = new Collection(str);
        if (isEmpty()) {
            first = newCollection;
            //last = newCollection;
        } else {
            last.next = newCollection;
            newCollection.previous = last;
        }
        last = newCollection;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {
        Collection current = first;
        String data = null;
        int counter = 1;
        while (current != null) {
            if (counter == index)
                data = current.data;
            counter++;
            current = current.next;
        }
        return data;
    }

    @Override
    public boolean contains(String str) {
        boolean answer = false;
        if (isEmpty()) {
            return false;
        } else {
            Collection current = first;
            while (current != null) {
                if (current.data == str) {
                    answer = true;
                }
                current = current.next;
            }
        }
        return answer;
    }

    @Override
    public boolean clear() {
        first = null;
        last = null;
        return true;
    }

    @Override
    public void size() {
        int counter = 0;
        if (isEmpty()) {
            counter = 0;
        } else {
            Collection current = first;
            while (current != null) {
                counter++;
                current = current.next;
            }
        }
        System.out.println("Elements in List is: " + counter);
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean equals(Collection coll) {
        return false;
    }


}

class Collection {
    public String data;
    public Collection next;
    public Collection previous;

    public Collection(String str) {
        data = str;
    }

    public void disp() {
        System.out.print(data + " ");
    }

}
