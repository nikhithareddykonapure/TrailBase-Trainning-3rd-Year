package ttd.test;

public class Fizzbuzz {
		    public static String fizzBuzz(int a) {
	        if (a % 3 == 0 && a % 5 == 0) {
	            return "Fizz Buzz";
	        } else if (a % 3 == 0) {
	            return "Fizz";
	        } else if (a % 5 == 0) {
	            return "Buzz";
	        } else {
	            return "No Fizz Buzz";
	        }
	    }

	    public static void main(String[] args) {
	        int a = 30;
	        System.out.println(fizzBuzz(a));
	    }
	}

