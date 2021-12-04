package Lecture5.Example5;

public class GenValue<T> {
    private T value;

    public GenValue(T val) {
        value = val;
    }

    public void setValue(T val) {
        value = val;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GV(" + value.toString() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GenValue) {
            GenValue other = (GenValue) obj;
            return other.value.equals(value);
        }
        return false;
    }
}
