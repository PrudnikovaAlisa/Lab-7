public class Main {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T extends Comparable<T>> T findMax(
            MyBox<T> box1, MyBox<T> box2) {

        return box1.get().compareTo(box2.get()) > 0
                ? box1.get()
                : box2.get();
    }

    public static void main(String[] args) {

        MyBox<Integer> integerBox = new MyBox<>();
        integerBox.add(10);
        System.out.println("Integer Box: " + integerBox.get());

        MyBox<String> stringBox = new MyBox<>();
        stringBox.add("Hello");
        System.out.println("String Box: " + stringBox.get());

        MyBox<Double> doubleBox = new MyBox<>();
        doubleBox.add(5.5);
        System.out.println("Double Box: " + doubleBox.get());

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "A", "B", "C" };
        Double[] doubleArray = { 1.1, 2.2, 3.3 };

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        MyBox<Integer> box1 = new MyBox<>();
        box1.add(15);

        MyBox<Integer> box2 = new MyBox<>();
        box2.add(25);

        Integer max = findMax(box1, box2);

        System.out.println("Max value: " + max);
    }
}
