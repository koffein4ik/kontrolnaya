package Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3, 5, 7, 8};
        CustomIterator<Integer> customIterator = new CustomIterator<>(Arrays.asList(
                Arrays.stream(arr1).iterator(),
                Arrays.stream(arr2).iterator(),
                Arrays.stream(arr3).iterator())
        );
        while (customIterator.hasNext()) {
            System.out.print(customIterator.next() + " ");
        }

        System.out.println();

        String[] arr4 = {"Hello", "world"};
        String[] arr5 = {"My", "name", "is"};
        String[] arr6 = {"Anna"};

        CustomIterator<String> stringCustomIterator = new CustomIterator<>(Arrays.asList(
                Arrays.stream(arr4).iterator(),
                Arrays.stream(arr5).iterator(),
                Arrays.stream(arr6).iterator())
        );
        while (stringCustomIterator.hasNext()) {
            System.out.print(stringCustomIterator.next() + " ");
        }
    }


}
