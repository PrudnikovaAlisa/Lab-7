public class MyBox<T extends Comparable<T>> {

    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public int compare(MyBox<T> otherBox) {
        return this.item.compareTo(otherBox.get());
    }
}
