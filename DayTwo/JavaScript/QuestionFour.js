
let printNumbersReverseVersion = ()=>{
        reverse = "";

        for(let count = 0; count <= 100; count++){

            if(count % 3 == 0)
                   console.log("hello");
            if(count % 5 == 0)
                   console.log("world");
            if(count % 7 == 0)
                   console.log("hello");
            
            else{
                let newCount = String(count);
                let length = newCount.length
                for(let index = 0; index < newCount.length; index++){
                    reverse = newCount.charAt(index) + reverse;
                }
                  console.log(reverse);
            }
                     
            
        }
}


    printNumbersReverseVersion();


