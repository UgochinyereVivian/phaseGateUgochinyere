import java.util.Scanner;


public class TaskNine{

public static void main(String...ugo){
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    System.out.println("enter a number: ");
    for(; count < 11; count++){
        int score = scanner.nextInt();

        if(score >= 0)
            sum += score;
    }
    System.out.printf("sum: %d",sum);

}


}
