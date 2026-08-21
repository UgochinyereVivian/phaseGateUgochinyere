public class Tasks{


public static int addDigits(int number){
    String newNumber = String.valueOf(number);
    String [] array = newNumber.split("");
    int result = 0;

    while(array.length != 1){
        for(String each : array){
            result += Integer.parseInt(each);
        }
         String newresult = String.valueOf(result);

         if(newresult.length() > 1){
            array = newresult.split("");
            result = 0;
        }
         else{ break;}
    }
    return result;

}
    


public static int getSingleDigit(int [] array){
    int count = 0;
    int single = 0;
    String multiple = "";

    for(int element : array){
        for(int ele : array){
            if(element == ele){
                count ++;
                single = element;
            }
        }

        if(count == 1){
            multiple  += single;
        }
       count = 0;
       single = 0;
    }
    single = Integer.parseInt(multiple);
    return single;

}



public static void main(String...ugo){
    int[]array = {1,2,2,3,3,4};
    System.out.println(getSingleDigit(array));

}

}
