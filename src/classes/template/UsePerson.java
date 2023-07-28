package classes.template;

//Person.java
 class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void sayHello() {
     System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
 }

}


public class UsePerson {
	public static void main(String[] args) {
		// make codex
	}
}
