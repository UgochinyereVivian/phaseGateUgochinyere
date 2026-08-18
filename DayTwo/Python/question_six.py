def is_palindrome(number):

    if(number == str(number)[::-1]): return True

    return False



def isPrime(number):
    count = 0;
    for divisor in range(number+1):
        if(number % divisor == 0): count+=1;
            
    if(count == 2): return True;

    return False


def run_all(number):
    if(is_palindrome(number) and  isPrime(number)): return True
    return False



print(run_all(1234))
