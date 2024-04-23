public class ArrayReverse {

    private final ArrayFlattener arrayFlattener;

    public ArrayReverse(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] reverseArray(int[][] arr) {
        if (arr == null) {
            return null;
        }
        int[] flatArray = arrayFlattener.flatterArray(arr);
        int[] reversedArray = new int[flatArray.length];
        for (int i = 0; i < flatArray.length; i++) {
            reversedArray[i] = flatArray[flatArray.length - 1 - i];
        }
        return reversedArray;
    }


}
