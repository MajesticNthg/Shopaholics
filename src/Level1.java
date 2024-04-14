import java.util.Arrays;

public class Level1 {
    public static int MaximumDiscount(int N, int [] price) {
        if (N < 3) return 0;
        int sumPrice = 0;
        int[] sortPrice = Arrays.copyOf(price, N);
        Arrays.sort(sortPrice);

        for (int x = N - 3; x >= 0; x -= 3) {
            sumPrice += sortPrice[x];
        }

        return sumPrice;
    }
}

