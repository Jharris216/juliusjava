package basics;

public class Lab1 {

	public static void main(String[] args) {
		// write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(4));
		
		// function that computes factorial hint use recursion n = n*(n-1)! = n
		System.out.println("factorial: " + fact(5));
		// write 3 functions that return the min, avg, and max of array
		int[] numbers = {5, -2, 0, 234,-438,63};
		System.out.println("min: " + findMin(numbers));
		System.out.println("max: " + findMax(numbers));
		System.out.println("avg: " + findAvg(numbers));
		
	}
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}

// factorial function 
	

public static int fact(int n) {
    if (n == 0) {
        return 1;
    }
    else if (n == 1) {
        return 1;
    }
    return fact(n-1) * n;
}
// write 3 functions that return the min, avg, and max of array
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
 
public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
 
public static int findAvg(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum / arr.length;
    
}
}