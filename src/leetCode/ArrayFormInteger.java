package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
//        int[] num = {1, 2, 0, 0};
//        int k = 34;
        int[] num = {2, 1, 5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int sum = 0, carry = 0;
        int nPosition = num.length - 1;
        while (k > 0 || nPosition >= 0) {
            sum = carry;

            if (nPosition >= 0) {
                sum += num[nPosition--];
            }
            if (k > 0) {
                sum += k % 10;
                k = k / 10;
            }
            list.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            list.add(carry);
        }
        Collections.reverse(list);
        return list;

    }
}

