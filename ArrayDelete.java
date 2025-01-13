//© A+ Computer Science
// www.apluscompsci.com

//array delete example

public class ArrayDelete
{
	public static int countIt( int[] iRay, int val )
	{
		int count = 0;

		for(int x: iRay)
		{
			if(x==val)
			{
				count++;
			}
		}

		return count;
	}

	public static int[] removeIt( int[] iRay, int val )
	{
		//Create a new array


		//The new array size is the same as the parameter's
		//size minus the count of whatever value we are
		//removing
		//Use the countIt method


		//Keep track of where I should place values in the
		//new array


		//Go through the original array to find non-"val's"

		{
			//If the item is not equal to the "val" copy it
			//into the new array

			{
				//Put the item in the current position in
				//the new array


				//Increase the position

			}
		}




	}

	public static void printIt( int[] iRay  )
	{
		//In here, the array is referred to as iRay
		for(int i=0; i<iRay.length; i++)
		{
			if(i==0)
				System.out.print("[" + iRay[i] + " ");

			else if (i==iRay.length-1)
				System.out.println(iRay[i] + "]");

			else
				System.out.print(iRay[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {7,7,1,7,8,7,4,3,7,9,8};

		//Print the original array and the count of 7's
		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));

		//Remove the 7's
		nums = removeIt( nums, 7 );

		//Print the revised array and the count of 7's
		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
	}
}