package exercise23july19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception1 {
	FileInputStream fis =null;
	public void readFile()
	{
		try
		{
			System.out.println("Before ");
			fis= new FileInputStream("D:/divya.txt");
			//fis= new FileInputStream("D:/MirrorImage.java");
			//fis= new FileInputStream("D:/Josephine.docx");
			//fis=new FileInputStream("D:/17slide.ppt");
			fis.read();
			System.out.print(fis.read());
			int i=fis.read();
			//while((i=fis.read())!=-1)
			//{
				System.out.print((char)i);
			//}
			System.out.println();
			System.out.println("After");
		}
		catch(FileNotFoundException divya)
		{
			divya.printStackTrace();
			System.out.println(divya);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		finally
		{
			System.out.println("Final Method");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
