package FizzBuzz;


public class FizzBuzz {
	
    static final int START_VALUE = 1; //The starting value to be processed for FizzBuzz 
    static final int END_VALUE = 100; //The ending value to be processed for FizzBuzz
	
    /** 
     * @param args 
     */
    public static void main(String args[]) 
    { 
	    for (int i = START_VALUE; i <= END_VALUE; i++) {
	    	System.out.println(ConvertToFizzBuzzValue(i));
	    }
    }
    
    /** 
     * Given an integer determine the FizzBuzz value of the integer.
     * 
     * integers that are multiples of 3 are Fizz;
     * integers that are multiples of 5 are Buzz;
     * integers that are multiples of 3 & 5 are FizzBuzz;
     * all other integers remain the same;
     * 
     * @param i The integer to be converted to its FizzBuzz value
     * @return String The output of the integer as a FizzBuzz value
     * 
     * **/
    static String ConvertToFizzBuzzValue(int i) {
    	
        if (i % 15 == 0){
            return "FizzBuzz";
        }
        
        if (i % 3 == 0) {
        	return "Fizz"; 
        }
        
        if (i % 5 == 0) {
        	return "Buzz"; 
        }
        
        return String.valueOf(i); 

    }
}
