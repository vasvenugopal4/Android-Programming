import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinMax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array1 = {50, 21, 12, 50, 250, 90};
		MinMax instance = new MinMax();
		instance.printMinMax(array1);
	}
	private void printMinMax(int[] array1) {
		if (array1 == null || array1.length == 0) {
			System.out.print("Input is null.");
			return;
		}
		int[] array1 = {50, 21, 12, 50, 250, 90};
		int min = array1[0];
		int max = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] < min) {
				min = array1[i];
			} else if (array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.format("Min is %d, and max is %d.", min, max);
	}
}
