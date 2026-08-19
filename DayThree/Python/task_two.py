def reverseInteger(number):
    stringNumber = str(number)
    reverse = ""

    for character in stringNumber:
        reverse = character + reverse;
    reverse = int(reverse)
    return reverse
