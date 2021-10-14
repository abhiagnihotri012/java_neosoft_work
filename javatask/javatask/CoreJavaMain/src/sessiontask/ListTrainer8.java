package sessiontask;

import java.util.ArrayList;

import java.util.Iterator;




public class ListTrainer8 {
	public static void main(String[] args) {
		
		ArrayList<Trainer> trainer=new ArrayList<Trainer>();
		trainer.add(new Trainer(101,"abitha","java",22000));
		trainer.add(new Trainer(102,"mayank","java",10000));
		trainer.add(new Trainer(103,"samadhan","php",24000));
		trainer.add(new Trainer(104,"vinay","java",23000));
		trainer.add(new Trainer(103,"rohit","java",21000));
		
		Iterator<Trainer> itr=trainer.iterator();
		while(itr.hasNext()) {
			Trainer tr=itr.next();
			System.out.println(tr);
		}
		
		System.out.println("================");
		
		ArrayList<Trainer> newtrainer=new ArrayList<Trainer>();
		for(Trainer tr:trainer) {
			if(tr.salary > 20000) {
				if(tr.course == "java") {
					newtrainer.add(tr);
					System.out.println(tr);
				}
				
			
			}
		
		}
		
		trainer.clear();
		System.out.println("=============");
		
		Iterator<Trainer> itr1=trainer.iterator();
		while(itr1.hasNext()) {
			Trainer tr1=itr.next();
			System.out.println(tr1);
		}
		
	

	}

}

class Trainer{
	int trid;
	String name;
	String course;
	int salary;
	public Trainer(int trid, String name, String course, int salary) {
		super();
		this.trid = trid;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "trid:  "+trid+"   Name:  "+name+"  course:  "+course+"  Salary:  "+salary;
	}

}
