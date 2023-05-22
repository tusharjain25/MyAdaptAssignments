package adaptAssignment.genericsAssignment;

public class ques3 {
    public static <T> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {

        String[] str = { "a", "b", "c", "d", "e" , "f"};
        swap(str, 1, 4);

        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("------------");

        Integer[] arr = { 1, 2, 3, 4, 5, 6};
        swap(arr, 1, 4);

        for (Integer num : arr) {
            System.out.println(num);
        }


    }
}
