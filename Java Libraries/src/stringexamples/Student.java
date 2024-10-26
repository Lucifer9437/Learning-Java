package stringexamples;

public class Student {
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);  //Implicitly
		System.out.println(s.toString());  //Explicitly
		System.out.println("-----------");
		
		
		System.out.println(s.hashCode());
		System.out.println("-----------");
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
	}

}