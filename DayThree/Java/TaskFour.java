public class TaskFour{


public static int countLower(String name){
    int count = 0;
    String[] stringArray = name.split("");
    for(String character : stringArray){
        if(character.equals(character.toLowerCase()))
            count++;
    }
    return count;

}


}
