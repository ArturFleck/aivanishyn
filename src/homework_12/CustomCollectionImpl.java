package homework_12;

import java.util.Objects;

public class CustomCollectionImpl implements CustomCollection {

    private Collection first;           // First element
    private Collection last;            // Last element

    public boolean isEmpty() {
        return first == null;
    }        // check if collection is empty

    public void display() {
        System.out.print("first>>>last: ");         // Printing from first to last
        Collection current = first;                 // taking first element
        while (current != null) {                   // cycling till the end of the List
            current.disp();                         // printing current element
            current = current.next;                 // going to the next element
        }
        System.out.println();                       // edding new line
    }

    public void deleteFirst() {
        //Collection temp = first;  // if i'm gonna return some value
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
    }

    public void deleteLast() {
        //Collection temp = last;  // if i'm gonna return some value
        if (first.next == null)
            first = null; // first --> null
        else
            last.previous.next = null;
        last = last.previous;
    }

    @Override                       // Each element is putting in the tail
    public boolean add(String str) {
        Collection newCollection = new Collection(str);
        if (isEmpty()) {        // checking if collection is empty
            first = newCollection;
        } else {
            last.next = newCollection;
            newCollection.previous = last;
        }
        last = newCollection;
        return true;
    }

    @Override                               // Each element putting in the tail
    public boolean addAll(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            Collection newCollection = new Collection(strArr[i]);
            if (isEmpty()) {        // checking if collection is empty
                first = newCollection;
            } else {
                last.next = newCollection;
                newCollection.previous = last;
            }
            last = newCollection;
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        boolean flag = false;
        if (strColl.size() == 0)
            flag = false;
        else {
            int counter = 1;
            int list = strColl.size();  // taking size of copying List
            while (counter <= list) {
                add(strColl.get(counter));  // taking each element into our list
                counter++;
            }
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean delete(int index) {
        boolean flag = false;
        if (isEmpty())
            flag = false;
        else {
            Collection current = first;
            //String data = null;  // if i'm gonna return some value
            int counter = 1;

            if (index == 1) {
                deleteFirst();
                flag = true;
            } else if (index == (size() + 1)) {
                flag = true;
                deleteLast();
            } else {
                while (current != null) {
                    if (counter == index) {
                        //data = current.data;  // if i'm gonna return some value
                        current.previous.next = current.next;
                        flag = true;
                        break;
                    }
                    counter++;
                    current = current.next;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean delete(String str) {
        boolean flag = false;
        if (isEmpty())
            flag = false;
        else {
            Collection current = first;
            int counter = 1;
            int index = 0;
            while (current != null) {
                if (Objects.equals(current.data, str)) {
                    index = counter;
                    break;
                }
                counter++;
                current = current.next;
            }

            delete(index);
            flag = true;
        }
        return flag;
    }

    @Override
    public String get(int index) {      // Elements start from 1 !!!
        Collection current = first;
        String data = null;
        int counter = 1;
        while (current != null) {
            if (counter == index)
                data = current.data;
            counter++;
            current = current.next;
        }
        if (data != null)
            return data;
        else
            return "Element is not in the scope";
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
    public int size() {
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
        return counter;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean equals(CustomCollection coll) {
        boolean flag = false;
        if (this.size()!=coll.size())   // first of all checking sizes
            flag=false;
        else                            // if sizes are equals we are gonna check values
        {
            int counter =1;
            while (counter<=this.size()){
                if (this.get(counter)==coll.get(counter))   // if values are equals
                    flag=true;
                else
                {
                    flag=false; // if just only one value is not equal Objects are not equals
                    break;
                }
                counter++;
            }
        }
        return flag;
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
//----------------------------------------------