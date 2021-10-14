package sessiontask;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class S15_EmailsFileHandling {

	public static void main(String[] args) throws IOException {
		String[] s1 = new String[5];
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < s1.length; i++) {
			System.out.print("Enter your Email : ");
			String var1 = br1.readLine();
			
			while(!var1.matches("^(.+)@(.+)$")) {
				System.out.println("Invalid Email! Enter again!");
				System.out.print("Enter your Email : ");
				var1 = br1.readLine();	
			}
			s1[i] = var1;
			System.out.println("Email added ");
		}
		br1.close();

		// TODO Auto-generated method stub
		BufferedReader fileX = new BufferedReader(new InputStreamReader(System.in));

		File file1 = new File("resources/sample.txt");
		File file2 = new File("resources/sample2.txt");

		BufferedWriter br2 = new BufferedWriter(new FileWriter(file1, true)); // Append mode, if true removed rewrite
																				// mode

		for (int j = 0; j < s1.length; j++) {
			br2.write(s1[j]);
			br2.newLine();
			System.out.println(s1[j]);
		}
		br2.close();

		BufferedWriter br4 = new BufferedWriter(new FileWriter(file2, true)); // Append mode, if true removed rewrite
																				// mode

		String[] s2 = new String[5];
		for (int k = 0; k < s1.length; k++) {
			String[] domain = s1[k].split("@");
			br4.newLine();
			br4.write(domain[1]);
			System.out.println(domain[1]);
		}
		br4.close();

	}

}