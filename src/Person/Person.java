/**���д��+���췽��
 * ���ߣ� LeeSeFung
 */
package Person;

//������
public class Person {
	
	//�������
	public String name;
	public int age;
	public float weight;
	public String color;
	
	//��ķ���
	public void eat() {
		
		System.out.println("�Է�");
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getColor(String color) {
		return color;
	}
	
	//���췽����ϵͳ�Զ��ṩ���ɸ�����Ҫ�޸�
	//�޲ι��췽��
	public Person () {
		
		name = "Сè";
		age = 2;
		weight = 10.2f;
		color = "��ɫ";		
	}
	//�вι��췽���������޲ι��췽�����ܹ��棬�����вι��췽��ʱ���޲ι��췽�����ṩ��
    public Person (String name0,int age0,float weight0, String color0) {

		name = name0;
		age = age0;
		weight = weight0;
		color = color0;		
	}
}