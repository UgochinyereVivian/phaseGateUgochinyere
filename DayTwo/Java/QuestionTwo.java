public class QuestionTwo{


public static double getMean(int numberOne, int numberTwo, int numberThree){
   int  sumation = numberOne + numberTwo + numberThree;
   double mean = sumation/3;

   return mean;
}


public static void getMedian(int numberOne, int numberTwo, int numberThree){
    int [] array = {numberOne, numberTwo, numberThree};

    array = sortThe(array);

    int median = array[array.length/2];
     for(int count = 0; count < array.length; count++){
        if (array[count] == median){
            if(array[count] == array[0]) System.out.println("number_one holds the median");
            else if (array[count] == array[1]) System.out.println("number_two holds median");
            else System.out.println("number_three holds median");
        }
  }
    System.out.println("median is " + array[array.length/2]);
  }


private static int[] sortThe(int [] array){
    for(int count = 0; count < array.length; count++){
        for(int counter = 0; counter < array.length; counter++){
            if(array[count] < array[counter]){
                int temp = array[count];
                array[count] = array[counter];
                array[counter] = temp;
            }
        }
    }
    return array;

}

public static void main(String...ugo){
    System.out.println(getMean(1,5,2));
    getMedian(2,5,1);
}

}
