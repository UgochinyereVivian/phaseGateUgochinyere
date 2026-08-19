

let getLikes = (array)=>{
    ArrayList<String> likers = new ArrayList<>();

    System.out.println(likers + " -> no one liked this");
    print();

    for(int count = 0; count < array.length; count++){
        likers.add(array[count]);
        System.out.println(likers + " -> " + likers + " liked this");
        print();

        if(likers.size() > 3)
            System.out.printf("%s  ->   %s %s and %d others liked this", likers, likers.get(0),likers.get(1),likers.size() - 2);
              
    }
    
}




public static void main(String...ugo){
     String [] array = {"ugo","vivian","nwachukwu","name","viv"};
     getLikes(array);

}


public static void print(){
    System.out.println();
    
}
}
