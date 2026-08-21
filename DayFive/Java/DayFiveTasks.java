public class DayFiveTasks{


public static int add(int one, int two){
    return one + two;

}


public static boolean is_even(int one){
   if(one % 2 == 0)
        return true;

    return false;

}


public static int square(int one){
    return one * one;

}

public static double convertToFarenheit(int celsuis){
    int farenheit = (9/5) * celsuis;
    return farenheit;

}

public static boolean isEven(int number){
    int counter = 0;
    for(in count = 0; count <= number; count++){
        if(number % divider == 0)
            counter ++;
    }
        if(counter == 2)
            return true;
    return false;
}

public static int isEven(int number_one,int number_two, int number_three){
    int[] array = {number_one, number_two, number_three};
    int largest = array[0];
    for(int number : array){
        if(number > largest)
            largest  = number;
    }

    return largest;
}

public static int reverse(int one){
    String newNumber = String.valueOf(one);
    String [] array = newNumber.split("");
    String reverse = "";
    for(String character : array){
        reverse = character + reverse;
    }
    
    int convertReverseToInt = Integer.parseInt(reverse);
    return convertReverseToInt;

}


public static int countReoccurence(String name, char character){
    int count = 0;
    char [] newName = name.toCharArray;
    for(char charac : newName){
        if(charac == character)
            count++;
    }
    return count;

}

}

