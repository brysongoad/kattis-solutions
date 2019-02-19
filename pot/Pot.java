import java.math.BigInteger;
import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        BigInteger result = BigInteger.ZERO;
        int num;

        n = input.nextInt();
        for (; n > 0; n--) {
            num = input.nextInt();
            result = result.add(( BigInteger.valueOf(num/10).pow(num%10) ));
        }
        System.out.println(result);
        input.close();
    }
}
