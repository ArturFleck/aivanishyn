package homework_11;

public class StringCollectionImp implements StringCollection{
    private String[] array = new String[0];

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean add(String str) {
        String [] newArr = new String[array.length+1];
        for (int x=0; x<array.length; x++){
            newArr[x]= array[x];
        }
        newArr[newArr.length-1]=str;
        this.array = newArr;
        return true;
    }

    nullPointerException

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
