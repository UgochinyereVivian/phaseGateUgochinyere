public class TaskTwo{


public static int reverseInteger(int number){
    String stringNumber = "" + number;
    String reverse = "";

    String[] numberArray = stringNumber.split("");

    for(String character : numberArray){
        reverse = character + reverse;
    }
    int toInteger = Integer.parseInt(reverse);
return toInteger;

}



}
