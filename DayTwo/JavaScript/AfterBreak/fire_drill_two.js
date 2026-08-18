let getAverage = (scoreOne, scoreTwo, scoreThree)=>{
    let sum = scoreOne + scoreTwo + scoreThree;
    let average = sum/3;


    if(average > 100 || average < 0) console.log("invalid hence 0");

    if(average >= 90 && average <= 100) return 'A';
    else if(average >= 80 && average < 90) return 'B';
    else if(average >= 70 && average < 80) return 'C';
    else if(average >= 60 && average < 70) return 'D';
    else if(average >= 0 && average < 60) return 'F';

  return '0';
}

console.log(getAverage(10,10,10))
