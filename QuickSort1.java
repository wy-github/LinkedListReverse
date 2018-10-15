import java.util.Arrays;
import java.util.Stack;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,4,8,6};
        sort(a,0,a.length-1);
    }

    public  static void sort(int[] array,int left,int right) {
        Stack<Integer> stack = new Stack();
        if (left < right) {
            stack.push(right);
            stack.push(left);
            while (!stack.isEmpty()) {
                int start = stack.pop();
                int end = stack.pop();
                int key = partition(array,start,end);
                if(start < key-1){
                    stack.push(key-1);
                    stack.push(start);
                }
                if(right > key){
                    stack.push(right);
                    stack.push(key+1);

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = a[left];
        while (left < right) {
            while (left < right && a[right] >= pivot)
                right--;
            a[left] = a[right];
            while (left < right && a[left] <= pivot)
                left++;
            a[right] = a[left];
        }
        a[left] = pivot;
        return left;
    }

}
