import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class FunHouse2 {

    public static void main (String[] args) {
        char[][] house;
        int w,l;
        int x = 0;
        int y = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        int direction = 0;

        w = input.nextInt();
        l = input.nextInt();
        while (w != 0) {
            input.nextLine();
            house = new char[l][w];
            num++;

            for (int i = 0; i < l; i++) {
                house[i] = input.nextLine().toCharArray();
            }

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < w; j++) {
                    if (house[i][j] == '*') {
                        x = j;
                        y  = i;
                        break;
                    }
                }
            }
            if (x == 0) direction = 1;
            if (x == (w-1)) direction = 3;
            if (y == 0) direction = 2;
            if (y == (l-1)) direction = 0;

            while (house[y][x] != 'x') {
                if (direction == 0) y--;
                else if (direction == 1) x++;
                else if (direction == 2) y++;
                else x--;

                if (house[y][x] == '/') {
                    if (direction == 0) direction = 1;
                    else if (direction == 1) direction = 0;
                    else if (direction == 2) direction = 3;
                    else direction = 2;
                }
                if (house[y][x] == '\\') {
                    if (direction == 0) direction = 3;
                    else if (direction == 1) direction = 2;
                    else if (direction == 2) direction = 1;
                    else direction = 0;
                }
            }
            house[y][x] = '&';

            System.out.println("HOUSE " + num);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(house[i][j]);
                }
                System.out.println();
            }


            w = input.nextInt();
            l = input.nextInt();
        }
        input.close();
    }
}
