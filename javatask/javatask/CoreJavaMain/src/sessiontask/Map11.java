package sessiontask;

import java.util.HashMap;
import java.util.Map;

public class Map11 {

	public static void main(String[] args) {
		
		Map<Integer, Employee> staff = new HashMap<Integer, Employee>();
		staff.put(101, new Employee(101,"Amy Lee",20000));
		staff.put(102, new Employee(102,"Harry Hacker",30000));
		staff.put(103, new Employee(103,"Samadhan",9000));
		staff.put(104, new Employee(104,"Rohan",8000));
		staff.put(105, new Employee(105,"Kapil",7000));
		
		System.out.println("Print all entries in the HashMap as a set");
		System.out.println(staff);
		System.out.println("=========================================");
		
		System.out.println("Remove Employee");
		staff.remove(102);
		System.out.println(staff);
		
		for (Map.Entry<Integer, Employee> entry : staff.entrySet()) {
			int key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
		
		

	}

}

class Employee{
	private int id;
	 String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}