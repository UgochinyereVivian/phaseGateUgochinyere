def is_even(number):
    count = 0
    for divider in range (1,number+1):
        if(number % divider == 0):
            count += 1
        if(count == 2):
            return True
