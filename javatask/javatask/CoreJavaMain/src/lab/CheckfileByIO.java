package lab;

import java.io.File;

public class CheckfileByIO {

	public static void main(String[] args) {

		File f1 = new File("projectsample/Sample1.txt");
		System.out.println("File name :" + f1.getName());
		System.out.println("path :" + f1.getPath());
		System.out.println("Absolute path :" + f1.getAbsolutePath());
		System.out.println(f1.exists() ? "file exists" : "file does not exist");
		System.out.println(f1.isDirectory() ? "file is a directory" : "file is not" + " a directory");
		System.out.println(f1.isFile() ? "file is an ordinary file" : "file may be a named pipe");

	}

}
