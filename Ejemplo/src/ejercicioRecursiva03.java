
public class ejercicioRecursiva03 {
	
	public static final char[] HEXADECIMAL = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	private static boolean esPalindromo(String str) {
		if (str.length() <= 1) return true;
		
		if (str.charAt(0) != str.charAt(str.length()-1)) return false;
		
		return esPalindromo(str.substring(1, str.length()-1));
		
	}
	private static String longAHexa(long n) {
		if(n==0) return "";
		
		int resto = (int) n % 16;
		
		return longAHexa(n/16) + HEXADECIMAL[resto];
	}
	
	public static void main(String[] args) {
		
		String s = "bbaaab";
		System.out.printf("\"%s\" : %b%n", s, esPalindromo(s));
		
	}

}
