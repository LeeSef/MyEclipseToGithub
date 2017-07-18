import java.util.Scanner;

import Person.Person;

public class MyEclipseToGithub {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("这是一个测试程序");// 第一次修改使用

		Person person = new Person();
		
//		person.name = "小狗";
//		person.age = 33;
//		person.weight = 12.5f;
		//吃饭
		person.eat();
		//打印年龄
		int age = person.getAge();
		System.out.println(person.name+"的年龄是"+age);
		//打印颜色
		String color = person.getColor("Yellow");
		System.out.println("小狗的颜色是" + color);
		scanner = new Scanner(System.in);
		System.out.println("请输入小狗的颜色：");
		color = scanner.next();
		System.out.println("现在小狗的颜色是" + color);

	}

}
