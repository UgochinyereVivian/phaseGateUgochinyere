import java.util.Scanner;


public class TaskOne{

public static void main(String...ugo){
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    System.out.println("enter a number: ");
    for(; count < 10; count++){
        int score = scanner.nextInt();
        sum += score;
    }
    
    System.out.println(sum);

}


}
