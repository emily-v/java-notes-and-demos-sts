package practice;

public class Palindrome {

	public static void main (String [] args) {
//		System.out.println(cleanString("A man a plan a canal Panama"));
		System.out.println(longestPalindrome(cleanString("A man a plan a canal Panama")));
	}
	
	
	public static String cleanString (String string) {
		String clean = string.toLowerCase().replaceAll("\\s", "");
		return clean;
	}
	
	public static boolean isPalindrome (String string) {
		String reverse = new StringBuilder(string).reverse().toString();
		return string.equals(reverse);
	}
	
	public static String longestPalindrome (String string2) {
		String longestPal = "";
		
		for (int i=0; i<string2.length(); i++) {
			String sub = string2.substring(i);
			for (int j=sub.length(); j >=0; j--) {
				String subSub = sub.substring(0, j);
				if (subSub.length() <=1) continue;
				if (isPalindrome(subSub)) {
					if (subSub.length() > longestPal.length()) {
						longestPal = subSub;
					}
				}
			}
		}
		
		return longestPal;
	}
	
//	public static int longestPalindromeCount (String string) {
//		int longestPal = 0;
//		
//		for (int i=0; i<string.length(); i++) {
//			String sub = string.substring(i);
//			for (int j=sub.length(); j >=0; j--) {
//				String subSub = sub.substring(0, j);
//				if (subSub.length() <=1) continue;
//				if (isPalindrome(subSub)) {
//					if (subSub.length() > longestPal) {
//						longestPal = subSub.length();
//					}
//				}
//			}
//		}
//		
//		return longestPal;
//	}
	
}
