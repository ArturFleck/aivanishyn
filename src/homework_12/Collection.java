package homework_12;

class Collection {
    public long dData;
    public Collection next;

    public Collection(long dd) {
        dData = dd;
    }

    public void display() {
        System.out.println(dData + " ");
    }
}

class FirstLastList {
    private Collection first;
    private Collection last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first != null);
    }

    public void insertFirst(long dd) {
        Collection newCollection = new Collection(dd);
        if (isEmpty()) {
            first = newCollection;
        } else {
            last.next = newCollection;
            last = newCollection;
        }
    }


    //return (key == null) ? 0 : value;


}