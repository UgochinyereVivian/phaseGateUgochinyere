

let runAll = (number) => {
    if(isPalindrome(number) && isPrime(number)) return true;
    return false;

}



let isPalindrome = (number) => { 
        let newNumber = String(number);
        let reverse = "";

        for(let count = 0; count < array.length; count++){
            reverse = newNumber.charAt(count) + reverse;        
         }

        let newreverse = Number(reverse);
        if(newreverse == number) return true
    return false
}



let isPrime = (number)=> {
    let count = 0;
    for(let divisor = 0; divisor <= number; divisor++){
        if(number % divisor == 0) count++;
            
    }
    if(count == 2) return true;

  return false;

}


console.log(runAll(1234));


