public class QuestionSix{



public static boolean runAll(int number){
    if(isPalindrome(number) && isPrime(number)) return true;
    return false;

}

private static boolean isPalindrome(int number){
        String newNumber = Integer.toString(number);
        char [] array = newNumber.toCharArray();
        String reverse = "";

        for(int count = 0; count < array.length; count++){
            reverse = array[count] + reverse;        
         }

        int nreverse = Integer.parseInt(reverse);
        if(nreverse == number) return true;
    return false;
}


private static boolean isPrime(int number){
    int count = 0;
    for(int divisor = 0; divisor <= number; divisor++){
        if(number % divisor == 0) count++;
            
    }
    if(count == 2) return true;

  return false;

}


public static void main(String...ugo){
    System.out.println(runAll(1234));
}

}



