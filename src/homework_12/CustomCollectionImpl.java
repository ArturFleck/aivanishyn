package homework_12;

public class CustomCollectionImpl implements CustomCollection {
    private String[] array = new String[0];

    @Override
    public boolean add(String str) {
        return false;
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
        return null;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
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
