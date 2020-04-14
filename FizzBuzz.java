/*The Fizz Buzz problem takes an integer n and returns an arraylist printing out fizz if the number is divisible by 3 and buzz if the number is divizible by 5. It will also print out fizzbuzz if the number is divisible by both 3 and 5. */

class FizzBuzz{
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        
        
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if(i % 3 == 0)
                result.add("Fizz");
            else if(i % 5 == 0)
                result.add("Buzz");
            else 
                result.add(String.valueOf(i));
            
        }
        return result;
    }
} 
