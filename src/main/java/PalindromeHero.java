import java.util.Random;

public class PalindromeHero {
	public boolean isPalindrome(String text) {
		return false;
	}

	public boolean isPalindromeIgnoreCase(String text) {
		return isPalindrome(text.toLowerCase());
	}

	public String generatePalindrome(int length) {
		return null;
	}

	private String randomChar() {
		return String.valueOf((char) ('a' + new Random().nextInt(26)));
	}
}
