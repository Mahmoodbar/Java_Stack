public class FizzBuzzTest {
    public static String fizzBuzz(int number) {
        String str = number+"";
         if ( number % 5 ==0 && number%3 == 0){
            str= "fizzbuzz";
            }
        else if (number % 3 == 0){
            
            str ="fizz";
        }
        else if (number % 5 == 0){
            str ="buzz";
        }
        
            return str;
        
    }
}

