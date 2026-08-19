public class TaskNine{

public static void divisors(int number){
    int counter = 0;
    for(int count = 0; count <= number; count++){
        if(number % count == 0) counter++;
    }

    return counter;
}


}
