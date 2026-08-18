let greet = (text_one, text_two)=>{
    
    interleaved_text = ""
    for(let count = 0; count < text_one.length; count++){

        if(count >= 2){
            interleaved_text += text_two[count]
            interleaved_text += text_one[count]
        }

        else{
            interleaved_text += text_one[count]
            interleaved_text += text_two[count]
        }

    }
    console.log(`\"${interleaved_text}\"`)       
}

    


greet("Hello", "World")
