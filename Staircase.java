// Java program to find the number of steps 
import java.util.*; 
import java.lang.*; 

public class Staircase { 

	// Modified Binary search function 
	// to solve the equation 
	public static int solve(int low, int high, int T) 
	{ 
		while (low <= high) { 
			int mid = (low + high) / 2; 

			// if mid is solution to equation 
			if ((mid * (mid + 1)) == T) 
				return mid; 

			// if our solution to equation 
			// lies between mid and mid-1 
			if (mid > 0 && (mid * (mid + 1)) > T && 
						(mid * (mid - 1)) <= T) 
				return mid - 1; 

            if (mid > 0 && (mid * (mid + 1)) < T)
            {
                if(((mid+1) * (mid + 2)) > T)
				    return mid; 
				else if(((mid+1) * (mid + 2)) == T)
				    return mid+1;
            }
            
			// if solution to equation is 
			// greater than mid 
			if ((mid * (mid + 1)) > T) 
				high = mid - 1; 

			// if solution to equation is less 
			// than mid 
			else
				low = mid + 1; 
		} 
		return -1; 
	} 

	// driver function 
	public static void main(String argc[]) 
	{ 
		int T = 40; 

		// call binary search method to 
		// solve for limits 1 to T 
		int ans = solve(1, T, 2 * T); 

		// Because our pattern starts from 2, 3, 4, 5... 
		// so, we subtract 1 from ans 
		if (ans != -1) 
			ans--; 

		System.out.println("Number of stair steps = " + ans); 
	} 
} 

/* This code is Contributed by Sagar Shukla */
