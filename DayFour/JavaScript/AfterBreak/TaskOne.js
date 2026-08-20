const prompt = require("prompt-sync")()

    let count = 0;
    let sum = 0;
    console.log("enter a number: ");
    for(; count < 10; count++){
        let score = Number(prompt());
        sum += score;
    }
    
    console.log(sum);


