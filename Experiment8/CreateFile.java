import java.util.Scanner;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.io.FileReader;  
class FileReaderWriter 
{ 
	public static void write() throws IOException 
	{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text!");
		String str = sc.nextLine();
        System.out.println("Enter File Name.");
        String fileName = sc.nextLine();
		FileWriter fw = new FileWriter(fileName + ".txt"); 


		for (int i = 0; i < str.length(); i++) 
			fw.write(str.charAt(i)); 

		System.out.println("Writing successful"); 
		fw.close(); 
	}

    public static void read() throws IOException 
    { 
        int ch; 
        Scanner sc = new Scanner(System.in);
        FileReader fr = null; 
        System.out.println("Enter File Name.");
        String fileName = sc.nextLine();
        try
        { 
            fr = new FileReader(fileName + ".txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
    } 
}

public class CreateFile
{
    public static void main(String args[]) throws IOException
    {
        FileReaderWriter.write();
        try
        {
            FileReaderWriter.read();
        }
        catch(FileNotFoundException fe)
        {

        }
    }
}

 