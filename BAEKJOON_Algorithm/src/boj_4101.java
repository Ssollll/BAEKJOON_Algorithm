import java.util.*;

public class boj_4101 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A == 0 && B == 0) {
				break;
			}
			if(A > B) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}