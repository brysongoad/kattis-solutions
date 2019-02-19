package practice;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
	Scanner	input = new Scanner(System.in);
		int n = 0;
		int answer = 0;
		int i = 1;
		while (input.hasNextInt()) {
			n = input.nextInt();
			
			answer =  (int)Math.ceil(((n+1)*Math.log10(3)) - (n*Math.log10(2))); 
			System.out.println("Case " + i + ": " + answer);
			i++;
		}
		input.close();
	}
}
