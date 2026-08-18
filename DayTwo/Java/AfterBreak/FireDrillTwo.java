public class FireDrillTwo{



public static char getAverage(int scoreOne, int scoreTwo, int scoreThree){
    int sum = scoreOne + scoreTwo + scoreThree;
    int average = sum/3;


    if(average > 100 || average < 0) print("invalid hence 0");

    if(average >= 90 && average <= 100) return 'A';
    else if(average >= 80 && average < 90) return 'B';
    else if(average >= 70 && average < 80) return 'C';
    else if(average >= 60 && average < 70) return 'D';
    else if(average >= 0 && average < 60) return 'F';

  return '0';
}




public static void main(String...ugo){
     System.out.println(getAverage(50,76,10));

}


public static void print(String message){
    System.out.println(message);
}
}
