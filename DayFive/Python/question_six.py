def find_largest(number_one, number_two, number_three):
    array = [number_one, number_two, number_three]
    largest = number_one
    for number in array:
        if(number > largest):
            largest  = number

    return largest
