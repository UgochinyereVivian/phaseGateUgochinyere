import java.util.Scanner;


public class TaskNine{

public static void main(String...ugo){
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    int counter = 0;

    System.out.println("enter a number: ");
    for(; count < 11; count++){
        int score = scanner.nextInt();

        if(score >= 0)
            sum += score;
            counter++;
    }
    int average = sum/counter;
    System.out.printf("sum: %d",average);

}


}
