package practice1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String str = scanner.next();
		if (isPalindrome(str)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
	public static boolean isPalindrome(String str) {
		String rev = "";
		
		boolean ans = false;
		
		for (int i = str.length() - 1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
}
