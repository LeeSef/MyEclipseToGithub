import java.util.Scanner;

import Person.Person;

public class MyEclipseToGithub {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("����һ�����Գ���");// ��һ���޸�ʹ��

		Person person = new Person();
		
//		person.name = "С��";
//		person.age = 33;
//		person.weight = 12.5f;
		//�Է�
		person.eat();
		//��ӡ����
		int age = person.getAge();
		System.out.println(person.name+"��������"+age);
		//��ӡ��ɫ
		String color = person.getColor("Yellow");
		System.out.println("С������ɫ��" + color);
		scanner = new Scanner(System.in);
		System.out.println("������С������ɫ��");
		color = scanner.next();
		System.out.println("����С������ɫ��" + color);

	}

}
