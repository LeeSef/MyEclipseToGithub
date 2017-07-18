/**类的写法+构造方法
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
	
	//构造方法：系统自动提供，可更具需要修改
	//无参构造方法
	public Person () {
		
		name = "小猫";
		age = 2;
		weight = 10.2f;
		color = "棕色";		
	}
	//有参构造方法（他与无参构造方法不能共存，当有有参构造方法时，无参构造方法不提供）
    public Person (String name0,int age0,float weight0, String color0) {

		name = name0;
		age = age0;
		weight = weight0;
		color = color0;		
	}
}