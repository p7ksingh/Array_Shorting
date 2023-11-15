import java.util.Arrays;

public class ArrayShorting {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 40, 20, 5, 10 };
        Arrays.stream(arr).distinct().forEach(
                (x) -> System.out.println(x));
System.out.println("==".repeat(20));
        long count = Arrays.stream(arr).count();
        System.out.println(count);
        System.out.println("==".repeat(20));
        Arrays.stream(arr).sorted().forEach(
                (x) -> {
                    System.out.println(x);
                });

    }
}