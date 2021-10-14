package sessiontask;


import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Trainer1 implements Serializable {

	private static final long serialVersionUID = 2L;
	
	
	
	private String name;
	private Date birthday;
	private boolean gender;
	private int age;
	private float salary;
	public Trainer1(String name, Date birthday, boolean gender, int age, float salary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}	
