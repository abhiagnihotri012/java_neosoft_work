package lab;

import java.io.*;

public class ReadWrite123 {

	public static void main(String args[]) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			String s, s1 = new String();
			while ((s = in.readLine()) != null)
				s1 += s + "\n";
			in.close();
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter line");
			System.out.println("usage of BufferedReader and  InputStreamReader…");
			System.out.println(stdin.readLine());
			StringReader in2 = new StringReader(s1);
			int c;
			System.out.println("printing individual characters of the file" + args[0]);
			while ((c = in2.read()) != -1)
				System.out.println((char) c);
			BufferedReader in4 = new BufferedReader(new StringReader(s1));
			PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("demo.out")));
			while ((s = in4.readLine()) != null)
				p.println("output " + s);
			p.close();

		} catch (IOException e) {
		}
	}

}
