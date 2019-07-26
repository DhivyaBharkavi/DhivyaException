package exercise23july19;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProcessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileProcess f = new FileProcess();
		try {
			f.readTextFile();
			f.writeTextFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block");
			//f.fis.close();
		} 
	}

}
