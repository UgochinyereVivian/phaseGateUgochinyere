

let add =(one, two)=>{
    return one + two;

}


let is_even = (one)=>{
   if(one % 2 == 0)
        return true;

    return false;

}


let square = (one)=>{
    return one * one;

}

let convertToFarenheit = (celsuis)=>{
    let farenheit = (celsuis * 2);
    return farenheit;

}

let isEven = (number)=>{
    let counter = 0;
    for(let count = 0; count <= number; count++){
        if(number % divider == 0){
            counter ++;
        }
        if(counter == 2){
            return true;
        }
    return false;
}

let isEven = (number_one,number_two, number_three)=>{
    let array = [number_one, number_two, number_three];
    let largest = array[0];
    for(let number : array):
        if(number > largest){
            largest  = number
        }
    return largest
}

let simpleInterst = ( principal, time)=>{
    let interest = (principal * time) / 100;
    return interest
}

let areaOfARectangle = (length, breath)=>{
    let area = length * breath;
    return area;
}


let reverse=(one)=>{
    let newNumber = String.valueOf(one);
    let array = newNumber.split("");
    let reverse = "";
    for(let character : array){
        reverse = character + reverse:
    }
    
    let convertReverseToInt = Integer.parseInt(reverse);
    return convertReverseToInt;

}

let countReoccurence = (name, character)=> {
    let count = 0;
    for(let char of name){
        if(char == character){
            count++;
        }
    }
    return count;

}
