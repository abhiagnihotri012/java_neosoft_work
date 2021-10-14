package sessiontask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface11 {

	

	private static Map<Integer, Emp1> hashMap;

	public static void main(String[] args) {
		
		Map<Integer, Emp1> staff = new HashMap<Integer, Emp1>(10,0.75f);
		Emp1 a=new Emp1(101,"Rohaan",20000);
		Emp1 b=new Emp1(102,"Abhi",15000);
		Emp1 c=new Emp1(103,"Sumut",17000);
		Emp1 d=new Emp1(104,"Pradeep",9000);
		Emp1 e=new Emp1(105,"Kavita",18000);
		Emp1 f=new Emp1(106,"Anjali",34000);
		Emp1 g=new Emp1(107,"Kuldeep",20000);
		Emp1 h=new Emp1(108,"Bihari",12000);
		
		
		
		
		hashMap.put(a.getId(),a);
		hashMap.put(b.getId(),b);
		hashMap.put(c.getId(),c);
		hashMap.put(d.getId(),d);
		hashMap.put(e.getId(),e);
		hashMap.put(f.getId(),f);
		hashMap.put(g.getId(),g);
		hashMap.put(h.getId(),h);
		Set<Map.Entry<Integer,Emp1>> entries=hashMap.entrySet();
		for(Map.Entry<Integer, Emp1>emp:entries) {
			System.out.println(emp.getKey());
			Emp1 employe=emp.getValue();
			employe.display();
		}
		
		

	}

}

class Emp1 {
	int id;
	String name;
    double salary;
	public Emp1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public void display() {
		System.out.println("Id="+id+"Name="+name+"Salary="+salary);
	}
    
    
    


}
