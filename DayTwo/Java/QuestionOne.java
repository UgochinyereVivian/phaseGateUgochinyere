public class QuestionOne{





public static void greet(String firstLetter, String secondLetter){
    String interleaved_text = "";
    String[] letter = firstLetter.split("");
    String[] SecondLetter = secondLetter.split("");
        for(int count = 0; count < letter.length; count++){

            if(count >= 2){
                interleaved_text += SecondLetter[count];
                interleaved_text += letter[count];
            }
            else{
                interleaved_text += letter[count];
                interleaved_text += SecondLetter[count];
            }
        }

    
     System.out.println("\"" + interleaved_text + "\"");


}


public static void main(String...ugo){
    greet("Hello","World");
}

}
