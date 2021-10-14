package sessiontask;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class S16_1_SerializationTest {
	public static void main(String[] args) {
		List<Trainer1> trainers = new ArrayList<Trainer1>(); //Adds specific type of elements : Trainer
//		List trainers = new ArrayList(); // Alllows to enter any type of objects
		
		ObjectOutputStream oos = null;
		String outputFile = "resources/trainers.db";
		DateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			trainers.add(new Trainer1("Noah",dateFormat.parse("02-12-2020"), true, 30, 8000.5f));
			trainers.add(new Trainer1("Hannah",dateFormat.parse("05-08-2018"), false, 22, 9000.50f));
			trainers.add(new Trainer1("Ulrich",dateFormat.parse("27-04-2019"), true, 35, 8500.30f));
			trainers.add(new Trainer1("Jonas",dateFormat.parse("12-03-2021"), true, 21, 9900.5f));
			trainers.add(new Trainer1("Agnes",dateFormat.parse("09-09-2022"), false, 18, 8900.51f));
			
			for(Trainer1 trainer:trainers) {
				oos.writeObject(trainer);
				System.out.println("Serialization Done!");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(oos!=null)
				try {
					oos.close();
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
