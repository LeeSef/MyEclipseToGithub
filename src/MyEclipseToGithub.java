import Person.Person;

public class MyEclipseToGithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("����һ�����Գ���");// ��һ���޸�ʹ��

		Person person = new Person();
		person.eat();
		person.age = 33;
		int age = person.getAge();
		System.out.print(age);
		String color = person.getColor("Yellow");
		System.out.println("\n" + color);

	}

}
