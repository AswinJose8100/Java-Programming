
	import java.util.Scanner;

	public class Practical2
	{
	 	public static void main(String[] args)
	 	{
		
		 Scanner scan = new Scanner(System.in);
		 int n = 0;
		 int sum = 0;
		 double average;
		 boolean error;

	
		 do
		 {
			try
			{
				error = false;		
				System.out.println("How many numbers do you want to enter?");
				n = scan.nextInt();
				if (n <= 0 ) throw new Exception("Number must be greater than 0.");
			}
			catch (Exception e)		
			{
				error = true;		
				System.out.println(e.getMessage());
			}
		 } while (error);

		
		 for (int i=0; i<n; i++)
		 {
			
			 do
				{
					try
					{
						error = false;	
						System.out.println("Enter number " + (i+1));
						int num = scan.nextInt();
						if (num <= 0 ) throw new Exception("Number must be greater than 0.");
						sum += num;
					}
					catch (Exception e)
					{
		
						error = true;	
						System.out.println("Error, please enter the number again.");
			
						String temp = scan.nextLine();				
		}
			 	} while (error);
			 }

			 average = (double) sum / n;
			 System.out.println("\nThe average is " + average);
			}
	}



	


