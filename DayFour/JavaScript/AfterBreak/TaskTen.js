
const prompt = require("prompt-sync")()

    let count = 1;
    let sum = 0;
    let counter = 0;

    for(; count < 11; count++){
        let score = Number(prompt("enter a number: "));
       if(score >= 0){
            sum += score;
            counter++;
        }
    }
    let average = sum/counter
   console.log(`${average}`);


