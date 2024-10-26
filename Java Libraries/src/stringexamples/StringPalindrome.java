package stringexamples;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String s = "MADAM";//Original String
		
		char [] ch =s.toCharArray();// Convert String into Array
		
		String rev = "";//Reverse String
		
		for(int i=ch.length-1; i>=0; i--) {
			rev = rev + ch[i];
		}
		
		System.out.println("Original String: "+s);
		System.out.println("Reverse String: "+rev);
		
		if(s.equals(rev)) {
			System.out.println("Palindrone");
		}
		else {
			System.out.println("Not Palindrone");
		}

	}

}