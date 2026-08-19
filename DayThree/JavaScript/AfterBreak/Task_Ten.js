

function getRepeatedChar(name){
    String [] stringArray = name.split("");
    int [] repeat = new int[stringArray.length];
    int newrepeat = 0;
    for(int character = 0; character < stringArray.length; character++){

        for(int index = 0; index < stringArray.length; index++){

            if(stringArray[character].equals(stringArray[index].toLowerCase()) || stringArray[character].equals(stringArray[index].toUpperCase())){

                newrepeat++;
            }
        }
            repeat[character] = newrepeat;
            newrepeat = 0;
    }

    int largest = repeat[0];
    for(int count = 0; count < repeat.length; count++){
               if(repeat[count] > largest) largest = repeat[count];
    }
    return largest;

    }

public static void main(String...ugo){
    System.out.println(getRepeatedChar("111BAcb"));

}

}
   
    
