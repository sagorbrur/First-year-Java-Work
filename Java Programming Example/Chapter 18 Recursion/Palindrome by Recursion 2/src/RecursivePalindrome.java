
public class RecursivePalindrome {

	public static void main(String[] args) {
		System.out.println("Is moon a Palindrome? " + isPalindrome("moon"));
		System.out.println("Is noon a Palindrome? " + isPalindrome("noon"));
		System.out.println("Is a a Palindrome? " + isPalindrome("a"));
		System.out.println("Is aba a Palindrome? " + isPalindrome("aba"));

	}
	
	public static boolean isPalindrome(String s){
		return isPalindrome(s,0,s.length()-1);
	}
	private static boolean isPalindrome(String s, int low, int high){
		if(high<=low)//base case
			return true;
		else if(s.charAt(low)!=s.charAt(high))//base case
			return false;
		else
			return isPalindrome(s,low+1,high-1);
	}

}
