/**类的写法
 * 作者： LeeSeFung
 */
package Person;

//声明类
public class Person {
	
	//类的属性
	public String name;
	public int age;
	public float weight;
	public String color;
	
	//类的方法
	public void eat() {
		
		System.out.println("吃饭");
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getColor(String color) {
		return color;
	}
}