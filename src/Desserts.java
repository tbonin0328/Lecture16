import java.util.Scanner;

public class Desserts 
{
	private static final String SPRINKLES_TOKEN = "sprinkles";
	private static final String CHERRY_TOKEN = "a cherry on top";
	private static final String CUPCAKE_TOKEN = "cupcake";
	private Scanner in = new Scanner(System.in);
	public void play()
	{
		System.out.println("Desserts");
		String dessert = getString("Enter your favorite dessert: ");
		System.out.println(getCookieMessage(dessert));
		
		dessert = getAntiSprinkles(dessert);
		System.out.println("You can have " + dessert);
		
		dessert = getSimpleCupcake(dessert);
		System.out.println("Simplify your life and palate with " + getSimpleCupcake(dessert));
	}
	
	public String getCookieMessage(String dessert)
	{
		if(dessert.indexOf("cookie") != -1)
		{
			return "num num num!!!";
		}
		return "you forgot about cookies";
	}
	
	public String getAntiSprinkles(String dessert)
	{
		return dessert.replace(SPRINKLES_TOKEN, CHERRY_TOKEN);
	}
	
	//will give you all the string till the end of cupcake
	public String getSimpleCupcake(String dessert)
	{
		if(dessert.indexOf(CUPCAKE_TOKEN) == -1) return dessert;

		int cupcakeEnd = dessert.indexOf(CUPCAKE_TOKEN) + CUPCAKE_TOKEN.length();
		
		return dessert.substring(0, cupcakeEnd); 
	}
	
	public String getString(String prompt)
	{
		System.out.println(prompt);
		return in.nextLine();
	}
	
	public static void main (String[] args)
	{
		Desserts program = new Desserts();
		program.play();
	}
	
}



