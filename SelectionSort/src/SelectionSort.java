import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);
        System.out.println(Arrays.toString(selectionSort(arr).toArray()));
    }

    public static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        int length = arr.size();
        for (int i = 0; i < length; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }
        return newArr;
    }
}
