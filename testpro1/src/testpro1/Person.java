package testpro1;

public class Person implements AA{
	private String name;
	private int age;
	
	public Person() {
	}
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
	public void  test1(String info){
		System.out.println(info);
	}
	public void  test1(){
		System.out.println("1111");
	}
	
	
}


interface AA{
	
}
