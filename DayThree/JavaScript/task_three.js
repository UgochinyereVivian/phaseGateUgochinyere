
let countUpper = (name)=>{
    let count = 0;
    let stringArray = name.split("");
    for(let character of stringArray){
        if(character.equals(character.toUpperCase()))
            count++;
    }
    return count;

}

