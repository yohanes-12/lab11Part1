import java.util.Arrays;

public class ArrayFlattener {

    public int[] flatterArray(int[][] arr) {
        if (arr == null) {
            return null;
        }
        return Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
