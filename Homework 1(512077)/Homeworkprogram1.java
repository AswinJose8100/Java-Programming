import java.util.Scanner;
public class Homeworkprogram1{

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the petrol tank's capacity in litres :");
		int quantity=scan.nextInt();
		System.out.print("Enter the car's fuel consumption in litres per kilometer :");
		float consumption_1km=scan.nextFloat();
		System.out.print("Enter the price of petrol per litre :");
		float petrol_price=scan.nextFloat();
		float distance=quantity/consumption_1km;
		float cost=quantity*petrol_price;
		System.out.print("The car can travel "+distance+"km on a full tank.");
		System.out.print("\nA full tank will cost $"+cost+".");
		scan.close();



	}


}


