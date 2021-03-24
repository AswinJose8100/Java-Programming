import java.util.Random;

public class Homeworkprogram2 {
	public static void main(String args[])
	{
		int r1;
		int r2;
		int r3;
		do
		{
			Random rand = new Random();
			r1 = rand.nextInt(10);
			r2 = rand.nextInt(10);
			r3 = rand.nextInt(10);
			if((r1==r2)||(r2==r3)||(r1==r3))
			{
				System.out.println("Generating winners...");
				System.out.println("Recieved: "+r1+", "+r2+", "+r3+" .");
				System.out.println("ERROR : Duplicate winners.");

			}

		}while((r1==r2)||(r2==r3)||(r1==r3));
		System.out.println("Generating winners...");
		System.out.println(+r1+", "+r2+" and "+r3+" are winners!");



	}
}