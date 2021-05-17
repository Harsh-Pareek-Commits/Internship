package regularexp;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Myexpression {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		while (true) {

			String pattern1 = "[A-Z][1-4]{1}[0-9]{6}";
			System.out.println("PATTERN 1:A-Z or 1-4 followed by 6 character long numeric value ");
			System.out.println("Enter text to check first expression:");
			String str1 = sc.nextLine();
			if (Pattern.matches(pattern1, str1)) {
				System.out.println(str1 + " matches the first pattern");
			} else {
				System.out.println("No match found");
			}

			String pattern2 = "[A-Z]{3}[0-9]{4}";
			System.out.println(
					"PATTERN 2:any 3 character long string from A-Z  followed by 4 character long numeric value ");
			System.out.println("Enter text to check second expression:");
			String str2 = sc.nextLine();
			if (Pattern.matches(pattern2, str2)) {
				System.out.println(str2 + " matches the second pattern");
			} else {
				System.out.println("No match found");
			}

		}
	}
}
