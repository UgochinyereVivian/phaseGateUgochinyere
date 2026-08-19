
let getFirstVowelPosition = (name)=>{
    for(let index in name){
        switch(charArray[index].toLowerCase()){
            case 'a' : return index;
            case 'e' : return index;
            case 'i' : return index;
            case 'o' : return index;
            case 'u' : return index;
        }
                 
    return "invalid";

}
