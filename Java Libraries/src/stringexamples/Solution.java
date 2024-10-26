package stringexamples;

public class Solution {
	
	public static void main(String[] args) {
		
		String s = new String("A");
		System.out.println(s);
		System.out.println(s.toString());//override toString in String class
		System.out.println("------------");
		
		
		System.out.println(s.hashCode());//override hashCode in String class
		System.out.println("------------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);//compares addresses/references(Only in Sting class)
		System.out.println(s1.equals(s2));//compares data/content(Only in Sting class)

	}

}
