public class TaskNine{

public static int divisors(int number){
    int counter = 0;
    for(int count = 1; count <= number; count++){
        if(number % count == 0){
            counter++;
        }
    }

    return counter;
}



}
