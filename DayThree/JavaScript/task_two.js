let reverseInteger = (number)=>{
    let stringNumber = String(number);
    let reverse = "";

    for(let character of stringNumber){
        reverse = character + reverse;
    }
    let toInteger = Integer.parseInt(reverse)
return toInteger;

}
