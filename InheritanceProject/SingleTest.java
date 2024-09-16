package InheritanceProject;


public class SingleTest {
		public static void main(String[] args) {
			Person person=new Person("Anurag",22,'M');		
			System.out.println("Person "+person);
		
		Student student = new Student ("Jay",22,'M',101,73234,"Computer",90);
		System.out.println("Person "+student);


			
	}
}
class Person{
	
	private String name;
	private int age;
	private char gender ;
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
		
}

class Student extends Person{
	
	private int rollNumber;
	private int PRN;
	private String department;
	private int marks;
	private String subjects;
	public Student(String name, int age, char gender, int rollNumber, int pRN, String department, int marks) {
		super(name, age, gender);
		this.rollNumber = rollNumber;
		PRN = pRN;
		this.department = department;
		this.marks = marks;
		
		if(this.marks >= 90) this.subjects="Java";
		else if(this.marks >= 75 && this.marks<90) this.subjects="C++";
		else if(this.marks >= 60 && this.marks<75) this.subjects="Python";
		else if(this.marks >= 45 && this.marks<60) this.subjects="C";
	
	
		
	}
	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", rollNumber=" + rollNumber + ", PRN=" + PRN
				+ ", department=" + department + ", marks=" + marks + ", subjects=" + subjects + "]";
	}
	
	
	 
}
