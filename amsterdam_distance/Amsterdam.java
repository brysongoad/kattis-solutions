import java.util.Scanner;

public class Amsterdam {

    public static void main(String[] args) {
        int ax, ay, bx, by, m, n;
        double r, ringDist, centerDist;
        Scanner input = new Scanner(System.in);

        m = input.nextInt();
        n = input.nextInt();
        r = input.nextDouble();
        ax = input.nextInt();
        ay = input.nextInt();
        bx = input.nextInt();
        by = input.nextInt();

        ringDist = ((r/n) * Math.abs(ay-by)) + (Math.abs(ax-bx) * ( Math.PI * (r/n) * Math.min(ay, by) / m ));
        centerDist = ((r/n) * ay) + ((r/n) * by);
        System.out.println(Math.min(ringDist, centerDist));
    }
}
