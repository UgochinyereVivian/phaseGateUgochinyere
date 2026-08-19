public class TaskFive{



public static int getFirstVowelPosition(String name){
    
    String[] strArray = name.split("");
    for(int index = 0; index < strArray.length; index++ ){
        switch(strArray[index].toLowerCase()){
            case "a" : return index;
            case "e" : return index;
            case "i" : return index;
            case "o" : return index;
            case "u" : return index;
        }
           
    }      
    return 0;

}


}
