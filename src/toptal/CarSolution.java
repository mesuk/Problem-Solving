package toptal;

import java.util.Arrays;
import java.util.Collections;

public class CarSolution {
    public static void main(String[] args) {
        int[] P = {1, 4, 1};
        int[] S = {1, 5, 1};
        System.out.println(solution(P, S));

    }

    public static int solution(int[] P, int[] S) {

        int peopleCount = 0;
        for (int i = 0; i < P.length; i++) {
            peopleCount += P[i];
        }

        // Sort Seat array descending
        Integer[] seats = new Integer[S.length];

        for (int i = 0; i < S.length; i++) {
            seats[i]= S[i];
        }

        Arrays.sort(seats, Collections.reverseOrder());

        for (int i = 0; i < seats.length; i++) {
            if (peopleCount - seats[i] <= 0) {
                return i + 1;
            }
            peopleCount -= seats[i];
        }
        return 0;
    }
}
