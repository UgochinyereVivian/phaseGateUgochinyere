public class TaskOne{


public static String reverse(String name){
    String reverse = "";
    String[] stringArray = name.split("");
    for(String character : stringArray){
        reverse = character + reverse;
    }
    return reverse;

}


}
