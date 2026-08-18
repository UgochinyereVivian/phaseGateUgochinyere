let getAge = (sonsAge,fathersAge)=>{
    if(sonsAge < 0 || fathersAge <= 0) return;
    if(sonsAge > fathersAge) return;

    let twiceTheAge = fathersAge % sonsAge
    let twice = sonsAge * 2
    let difference = fathersAge - twice;

    if(twiceTheAge + fathersAge == sonsAge * 2)
        console.log(`father will be twice sons age in ${twiceTheAge} years time`)
    else if(twice > fathersAge){
       console.log(`father will be twice sons age in ${difference * - 1} years time`);
    }
    else
        console.log(`father was twice sons age in ${fathersAge - (sonsAge * 2)} years ago `)

}





getAge(60,16);


