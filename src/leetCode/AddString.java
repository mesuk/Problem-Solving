package leetCode;

public class AddString {
    public static void main(String[] args) {
//        https://leetcode.com/problems/add-strings/
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int n1C = num1.length() - 1;
        int n2C = num2.length() - 1;
        int sum, carry = 0;

        while (n1C >= 0 || n2C >=0) {
            sum = carry;
            if (n1C >= 0) {
                sum += num1.charAt(n1C--) - 48;
            }
            if (n2C >= 0) {
                sum += num2.charAt(n2C--) - 48;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
