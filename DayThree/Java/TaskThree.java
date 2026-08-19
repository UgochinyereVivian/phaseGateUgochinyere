public class TaskThree{

public static int countUpper(String name){
    int count = 0;
    String[] stringArray = name.split("");
    for(String character : stringArray){
        if(character.equals(character.toUpperCase()))
            count++;
    }
    return count;

}


}
