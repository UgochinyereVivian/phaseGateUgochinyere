
console.log(get_mean(1,5,2))


function get_mean(number_one, number_two, number_three){
    let sumation = number_one + number_two + number_three
    let mean = sumation/3

    return `mean is ${mean}`
}

function get_median(number_one, number_two, number_three){
    let array = [number_one, number_two, number_three]
    array = sort_the(array)
    let index = (array.length/2)
    index = String(index)
    index = Number(index.charAt(0))

    
    let median = array[index] 
     for(let count = 0; count < array.length; count++){
        if (array[count] == Number(median)){
            if(array[count] == array[0]){console.log("number_one holds the median")}
            else if (array[count] == array[1]){console.log("number_two holds median")}
            else{console.log("number_three holds median")}
        }
     }
  
    return `median is ${array[index]}`
  }


function sort_the(array){
    for(let count = 0; count < array.length; count++){
        for(let counter = 0; counter < array.length; counter++){
            if(array[count] < array[counter]){
                let temp = array[count]
                array[count] = array[counter]
                array[counter] = temp
            }
        }
    }
    return array
 }



console.log(get_median(2,5,1))
//console.log(sort_the([5,2,1]))
