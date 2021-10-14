package sessiontask;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class S16_2_DeSerialization {
	public static void main(String[] args) {
		List<Trainer1> trainers = new ArrayList<Trainer1>(); //Adds specific type of elements : Trainer
//		List trainers = new ArrayList(); // Alllows to enter any type of objects
		
		ObjectInputStream ois = null;
		String inputFile = "resources/trainers.db";
		DateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		
		try {
			ois = new ObjectInputStream(new FileInputStream(inputFile));
			while(true) {
				Trainer1 trainer = (Trainer1) ois.readObject();
				System.out.println("Name : "+trainer.getName()+"\t");
				System.out.println("Age : "+trainer.getAge()+"\t");
				System.out.println("Salary : "+trainer.getSalary()+"\t");
				System.out.println("Gender : "+trainer.isGender()+"\n");
			}
			
		}
		catch(EOFException e) {
			//e.printStackTrace();
			System.out.println("End of Records");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(ois!=null)
				try {
					ois.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
