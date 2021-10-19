// *********************************************************************
//   References1.java
//
//   Illustrates aliases and references
// *********************************************************************


public class References1
{
    public static void main(String[] args)
    {
	Person person1 = new Person("Rachel", 6);
	Person person2 = new Person("Elly", 4);
	Person person3 = new Person("Sarah", 19);

	System.out.println("\nThe three original people...");
	System.out.println(person1 + ", " + person2 + ", " + person3);

	// Reassign people
	person1 = person2;
	person2 = person3;
	person3 = person1;


	System.out.println("\nThe three people reassigned...");
	System.out.println(person1 + ", " + person2 + ", " + person3);
	
	System.out.println();
	System.out.println("Changing the second name to Bozo...");
	person2.changeName("Bozo");
	System.out.println(person1 + ", " + person2 + ", " + person3);

	System.out.println();
	System.out.println("Changing the third name to Clarabelle...");
	person3.changeName("Clarabelle");
	System.out.println(person1 + ", " + person2 + ", " + person3);
	System.out.println();
	System.out.println("Changing the first name to Harpo...");
	person1.changeName("Harpo");
	System.out.println(person1 + ", " + person2 + ", " + person3);
	
	// person2 가 현재의 person1을, person3이 현재의 person2를, 
	// person1이 현재의 person3을 나타내도록 할당
	Person person11 = person1;
	Person person22 = person2;
	Person person33 = person3;
	person2 = person11;
	person3 = person22;
	person1 = person33;
	
	System.out.println();
	System.out.println("The three people reassigned...");
	System.out.println(person1 + ", " + person2 + ", " + person3);
    }
}
