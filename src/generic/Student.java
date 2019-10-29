package generic;
import java.io.Serializable;
public class Student implements Cloneable, Serializable{
	private static final long serialVersionUID=12234214234L;
	private String name;
	private int age;
	private String addr;
	//1
	public Student(String name, int age, String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
}
