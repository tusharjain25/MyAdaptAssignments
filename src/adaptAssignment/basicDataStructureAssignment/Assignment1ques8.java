package adaptAssignment.basicDataStructureAssignment;

import java.util.Arrays;

public class Assignment1ques8 {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
