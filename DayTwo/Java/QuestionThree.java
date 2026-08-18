public class QuestionThree{


public static void printNumbers(){

        for(int count = 0; count <= 100; count++){

            if(count % 3 == 0){
                   System.out.println("skip");
            }
            else{
                   System.out.println(count);
            }
        }
}



public static void main(String...ugo){
    printNumbers();
}

}
