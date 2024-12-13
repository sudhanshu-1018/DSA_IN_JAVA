import java.util.*;

public class ArrayList_pair_sum {
    public static boolean pairSum(ArrayList<Integer> list, int tar) {
        int size = list.size();
        int left = 0;
        int right = size - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == tar) {
                return true;
            } else if (sum < tar) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, 5)); // Output: true
    }
}
