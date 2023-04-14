import java.util.Scanner;

public class Main_Pizza
{ 
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		System.out.print("Please select v for veg or n for nonVeg: ");
		String select = scan.next();
		PizzaKing p = new PizzaKing(select);
		 
		 if (select.equals("v"))
		 {
			System.out.println("You selected Veg");
			p.Veg();
		 }
		 else if(select.equals("n"))
		 {
			System.out.println("You selected Non-Veg");
			p.nonVeg();
		 }
		 else
		 {
			 System.out.println("Please enter anyone from v OR n");
		 }
		
	}
}
