
const prompt = require("prompt-sync")()

    let count = 1;
    let sum = 0;

    for(; count < 11; count++){
        let score = Number(prompt("enter a number: "));
        sum += score;
    }
    let average = sum/count;
    console.log(`sum: ${sum}, average: ${average}`);


