package Advanced_Generics2_ArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(13, 69);
        for (Integer integer : arr
             ) {
            System.out.println(integer);
        }
    }
}
