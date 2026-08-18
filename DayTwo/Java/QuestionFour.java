public class QuestionFour{

public static void printNumbersReverseVersion(){
        String reverse = "";

        for(int count = 0; count <= 100; count++){

            if(count % 3 == 0)
                   System.out.println("hello");
            if(count % 5 == 0)
                   System.out.println("world");
            if(count % 7 == 0)
                   System.out.println("hello");
            
            else{
                String newCount = Integer.toString(count);
                int length = newCount.length();
                for(int index = 0; index < newCount.length(); index++){
                    reverse = newCount.charAt(index) + reverse;
                }
                  System.out.println(reverse);
            }
                     
            
        }
}

public static void main(String...ugo){
    printNumbersReverseVersion();
}
