package toptal;

import java.util.Arrays;
import java.util.Collections;

public class FilterSolution {
    public static void main(String[] args) {
        int[] A = {5, 19, 8, 1};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {

        int polutionCount = 0;
        Integer[] numbers = new Integer[A.length];

        for (int i = 0; i < A.length; i++) {
            polutionCount += A[i];
            numbers[i] = A[i];
        }
        // count 33, expectation 16.5

        Arrays.sort(numbers, Collections.reverseOrder());

        float minExpected = (float)polutionCount / 2;
        int filterCount = 0;
        float achived = polutionCount;

        for (int i = 0; i < numbers.length; i++) {
            filterCount++;
            if (minExpected >= achived - (float) (numbers[i] / 2)) {
                return filterCount;
            }
            achived -= (float) numbers[i] / 2;
            if(i+1 < numbers.length && achived>minExpected){
                filterCount++;
                achived -= (float) numbers[i] / 2;
                if (minExpected >= achived - (float) (numbers[i] / 2)) {
                    return filterCount;
                }
            }
        }

        return filterCount;
    }
}
