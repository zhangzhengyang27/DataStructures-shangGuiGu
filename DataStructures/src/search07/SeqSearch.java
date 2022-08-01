package search07;

public class SeqSearch {

    // 这里我们实现的线性查找是找到一个满足条件的值，就返回
    public static int seqSearch(int[] arr, int value) {
        // 线性查找是逐一比对，发现有相同值，就返回下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
