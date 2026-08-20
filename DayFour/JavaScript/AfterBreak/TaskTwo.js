const prompt = require("prompt-sync")()

    let count = 1;
    let sum = 0;
    console.log("enter a number: ");
    for(; count < 11; count++){
        let score = Number(prompt());
        sum += score;
    }
    
    console.log(sum,sum/count);


