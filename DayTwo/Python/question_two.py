def get_mean(number_one, number_two, number_three):
    sumation = number_one + number_two + number_three
    mean = sumation/3

    return f"mean is {mean}"


def get_median(number_one, number_two, number_three):
    array = [number_one, number_two, number_three]

    array = sort_the(array)

    median = array[len(array)//2] 
    for count in range(len(array)):
        if(array[count] == median):
            if(array[count] == array[0]): print("number_one holds the median")
            elif(array[count] == array[1]): print("number_two holds median")
            else: print("number_three holds median")
    return f"median is {array[len(array)//2]}"
    


def sort_the(array):
    for count in range(len(array)):
        for counter in range(len(array)):
            if(array[count] < array[counter]):
                temp = array[count]
                array[count] = array[counter]
                array[counter] = temp
    return array


print(get_mean(1,5,2))
print(get_median(2,5,1))
#print(sort_the([5,2,1]))
