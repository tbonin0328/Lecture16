import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnimalTalk 
{
	private static final String ANIMAL_FILE = "input/animal_talk.txt";
	private Scanner in = new Scanner(System.in);
	
	public Scanner getFileReader(String fileName)
	{
		File file = new File(fileName);
		
		try 
		{
			return new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
			System.exit(-1);
			return null;
		}
	}
		
	public void play()
	{
		Scanner fileIn = getFileReader(ANIMAL_FILE);
		//loop through the file and display its contents
		
		String favAnimal = getString("What's your favorite animal?");
		
		while(fileIn.hasNextLine())
		{
			String line = fileIn.nextLine();
			
			line = line.replace("cats", favAnimal + "s");
			line = line.replace("cat", favAnimal);
			
			line = line.substring(0, 1).toUpperCase() + line.substring(1) + ".";
			
			System.out.println(line);
		}
		
		fileIn.close();
	}
	
	public String getString(String prompt)
	{
		System.out.println(prompt);
		return in.nextLine();
	}
			
		public static void main(String[] args)
		{
			AnimalTalk program = new AnimalTalk();
			program.play();
		}
	}




