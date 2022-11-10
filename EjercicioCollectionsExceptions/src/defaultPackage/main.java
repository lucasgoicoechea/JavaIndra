package defaultPackage;

import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		try {
			createFile("c:/testFile.txt");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void createFile(String fname) throws IOException
	{
		String name = null;
		File f = new File(name);
		System.out.println(name+" exists? "+f.exists());
		f.createNewFile();
		System.out.println(name+" exists? "+f.exists());
		
		//Modificacion
		
	}
}
