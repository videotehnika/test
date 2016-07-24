import java.util.Arrays;

public class Prog {
    public static void main(String[] args) {

        int[] bubles = {12, 3, 45, 30, 20, 10};
        for (int i = 0; i < bubles.length - 1; i++) {
            if (bubles[i] > bubles[i + 1]) {
                swap (bubles[], i, i + 1);
            }
        }
        System.out.println(bubles);

        Budget office = new Budget(10);


    }
}
