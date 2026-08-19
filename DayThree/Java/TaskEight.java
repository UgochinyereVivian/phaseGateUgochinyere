public class TaskEight{

public static void divisors(int number){

    for(int count = 1; count <= number; count++){
        if(number % count == 0) System.out.println(count);
    }
}

public static void main(String...ugo){
divisors(15);

}
}
