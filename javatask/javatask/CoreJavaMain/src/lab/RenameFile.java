package lab;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			File f = new File("projectsample/Sample2.txt", args[i]);
			File f1 = new File("projectsample/Sample1.txt");
			if (f.exists()) {
				System.out.println(f + " does exists.");
				System.out.println("Its size is" + f.length() + "bytes");
				f.renameTo(f1);
				System.out.println("Renamed file name :" + f1 + (i + 1));
				System.out.println("deleting the renamed file" + f1 + (i + 1));
				System.out.println("=======================");
				f.delete();
			} else
				System.out.println(f + " does not exists");
		}

	}

}
