import java.util.Arrays;

public class TaskTen{


public static int getRepeatedChar(String name){
    String [] stringArray = name.split("");
    int newrepeat = 0;
    int count = 0;
    for(int character = 0; character < stringArray.length; character++){

        for(int index = 0; index < stringArray.length; index++){

            if(stringArray[character].equals(stringArray[index].toLowerCase()) || stringArray[character].equals(stringArray[index].toUpperCase())){

                newrepeat++;
            }
        }
          if(newrepeat > 1){
                count += 1;
          }
            newrepeat = 0;
    }


    return count/2;

    }

public static void main(String...ugo){
    System.out.println(getRepeatedChar("ooa111BAcb"));

}

}
   
    
