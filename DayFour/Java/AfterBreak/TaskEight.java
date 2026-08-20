import java.util.Scanner;


public class TaskEight{

public static void main(String...ugo){
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    int counter = 0;
    System.out.println("enter a number between 0 -100: ");

    for(; count < 11; count++){
        int score = scanner.nextInt();

        if(score >= 0 && score <= 100)
            sum += score;
    }

    System.out.printf("sum: %d,",sum);

}


}
