
let divisors = (number)=>{
    let counter = 0;
    for(int count = 1; count <= number; count++){
        if(number % count == 0) counter+= 1;
    }

    return counter;
}


}
