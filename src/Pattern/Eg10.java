package Pattern;

public class Eg10 {

	public static void main(String[] args)
	{
		// Equilateral Triangle Downward With Space
		 //* * * * *
		 // * * * *
		 //  * * *
		 //   * *
		 //    *
         //row=5 col=5 star=5 space=0
		int star=5; int space=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
