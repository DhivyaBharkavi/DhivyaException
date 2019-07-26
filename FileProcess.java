package exercise23july19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProcess {
	FileInputStream fis;
	FileOutputStream fos;
	public void readTextFile() throws FileNotFoundException,IOException 
	{
		fis=new FileInputStream("D:/divya.txt");
		int i;
		//i=fis.read();//reads only one byte 
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
	}
	public void writeTextFile() throws FileNotFoundException,IOException
	{
		String data="Happy to learn java";
		fos=new FileOutputStream("D:/divya.txt");
		fos.write(data.getBytes());//It only get byte 
	}
	public void checkAgeEligibility(int age)throws Exception
	{
		if(age<18)
		{
			//System.out.println("Not eligigble");
			//Exception e = new Exception();
			NotEligibleException e = new NotEligibleException("You are not eligible to vote",age);
			//throw new Exception();//New is keyword with  Exception is a constructor that is anonymous object
			throw e;
		}
		else
		{
			System.out.println("Eligible");
		}
	}
}
