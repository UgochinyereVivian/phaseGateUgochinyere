
let addDigits = (number) => {
    let newNumber = String(number);
    let result = 0;

    while(newNumber.length > 1){
        for(let each of newNumber){
            result += Number(each);
        }
         let newresult = String(result);
         if(newresult.length > 1){
            newNumber = newresult;
            result = 0

         }
         else{ break}
    }
    return result;

}


    


let getSingleDigit = (array)=>{
    let count = 0;
    let single = 0;
    multiple = "";

    for(let element of  array){
        for(let ele of array){
            if(element == ele){
                count +=1;
                single = element;
            }
        }

        if(count == 1){
            multiple  += single;
        }
       count = 0;
       single = 0;
    }
    single = Number(multiple);
    return single;

}

console.log(addDigits(38))
array = [1,2,2,6]
console.log(getSingleDigit(array))







console.log(get_single_digit_in_array(38))
