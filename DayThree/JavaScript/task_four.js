
let countower = (name)=>{
    let count = 0;
    let stringArray = name.split("");
    for(let character : stringArray){
        if(character.equals(character.toLowerCase()))
            count++;
    }
    return count;

}
