package homework_11;

public class StringCollectionImpl implements StringCollection {
    private String[] array = new String[0];

    @Override
    public String get(int index) {
        if (array.length - 1 >= index) {
            return array[index];
        } else {
            return null;
        }
    }

    @Override
    public boolean add(String str) {
        String[] newArr = new String[array.length + 1];
        for (int x = 0; x < array.length; x++) {
            newArr[x] = array[x];
        }
        newArr[newArr.length - 1] = str;
        this.array = newArr;
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return this.array.length;
    }
}
