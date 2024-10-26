package storingobjects;

public class Student {

	int age;

	Student(int age){
		this.age = age;
	}

	public static void main(String[] args) {

		Student s1 = new Student(20);
		Student s2 = new Student(25);

		Student[] s = {s1,s2};

		for(int i=0; i<s.length; i++) {
			System.out.println(" Age is "+s[i].age);

		}
	}

}
