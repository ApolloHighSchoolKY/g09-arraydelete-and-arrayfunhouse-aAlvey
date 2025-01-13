import java.util.Arrays;

public class ArrayFunHouseRunner
{

    public static void main(String[] args)
    {
    	int[] numArray = {4,10,0,1,7,6,5,3,2,9};
    	ArrayFunHouse myArray = new ArrayFunHouse(numArray);

    	System.out.println(myArray);
    	System.out.println("sum of spots 3-6  =  " + myArray.getSum(3,6));
		System.out.println("sum of spots 2-9  =  " + myArray.getSum(2,9));
		System.out.println("# of 4s  =  " + myArray.getCount(4));
		System.out.println("# of 9s  =  " + myArray.getCount(9));
    }


}