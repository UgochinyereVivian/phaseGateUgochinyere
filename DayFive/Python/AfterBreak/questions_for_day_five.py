def add_digits(number):
    new_number = str(number)
    result = 0
    while(len(new_number) > 1):
        for each in new_number:
            result += int(each)
        new_number = str(result)
        result = 0
    return new_number
    


def get_single_digit_in_array(array):
    count = 0
    single = 0
    for element in array:
        for ele in array:
            if(element == ele):
                count += 1
                single = element
        if(count == 1):
            break
        else:
            count = 0
            singe = 0
    return single


print(add_digits(38))
array = [1,2,2,3,3]
print(get_single_digit_in_array(array))



#def most_reoccuring(array):
#    for element in array:
#        for ele in array:
#            if(element[0] == ele[0] and element[0] == ele[0]):
#                count += 1
#                single = element
#        if(count == 1):
#            break
#    return single



#def most_reoccuring(array):
#    count = 0
#    while(count < len(array)):
#        for elements in array:
#            array_of_char = 
























