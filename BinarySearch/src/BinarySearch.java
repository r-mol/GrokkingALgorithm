import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        Collections.sort(list);


        System.out.println(binarySearch(list, 0, list.size() - 1, 5));
    }

    public static <K extends Comparable<K>> int binarySearch(List<K> list, int low, int high, K item) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            K guess = list.get(mid);

            if (guess.compareTo(item) == 0) {
                return mid;
            }
            if (guess.compareTo(item) > 0) {
                return binarySearch(list, low, mid - 1, item);
            } else {
                return binarySearch(list, mid + 1, high, item);
            }

        }
        return -1;
    }
}
